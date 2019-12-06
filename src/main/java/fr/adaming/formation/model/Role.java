package fr.adaming.formation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_role")
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idRole;
	private String libelleRole;

	// Constructeurs
	public Role() {
		super();
	}

	public Role(String libelleRole) {
		super();
		this.libelleRole = libelleRole;
	}

	public Role(long idRole, String libelleRole) {
		super();
		this.idRole = idRole;
		this.libelleRole = libelleRole;
	}

	// Getters et Setters
	public long getIdRole() {
		return idRole;
	}

	public void setIdRole(long idRole) {
		this.idRole = idRole;
	}

	public String getLibelleRole() {
		return libelleRole;
	}

	public void setLibelleRole(String libelleRole) {
		this.libelleRole = libelleRole;
	}

	// toString
	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", libelleRole=" + libelleRole + "]";
	}

}