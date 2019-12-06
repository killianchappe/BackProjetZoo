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
import fr.adaming.formation.model.Animal;
import fr.adaming.formation.service.IAnimalService;

@RestController
@RequestMapping("animal")
@CrossOrigin("http://localhost:4200")
public class AnimalController {

	@Autowired
	IAnimalService animalService;

	@GetMapping
	public List<Animal> getAll() {
		return animalService.getAllAnimal();
	}

	@GetMapping("{id}")
	public Animal getOne(@PathVariable long id) {
		return animalService.getOneAnimal(id);
	}

	@PostMapping
	public Animal addAnimal(@RequestBody Animal animal) {
		return animalService.saveAnimal(animal);
	}

	@PutMapping("{id}")
	public Animal updateAnimal(@RequestBody Animal animal, @PathVariable long id) {
		Animal animalActuel = new Animal();
		animalActuel = animalService.getOneAnimal(id);
		animalActuel.setNomAnimal(animal.getNomAnimal());
		animalActuel.setAgeAnimal(animal.getAgeAnimal());
		animalActuel.setEspeceAnimal(animal.getEspeceAnimal());
		animalActuel.setEnclosAnimal(animal.getEnclosAnimal());
		animalActuel.setNourritureAnimal(animal.getNourritureAnimal());
		return animalService.updateAnimal(animalActuel);
	}

	@DeleteMapping("{id}")
	public boolean deleteAnimal(@PathVariable long id) {
		try {
			animalService.deleteAnimal(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@PutMapping("{idAnimal}/setUser/{idEnclos}")
	public void setEnclos(@PathVariable long idAnimal, @PathVariable long idEnclos) {
		animalService.setEnclos(idAnimal, idEnclos);
	}

	@PutMapping("{idAnimal}/setEtat/{idNourriture}")
	public void setNourriture(@PathVariable long idAnimal, @PathVariable long idNourriture) {
		animalService.setNourriture(idAnimal, idNourriture);
	}

}