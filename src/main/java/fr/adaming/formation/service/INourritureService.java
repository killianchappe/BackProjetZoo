package fr.adaming.formation.service;

import java.util.List;
import fr.adaming.formation.model.Nourriture;

public interface INourritureService {

	public Nourriture saveNourriture(Nourriture nourriture);

	public void deleteNourriture(long idNourriture);

	public Nourriture getOneNourriture(long idNourriture);

	public List<Nourriture> getAllNourriture();

	public Nourriture updateNourriture(Nourriture nourriture);

}