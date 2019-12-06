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
import fr.adaming.formation.model.Etat;
import fr.adaming.formation.service.IEtatService;

@RestController
@RequestMapping("etat")
@CrossOrigin("http://localhost:4200")
public class EtatController {

	@Autowired
	IEtatService etatService;

	@GetMapping
	public List<Etat> getAll() {
		return etatService.getAllEtat();
	}

	@GetMapping("{id}")
	public Etat getOne(@PathVariable long id) {
		return etatService.getOneEtat(id);
	}

	@PostMapping
	public Etat addEtat(@RequestBody Etat etat) {
		return etatService.saveEtat(etat);
	}

	@PutMapping("{id}")
	public Etat updateEtat(@RequestBody Etat etat, @PathVariable long id) {
		Etat etatActuel = new Etat();
		etatActuel = etatService.getOneEtat(id);
		etatActuel.setLibelleEtat(etat.getLibelleEtat());
		return etatService.updateEtat(etatActuel);
	}

	@DeleteMapping("{id}")
	public boolean deleteEtat(@PathVariable long id) {
		try {
			etatService.deleteEtat(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}