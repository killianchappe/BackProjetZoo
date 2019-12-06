package fr.adaming.formation.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUser;
	private String nomUser;
	private String prenomUser;
	private String emailUser;
	private String loginUser;
	private String pwdUser;

	// Associations
	@OneToOne
	@JoinColumn(name = "idRole")
	private Role roleUser;
	@ManyToOne
	@JoinColumn(name = "idSecteur")
	private Secteur secteurUser;

	// Constructeurs
	public User() {
		super();
	}

	public User(String nomUser, String prenomUser, String emailUser, String loginUser, String pwdUser, Role roleUser,
			Secteur secteurUser) {
		super();
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.emailUser = emailUser;
		this.loginUser = loginUser;
		this.pwdUser = pwdUser;
		this.roleUser = roleUser;
		this.secteurUser = secteurUser;
	}

	public User(long idUser, String nomUser, String prenomUser, String emailUser, String loginUser, String pwdUser,
			Role roleUser, Secteur secteurUser) {
		super();
		this.idUser = idUser;
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.emailUser = emailUser;
		this.loginUser = loginUser;
		this.pwdUser = pwdUser;
		this.roleUser = roleUser;
		this.secteurUser = secteurUser;
	}

	// Getters et Setters
	public long getIdUser() {
		return idUser;
	}

	public void setIdUser(long idUser) {
		this.idUser = idUser;
	}

	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public String getPrenomUser() {
		return prenomUser;
	}

	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}

	public String getEmailUser() {
		return emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	public String getLoginUser() {
		return loginUser;
	}

	public void setLoginUser(String loginUser) {
		this.loginUser = loginUser;
	}

	public String getPwdUser() {
		return pwdUser;
	}

	public void setPwdUser(String pwdUser) {
		this.pwdUser = pwdUser;
	}

	public Role getRoleUser() {
		return roleUser;
	}

	public void setRoleUser(Role roleUser) {
		this.roleUser = roleUser;
	}

	public Secteur getSecteurUser() {
		return secteurUser;
	}

	public void setSecteurUser(Secteur secteurUser) {
		this.secteurUser = secteurUser;
	}

	// toString
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nomUser=" + nomUser + ", prenomUser=" + prenomUser + ", emailUser="
				+ emailUser + ", loginUser=" + loginUser + ", pwdUser=" + pwdUser + ", roleUser=" + roleUser
				+ ", secteurUser=" + secteurUser + "]";
	}

}