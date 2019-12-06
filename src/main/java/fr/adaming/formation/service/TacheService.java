package fr.adaming.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.formation.model.Etat;
import fr.adaming.formation.model.Tache;
import fr.adaming.formation.model.User;
import fr.adaming.formation.repository.IEtatRepository;
import fr.adaming.formation.repository.ITacheRepository;
import fr.adaming.formation.repository.IUserRepository;

@Service
public class TacheService implements ITacheService {

	@Autowired
	ITacheRepository tacheRepository;
	@Autowired
	IEtatRepository etatRepository;
	@Autowired
	IUserRepository userRepository;

	@Override
	public Tache saveTache(Tache tache) {
		return tacheRepository.save(tache);
	}

	@Override
	public void deleteTache(long idTache) {
		tacheRepository.deleteById(idTache);
	}

	@Override
	public Tache getOneTache(long idTache) {
		Optional<Tache> tacheOpional = tacheRepository.findById(idTache);
		Tache tache = new Tache();
		if (tacheOpional.isPresent()) {
			tache = tacheOpional.get();
		}
		return tache;
	}

	@Override
	public List<Tache> getAllTache() {
		List<Tache> taches = new ArrayList<Tache>();
		taches = tacheRepository.findAll();
		return taches;
	}

	@Override
	public Tache updateTache(Tache tache) {
		return tacheRepository.save(tache);
	}

	@Override
	public void setEtat(long idTache, long idEtat) {
		Tache tache = tacheRepository.getOne(idTache);
		Etat etat = etatRepository.getOne(idEtat);
		tache.setEtatTache(etat);
		tacheRepository.save(tache);
	}

	@Override
	public void setUser(long idTache, long idUser) {
		Tache tache = tacheRepository.getOne(idTache);
		User user = userRepository.getOne(idUser);
		tache.setUserTache(user);
		tacheRepository.save(tache);
	}

}