package fr.adaming.formation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_secteur")
public class Secteur implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idSecteur;
	private String nomSecteur;

	// Constructeurs
	public Secteur() {
		super();
	}

	public Secteur(String nomSecteur) {
		super();
		this.nomSecteur = nomSecteur;
	}

	public Secteur(long idSecteur, String nomSecteur) {
		super();
		this.idSecteur = idSecteur;
		this.nomSecteur = nomSecteur;
	}

	// Getters et Setters
	public long getIdSecteur() {
		return idSecteur;
	}

	public void setIdSecteur(long idSecteur) {
		this.idSecteur = idSecteur;
	}

	public String getNomSecteur() {
		return nomSecteur;
	}

	public void setNomSecteur(String nomSecteur) {
		this.nomSecteur = nomSecteur;
	}

	// toString
	@Override
	public String toString() {
		return "Secteur [idSecteur=" + idSecteur + ", nomSecteur=" + nomSecteur + "]";
	}

}