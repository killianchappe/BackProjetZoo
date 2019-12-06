package fr.adaming.formation.service;

import java.util.List;
import fr.adaming.formation.model.Etat;

public interface IEtatService {

	public Etat saveEtat(Etat etat);

	public void deleteEtat(long idEtat);

	public Etat getOneEtat(long idEtat);

	public List<Etat> getAllEtat();

	public Etat updateEtat(Etat etat);

}