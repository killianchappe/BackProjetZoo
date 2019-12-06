package fr.adaming.formation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_nourriture")
public class Nourriture implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idNourriture;
	private String nomNourriture;
	private double stockNourriture;

	// Associations
	public Nourriture() {
		super();
	}

	public Nourriture(String nomNourriture, double stockNourriture) {
		super();
		this.nomNourriture = nomNourriture;
		this.stockNourriture = stockNourriture;
	}

	public Nourriture(long idNourriture, String nomNourriture, double stockNourriture) {
		super();
		this.idNourriture = idNourriture;
		this.nomNourriture = nomNourriture;
		this.stockNourriture = stockNourriture;
	}

	// Getters et Setters
	public long getIdNourriture() {
		return idNourriture;
	}

	public void setIdNourriture(long idNourriture) {
		this.idNourriture = idNourriture;
	}

	public String getNomNourriture() {
		return nomNourriture;
	}

	public void setNomNourriture(String nomNourriture) {
		this.nomNourriture = nomNourriture;
	}

	public double getStockNourriture() {
		return stockNourriture;
	}

	public void setStockNourriture(double stockNourriture) {
		this.stockNourriture = stockNourriture;
	}

	// toString
	@Override
	public String toString() {
		return "Nourriture [idNourriture=" + idNourriture + ", nomNourriture=" + nomNourriture + ", stockNourriture="
				+ stockNourriture + "]";
	}

}