package fr.adaming.formation.service;

import java.util.List;
import fr.adaming.formation.model.Secteur;

public interface ISecteurService {

	public Secteur saveSecteur(Secteur secteur);

	public void deleteSecteur(long idSecteur);

	public Secteur getOneSecteur(long idSecteur);

	public List<Secteur> getAllSecteur();

	public Secteur updateSecteur(Secteur secteur);

}