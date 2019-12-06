package fr.adaming.formation.service;

import java.util.List;
import fr.adaming.formation.model.Role;

public interface IRoleService {

	public Role saveRole(Role role);

	public void deleteRole(long idRole);

	public Role getOneRole(long idRole);

	public List<Role> getAllRole();

	public Role updateRole(Role role);

}