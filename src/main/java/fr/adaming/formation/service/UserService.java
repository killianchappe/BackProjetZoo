package fr.adaming.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.formation.model.Role;
import fr.adaming.formation.model.Secteur;
import fr.adaming.formation.model.User;
import fr.adaming.formation.repository.IRoleRepository;
import fr.adaming.formation.repository.ISecteurRepository;
import fr.adaming.formation.repository.IUserRepository;

@Service
public class UserService implements IUserService {

	@Autowired
	IUserRepository userRepository;
	@Autowired
	IRoleRepository roleRepository;
	@Autowired
	ISecteurRepository secteurRepository;

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(long idUser) {
		userRepository.deleteById(idUser);
	}

	@Override
	public User getOneUser(long idUser) {
		Optional<User> userOpional = userRepository.findById(idUser);
		User user = new User();
		if (userOpional.isPresent()) {
			user = userOpional.get();
		}
		return user;
	}

	@Override
	public List<User> getAllUser() {
		List<User> users = new ArrayList<User>();
		users = userRepository.findAll();
		return users;
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void setRole(long idUser, long idRole) {
		User user = userRepository.getOne(idUser);
		Role role = roleRepository.getOne(idRole);
		user.setRoleUser(role);
		userRepository.save(user);
	}

	@Override
	public void setSecteur(long idUser, long idSecteur) {
		User user = userRepository.getOne(idUser);
		Secteur secteur = secteurRepository.getOne(idSecteur);
		user.setSecteurUser(secteur);
		userRepository.save(user);
	}

}