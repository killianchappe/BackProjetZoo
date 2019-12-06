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
import fr.adaming.formation.model.Nourriture;
import fr.adaming.formation.service.INourritureService;

@RestController
@RequestMapping("nourriture")
@CrossOrigin("http://localhost:4200")
public class NourritureController {

	@Autowired
	INourritureService nourritureService;

	@GetMapping
	public List<Nourriture> getAll() {
		return nourritureService.getAllNourriture();
	}

	@GetMapping("{id}")
	public Nourriture getOne(@PathVariable long id) {
		return nourritureService.getOneNourriture(id);
	}

	@PostMapping
	public Nourriture addNourriture(@RequestBody Nourriture nourriture) {
		return nourritureService.saveNourriture(nourriture);
	}

	@PutMapping("{id}")
	public Nourriture updateNourriture(@RequestBody Nourriture nourriture, @PathVariable long id) {
		Nourriture nourritureActuel = new Nourriture();
		nourritureActuel = nourritureService.getOneNourriture(id);
		nourritureActuel.setNomNourriture(nourriture.getNomNourriture());
		nourritureActuel.setStockNourriture(nourriture.getStockNourriture());
		return nourritureService.updateNourriture(nourritureActuel);
	}

	@DeleteMapping("{id}")
	public boolean deleteNourriture(@PathVariable long id) {
		try {
			nourritureService.deleteNourriture(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}