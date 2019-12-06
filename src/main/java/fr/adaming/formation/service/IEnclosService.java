package fr.adaming.formation.service;

import java.util.List;
import fr.adaming.formation.model.Enclos;

public interface IEnclosService {

	public Enclos saveEnclos(Enclos enclos);

	public void deleteEnclos(long idEnclos);

	public Enclos getOneEnclos(long idEnclos);

	public List<Enclos> getAllEnclos();

	public Enclos updateEnclos(Enclos enclos);

	public void setSecteur(long idEnclos, long idSecteur);

}