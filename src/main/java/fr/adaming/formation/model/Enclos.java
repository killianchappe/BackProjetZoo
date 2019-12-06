package fr.adaming.formation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "id_enclos")
public class Enclos implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEnclos;
	private int capaciteEnclos;
	private String nomEnclos;

	// Associations
	@OneToOne
	@JoinColumn(name = "idSecteur")
	private Secteur secteurEnclos;

	// Constructeurs
	public Enclos() {
		super();
	}

	public Enclos(int capaciteEnclos, String nomEnclos, Secteur secteurEnclos) {
		super();
		this.capaciteEnclos = capaciteEnclos;
		this.nomEnclos = nomEnclos;
		this.secteurEnclos = secteurEnclos;
	}

	public Enclos(long idEnclos, int capaciteEnclos, String nomEnclos, Secteur secteurEnclos) {
		super();
		this.idEnclos = idEnclos;
		this.capaciteEnclos = capaciteEnclos;
		this.nomEnclos = nomEnclos;
		this.secteurEnclos = secteurEnclos;
	}

	// Getters et Setters
	public long getIdEnclos() {
		return idEnclos;
	}

	public void setIdEnclos(long idEnclos) {
		this.idEnclos = idEnclos;
	}

	public int getCapaciteEnclos() {
		return capaciteEnclos;
	}

	public void setCapaciteEnclos(int capaciteEnclos) {
		this.capaciteEnclos = capaciteEnclos;
	}

	public String getNomEnclos() {
		return nomEnclos;
	}

	public void setNomEnclos(String nomEnclos) {
		this.nomEnclos = nomEnclos;
	}

	public Secteur getSecteurEnclos() {
		return secteurEnclos;
	}

	public void setSecteurEnclos(Secteur secteurEnclos) {
		this.secteurEnclos = secteurEnclos;
	}

	// toString
	@Override
	public String toString() {
		return "Enclos [idEnclos=" + idEnclos + ", capaciteEnclos=" + capaciteEnclos + ", nomEnclos=" + nomEnclos
				+ ", secteurEnclos=" + secteurEnclos + "]";
	}

}