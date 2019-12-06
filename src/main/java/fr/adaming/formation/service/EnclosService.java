package fr.adaming.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.formation.model.Enclos;
import fr.adaming.formation.model.Secteur;
import fr.adaming.formation.repository.IEnclosRepository;
import fr.adaming.formation.repository.ISecteurRepository;

@Service
public class EnclosService implements IEnclosService {

	@Autowired
	IEnclosRepository enclosRepository;
	@Autowired
	ISecteurRepository secteurRepository;

	@Override
	public Enclos saveEnclos(Enclos enclos) {
		return enclosRepository.save(enclos);
	}

	@Override
	public void deleteEnclos(long idEnclos) {
		enclosRepository.deleteById(idEnclos);
	}

	@Override
	public Enclos getOneEnclos(long idEnclos) {
		Optional<Enclos> enclosOpional = enclosRepository.findById(idEnclos);
		Enclos enclos = new Enclos();
		if (enclosOpional.isPresent()) {
			enclos = enclosOpional.get();
		}
		return enclos;
	}

	@Override
	public List<Enclos> getAllEnclos() {
		List<Enclos> enclos = new ArrayList<Enclos>();
		enclos = enclosRepository.findAll();
		return enclos;
	}

	@Override
	public Enclos updateEnclos(Enclos enclos) {
		return enclosRepository.save(enclos);
	}

	@Override
	public void setSecteur(long idEnclos, long idSecteur) {
		Enclos enclos = enclosRepository.getOne(idEnclos);
		Secteur secteur = secteurRepository.getOne(idSecteur);
		enclos.setSecteurEnclos(secteur);
		enclosRepository.save(enclos);
	}

}