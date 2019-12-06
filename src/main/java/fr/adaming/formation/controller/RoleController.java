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
import fr.adaming.formation.model.Role;
import fr.adaming.formation.service.IRoleService;

@RestController
@RequestMapping("role")
@CrossOrigin("http://localhost:4200")
public class RoleController {

	@Autowired
	IRoleService roleService;

	@GetMapping
	public List<Role> getAll() {
		return roleService.getAllRole();
	}

	@GetMapping("{id}")
	public Role getOne(@PathVariable long id) {
		return roleService.getOneRole(id);
	}

	@PostMapping
	public Role addRole(@RequestBody Role role) {
		return roleService.saveRole(role);
	}

	@PutMapping("{id}")
	public Role updateRole(@RequestBody Role role, @PathVariable long id) {
		Role roleActuel = new Role();
		roleActuel = roleService.getOneRole(id);
		roleActuel.setLibelleRole(role.getLibelleRole());
		return roleService.updateRole(roleActuel);
	}

	@DeleteMapping("{id}")
	public boolean deleteRole(@PathVariable long id) {
		try {
			roleService.deleteRole(id);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

}