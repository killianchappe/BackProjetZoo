package fr.adaming.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.formation.model.Etat;
import fr.adaming.formation.repository.IEtatRepository;

@Service
public class EtatService implements IEtatService {

	@Autowired
	IEtatRepository etatRepository;

	@Override
	public Etat saveEtat(Etat etat) {
		return etatRepository.save(etat);
	}

	@Override
	public void deleteEtat(long idEtat) {
		etatRepository.deleteById(idEtat);
	}

	@Override
	public Etat getOneEtat(long idEtat) {
		Optional<Etat> etatOpional = etatRepository.findById(idEtat);
		Etat etat = new Etat();
		if (etatOpional.isPresent()) {
			etat = etatOpional.get();
		}
		return etat;
	}

	@Override
	public List<Etat> getAllEtat() {
		List<Etat> etats = new ArrayList<Etat>();
		etats = etatRepository.findAll();
		return etats;
	}

	@Override
	public Etat updateEtat(Etat etat) {
		return etatRepository.save(etat);
	}

}