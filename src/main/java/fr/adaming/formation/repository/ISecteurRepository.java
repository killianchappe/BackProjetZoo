package fr.adaming.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import fr.adaming.formation.model.Secteur;

public interface ISecteurRepository extends JpaRepository<Secteur, Long> {

}