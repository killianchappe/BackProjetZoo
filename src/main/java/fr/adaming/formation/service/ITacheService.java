package fr.adaming.formation.service;

import java.util.List;
import fr.adaming.formation.model.Tache;

public interface ITacheService {

	public Tache saveTache(Tache tache);

	public void deleteTache(long idTache);

	public Tache getOneTache(long idTache);

	public List<Tache> getAllTache();

	public Tache updateTache(Tache tache);

	public void setEtat(long idTache, long idEtat);

	public void setUser(long idTache, long idUser);

}