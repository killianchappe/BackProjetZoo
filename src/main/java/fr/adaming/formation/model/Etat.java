package fr.adaming.formation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_etat")
public class Etat implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEtat;
	private String libelleEtat;

	// Constructeurs
	public Etat() {
		super();
	}

	public Etat(String libelleEtat) {
		super();
		this.libelleEtat = libelleEtat;
	}

	public Etat(long idEtat, String libelleEtat) {
		super();
		this.idEtat = idEtat;
		this.libelleEtat = libelleEtat;
	}

	// Getters et Setters
	public long getIdEtat() {
		return idEtat;
	}

	public void setIdEtat(long idEtat) {
		this.idEtat = idEtat;
	}

	public String getLibelleEtat() {
		return libelleEtat;
	}

	public void setLibelleEtat(String libelleEtat) {
		this.libelleEtat = libelleEtat;
	}

	// toString
	@Override
	public String toString() {
		return "Etat [idEtat=" + idEtat + ", libelleEtat=" + libelleEtat + "]";
	}

}