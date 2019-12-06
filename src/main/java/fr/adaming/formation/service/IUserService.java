package fr.adaming.formation.service;

import java.util.List;
import fr.adaming.formation.model.User;

public interface IUserService {

	public User saveUser(User user);

	public void deleteUser(long idUser);

	public User getOneUser(long idUser);

	public List<User> getAllUser();

	public User updateUser(User user);

	public void setRole(long idUser, long idRole);

	public void setSecteur(long idUser, long idSecteur);

}