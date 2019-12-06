package fr.adaming.formation.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.adaming.formation.model.User;
import fr.adaming.formation.service.IUserService;

@RestController
@RequestMapping("user")
@CrossOrigin("http://localhost:4200")
public class UserController {

	@Autowired
	IUserService userService;

	@GetMapping
	public List<User> getAll() {
		return userService.getAllUser();
	}

	@GetMapping("{id}")
	public User getOne(@PathVariable long id) {
		return userService.getOneUser(id);
	}

	@PostMapping
	public User addUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@PutMapping("{id}")
	public User updateUser(@RequestBody User user, @PathVariable long id) {
		User userActuel = new User();
		userActuel = userService.getOneUser(id);
		userActuel.setEmailUser(user.getEmailUser());
		userActuel.setLoginUser(user.getLoginUser());
		userActuel.setPwdUser(user.getPwdUser());
		userActuel.setNomUser(user.getNomUser());
		userActuel.setPrenomUser(user.getPrenomUser());
		userActuel.setRoleUser(user.getRoleUser());
		userActuel.setSecteurUser(user.getSecteurUser());
		return userService.updateUser(userActuel);
	}

	@DeleteMapping("{id}")
	public boolean deleteUser(@PathVariable long id) {
		try {
			userService.deleteUser(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	@PutMapping("{idUser}/setRole/{idRole}")
	public void setRole(@PathVariable long idUser, @PathVariable long idRole) {
		userService.setRole(idUser, idRole);
	}

	@PutMapping("{idUser}/setSecteur/{idSecteur}")
	public void setSecteur(@PathVariable long idUser, @PathVariable long idSecteur) {
		userService.setSecteur(idUser, idSecteur);
	}

}
