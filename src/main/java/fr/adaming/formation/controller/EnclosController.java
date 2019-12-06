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
import fr.adaming.formation.model.Enclos;
import fr.adaming.formation.service.IEnclosService;

@RestController
@RequestMapping("enclos")
@CrossOrigin("http://localhost:4200")
public class EnclosController {

	@Autowired
	IEnclosService enclosService;

	@GetMapping
	public List<Enclos> getAll() {
		return enclosService.getAllEnclos();
	}

	@GetMapping("{id}")
	public Enclos getOne(@PathVariable long id) {
		return enclosService.getOneEnclos(id);
	}

	@PostMapping
	public Enclos addEnclos(@RequestBody Enclos enclos) {
		return enclosService.saveEnclos(enclos);
	}

	@PutMapping("{id}")
	public Enclos updateEnclos(@RequestBody Enclos enclos, @PathVariable long id) {
		Enclos enclosActuel = new Enclos();
		enclosActuel = enclosService.getOneEnclos(id);
		enclosActuel.setNomEnclos(enclos.getNomEnclos());
		enclosActuel.setCapaciteEnclos(enclos.getCapaciteEnclos());
		enclosActuel.setSecteurEnclos(enclos.getSecteurEnclos());
		return enclosService.updateEnclos(enclosActuel);
	}

	@DeleteMapping("{id}")
	public boolean deleteEnclos(@PathVariable long id) {
		try {
			enclosService.deleteEnclos(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@PutMapping("{idEnclos}/setSecteur/{idSecteur}")
	public void setSecteur(@PathVariable long idEnclos, @PathVariable long idSecteur) {
		enclosService.setSecteur(idEnclos, idSecteur);
	}

}