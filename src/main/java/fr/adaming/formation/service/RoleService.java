package fr.adaming.formation.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.adaming.formation.model.Role;
import fr.adaming.formation.repository.IRoleRepository;

@Service
public class RoleService implements IRoleService {

	@Autowired
	IRoleRepository roleRepository;

	@Override
	public Role saveRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public void deleteRole(long idRole) {
		roleRepository.deleteById(idRole);
	}

	@Override
	public Role getOneRole(long idRole) {
		Optional<Role> roleOpional = roleRepository.findById(idRole);
		Role role = new Role();
		if (roleOpional.isPresent()) {
			role = roleOpional.get();
		}
		return role;
	}

	@Override
	public List<Role> getAllRole() {
		List<Role> roles = new ArrayList<Role>();
		roles = roleRepository.findAll();
		return roles;
	}

	@Override
	public Role updateRole(Role role) {
		return roleRepository.save(role);
	}

}