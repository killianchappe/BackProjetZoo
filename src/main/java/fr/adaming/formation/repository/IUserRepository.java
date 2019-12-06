package fr.adaming.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.adaming.formation.model.User;

public interface IUserRepository extends JpaRepository<User, Long> {

}