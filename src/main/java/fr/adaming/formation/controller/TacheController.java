package fr.adaming.formation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.adaming.formation.model.Tache;
import fr.adaming.formation.service.ITacheService;

@RestController
@RequestMapping("tache")
@CrossOrigin("http://localhost:4200")
public class TacheController {

	@Autowired
	ITacheService tacheService;

	@GetMapping
	public List<Tache> getAll() {
		return tacheService.getAllTache();
	}

	@GetMapping("{id}")
	public Tache getOne(@PathVariable long id) {
		return tacheService.getOneTache(id);
	}

	@PostMapping
	public Tache addTache(@RequestBody Tache tache) {
		return tacheService.saveTache(tache);
	}

	@PutMapping("{id}")
	public Tache updateTache(@RequestBody Tache tache, @PathVariable long id) {
		Tache tacheActuel = new Tache();
		tacheActuel = tacheService.getOneTache(id);
		tacheActuel.setLibelleTache(tache.getLibelleTache());
		tacheActuel.setCommentaireTache(tache.getCommentaireTache());
		tacheActuel.setDateTache(tache.getDateTache());
		tacheActuel.setDureeTache(tache.getDureeTache());
		tacheActuel.setEtatTache(tache.getEtatTache());
		tacheActuel.setUserTache(tache.getUserTache());
		return tacheService.updateTache(tacheActuel);
	}

	@DeleteMapping("{id}")
	public boolean deleteTache(@PathVariable long id) {
		try {
			tacheService.deleteTache(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@PutMapping("{idTache}/setUser/{idUser}")
	public void setUser(@PathVariable long idTache, @PathVariable long idUser) {
		tacheService.setUser(idTache, idUser);
	}

	@PutMapping("{idTache}/setEtat/{idEtat}")
	public void setEtat(@PathVariable long idTache, @PathVariable long idEtat) {
		tacheService.setEtat(idTache, idEtat);
	}

}