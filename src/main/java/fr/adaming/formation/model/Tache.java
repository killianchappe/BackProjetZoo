package fr.adaming.formation.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_tache")
public class Tache implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTache;
	private String libelleTache;
	private int dureeTache;
	// ATTENTION : peut-être besoin d'importer plutôt java.sql.Date ?
	private Date dateTache;
	private String commentaireTache;

	// Associations
	@ManyToOne
	@JoinColumn(name = "idUser")
	private User userTache;
	@OneToOne
	@JoinColumn(name = "idEtat")
	private Etat etatTache;

	// Constructeurs
	public Tache() {
		super();
	}

	public Tache(String libelleTache, int dureeTache, Date dateTache, String commentaireTache, User userTache,
			Etat etatTache) {
		super();
		this.libelleTache = libelleTache;
		this.dureeTache = dureeTache;
		this.dateTache = dateTache;
		this.commentaireTache = commentaireTache;
		this.userTache = userTache;
		this.etatTache = etatTache;
	}

	public Tache(long idTache, String libelleTache, int dureeTache, Date dateTache, String commentaireTache,
			User userTache, Etat etatTache) {
		super();
		this.idTache = idTache;
		this.libelleTache = libelleTache;
		this.dureeTache = dureeTache;
		this.dateTache = dateTache;
		this.commentaireTache = commentaireTache;
		this.userTache = userTache;
		this.etatTache = etatTache;
	}

	// Getters et Setters
	public long getIdTache() {
		return idTache;
	}

	public void setIdTache(long idTache) {
		this.idTache = idTache;
	}

	public String getLibelleTache() {
		return libelleTache;
	}

	public void setLibelleTache(String libelleTache) {
		this.libelleTache = libelleTache;
	}

	public int getDureeTache() {
		return dureeTache;
	}

	public void setDureeTache(int dureeTache) {
		this.dureeTache = dureeTache;
	}

	public Date getDateTache() {
		return dateTache;
	}

	public void setDateTache(Date dateTache) {
		this.dateTache = dateTache;
	}

	public String getCommentaireTache() {
		return commentaireTache;
	}

	public void setCommentaireTache(String commentaireTache) {
		this.commentaireTache = commentaireTache;
	}

	public User getUserTache() {
		return userTache;
	}

	public void setUserTache(User userTache) {
		this.userTache = userTache;
	}

	public Etat getEtatTache() {
		return etatTache;
	}

	public void setEtatTache(Etat etatTache) {
		this.etatTache = etatTache;
	}

	// toString
	@Override
	public String toString() {
		return "Tache [idTache=" + idTache + ", libelleTache=" + libelleTache + ", dureeTache=" + dureeTache
				+ ", dateTache=" + dateTache + ", commentaireTache=" + commentaireTache + ", userTache=" + userTache
				+ ", etatTache=" + etatTache + "]";
	}

}