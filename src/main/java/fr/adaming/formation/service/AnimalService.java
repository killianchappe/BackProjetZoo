package fr.adaming.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.formation.model.Animal;
import fr.adaming.formation.model.Enclos;
import fr.adaming.formation.model.Nourriture;
import fr.adaming.formation.repository.IAnimalRepository;
import fr.adaming.formation.repository.IEnclosRepository;
import fr.adaming.formation.repository.INourritureRepository;

@Service
public class AnimalService implements IAnimalService {

	@Autowired
	IAnimalRepository animalRepository;
	@Autowired
	IEnclosRepository enclosRepository;
	@Autowired
	INourritureRepository nourritureRepository;

	@Override
	public Animal saveAnimal(Animal animal) {
		return animalRepository.save(animal);
	}

	@Override
	public void deleteAnimal(long idAnimal) {
		animalRepository.deleteById(idAnimal);
	}

	@Override
	public Animal getOneAnimal(long idAnimal) {
		Optional<Animal> animalOpional = animalRepository.findById(idAnimal);
		Animal animal = new Animal();
		if (animalOpional.isPresent()) {
			animal = animalOpional.get();
		}
		return animal;
	}

	@Override
	public List<Animal> getAllAnimal() {
		List<Animal> animaux = new ArrayList<Animal>();
		animaux = animalRepository.findAll();
		return animaux;
	}

	@Override
	public Animal updateAnimal(Animal animal) {
		return animalRepository.save(animal);
	}

	@Override
	public void setEnclos(long idAnimal, long idEnclos) {
		Animal animal = animalRepository.getOne(idAnimal);
		Enclos enclos = enclosRepository.getOne(idEnclos);
		animal.setEnclosAnimal(enclos);
		animalRepository.save(animal);
	}

	@Override
	public void setNourriture(long idAnimal, long idNourriture) {
		Animal animal = animalRepository.getOne(idAnimal);
		Nourriture nourriture = nourritureRepository.getOne(idNourriture);
		animal.setNourritureAnimal(nourriture);
		animalRepository.save(animal);
	}

}