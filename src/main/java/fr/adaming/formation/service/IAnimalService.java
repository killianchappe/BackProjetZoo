package fr.adaming.formation.service;

import java.util.List;
import fr.adaming.formation.model.Animal;

public interface IAnimalService {

	public Animal saveAnimal(Animal animal);

	public void deleteAnimal(long idAnimal);

	public Animal getOneAnimal(long idAnimal);

	public List<Animal> getAllAnimal();

	public Animal updateAnimal(Animal animal);

	public void setEnclos(long idAnimal, long idEnclos);

	public void setNourriture(long idAnimal, long idNourriture);
}