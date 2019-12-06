package fr.adaming.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.formation.model.Secteur;
import fr.adaming.formation.repository.ISecteurRepository;

@Service
public class SecteurService implements ISecteurService {

	@Autowired
	ISecteurRepository secteurRepository;

	@Override
	public Secteur saveSecteur(Secteur secteur) {
		return secteurRepository.save(secteur);
	}

	@Override
	public void deleteSecteur(long idSecteur) {
		secteurRepository.deleteById(idSecteur);
	}

	@Override
	public Secteur getOneSecteur(long idSecteur) {
		Optional<Secteur> secteurOpional = secteurRepository.findById(idSecteur);
		Secteur secteur = new Secteur();
		if (secteurOpional.isPresent()) {
			secteur = secteurOpional.get();
		}
		return secteur;
	}

	@Override
	public List<Secteur> getAllSecteur() {
		List<Secteur> secteurs = new ArrayList<Secteur>();
		secteurs = secteurRepository.findAll();
		return secteurs;
	}

	@Override
	public Secteur updateSecteur(Secteur secteur) {
		return secteurRepository.save(secteur);
	}
	
}