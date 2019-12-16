package fr.adaming.formation.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import fr.adaming.formation.model.User;

public interface IUserRepository extends JpaRepository<User, Long> {

	public List<User> findByloginUser(String loginUser);

	public boolean existsUserByloginUser(String loginUser);

	public User findByLoginUserAndPwdUser(String loginUser, String pwdUser);

}