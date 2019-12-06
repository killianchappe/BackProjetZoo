package fr.adaming.formation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_animal")
public class Animal implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAnimal;
	private String nomAnimal;
	private String especeAnimal;
	private int ageAnimal;

	// Associations
	@ManyToOne
	@JoinColumn(name = "idEnclos")
	private Enclos enclosAnimal;
	@ManyToOne
	@JoinColumn(name = "idNourriture")
	private Nourriture nourritureAnimal;

	// Constructeurs
	public Animal() {
		super();
	}

	public Animal(String nomAnimal, String especeAnimal, int ageAnimal, Enclos enclosAnimal,
			Nourriture nourritureAnimal) {
		super();
		this.nomAnimal = nomAnimal;
		this.especeAnimal = especeAnimal;
		this.ageAnimal = ageAnimal;
		this.enclosAnimal = enclosAnimal;
		this.nourritureAnimal = nourritureAnimal;
	}

	public Animal(long idAnimal, String nomAnimal, String especeAnimal, int ageAnimal, Enclos enclosAnimal,
			Nourriture nourritureAnimal) {
		super();
		this.idAnimal = idAnimal;
		this.nomAnimal = nomAnimal;
		this.especeAnimal = especeAnimal;
		this.ageAnimal = ageAnimal;
		this.enclosAnimal = enclosAnimal;
		this.nourritureAnimal = nourritureAnimal;
	}

	// Getters et Setters
	public long getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(long idAnimal) {
		this.idAnimal = idAnimal;
	}

	public String getNomAnimal() {
		return nomAnimal;
	}

	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}

	public String getEspeceAnimal() {
		return especeAnimal;
	}

	public void setEspeceAnimal(String especeAnimal) {
		this.especeAnimal = especeAnimal;
	}

	public int getAgeAnimal() {
		return ageAnimal;
	}

	public void setAgeAnimal(int ageAnimal) {
		this.ageAnimal = ageAnimal;
	}

	public Enclos getEnclosAnimal() {
		return enclosAnimal;
	}

	public void setEnclosAnimal(Enclos enclosAnimal) {
		this.enclosAnimal = enclosAnimal;
	}

	public Nourriture getNourritureAnimal() {
		return nourritureAnimal;
	}

	public void setNourritureAnimal(Nourriture nourritureAnimal) {
		this.nourritureAnimal = nourritureAnimal;
	}

	// toString
	@Override
	public String toString() {
		return "Animal [idAnimal=" + idAnimal + ", nomAnimal=" + nomAnimal + ", especeAnimal=" + especeAnimal
				+ ", ageAnimal=" + ageAnimal + ", enclosAnimal=" + enclosAnimal + ", nourritureAnimal="
				+ nourritureAnimal + "]";
	}

}