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
import fr.adaming.formation.model.Secteur;
import fr.adaming.formation.service.ISecteurService;

@RestController
@RequestMapping("secteur")
@CrossOrigin("http://localhost:4200")
public class SecteurController {

	@Autowired
	ISecteurService secteurService;

	@GetMapping
	public List<Secteur> getAll() {
		return secteurService.getAllSecteur();
	}

	@GetMapping("{id}")
	public Secteur getOne(@PathVariable long id) {
		return secteurService.getOneSecteur(id);
	}

	@PostMapping
	public Secteur addSecteur(@RequestBody Secteur secteur) {
		return secteurService.saveSecteur(secteur);
	}

	@PutMapping("{id}")
	public Secteur updateSecteur(@RequestBody Secteur secteur, @PathVariable long id) {
		Secteur secteurActuel = new Secteur();
		secteurActuel = secteurService.getOneSecteur(id);
		secteurActuel.setNomSecteur(secteur.getNomSecteur());
		return secteurService.updateSecteur(secteurActuel);
	}

	@DeleteMapping("{id}")
	public boolean deleteSecteur(@PathVariable long id) {
		try {
			secteurService.deleteSecteur(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}