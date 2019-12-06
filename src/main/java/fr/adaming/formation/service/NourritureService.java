package fr.adaming.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.formation.model.Nourriture;
import fr.adaming.formation.repository.INourritureRepository;

@Service
public class NourritureService implements INourritureService {

	@Autowired
	INourritureRepository nourritureRepository;

	@Override
	public Nourriture saveNourriture(Nourriture nourriture) {
		return nourritureRepository.save(nourriture);
	}

	@Override
	public void deleteNourriture(long idNourriture) {
		nourritureRepository.deleteById(idNourriture);
	}

	@Override
	public Nourriture getOneNourriture(long idNourriture) {
		Optional<Nourriture> nourritureOpional = nourritureRepository.findById(idNourriture);
		Nourriture nourriture = new Nourriture();
		if (nourritureOpional.isPresent()) {
			nourriture = nourritureOpional.get();
		}
		return nourriture;
	}

	@Override
	public List<Nourriture> getAllNourriture() {
		List<Nourriture> nourritures = new ArrayList<Nourriture>();
		nourritures = nourritureRepository.findAll();
		return nourritures;
	}

	@Override
	public Nourriture updateNourriture(Nourriture nourriture) {
		return nourritureRepository.save(nourriture);
	}

}