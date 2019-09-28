package com.devtwins.landingpage.model;

import java.util.Calendar;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Membro {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nome;
	private String linkedin;
	private String github;
	private String facebook;
	private String instagram;
	private String twitter;
	private String cidade;
	private String estado;
	private String descricao;

	@Basic
	@Temporal(TemporalType.DATE)
	private Calendar dt_nascimento;

	// Constructors

	public Membro() {}

	public Membro(Long id, String nome, String linkedin, String github, String facebook, String instagram, String twitter, String cidade, String estado, String descricao,
			Calendar dt_nascimento) {
		this.id = id;
		this.nome = nome;
		this.linkedin = linkedin;
		this.github = github;
		this.facebook = facebook;
		this.instagram = instagram;
		this.twitter = twitter;
		this.cidade = cidade;
		this.estado = estado;
		this.descricao = descricao;
		this.dt_nascimento = dt_nascimento;
	}

	// Getters and Setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLinkedin() {
		return linkedin;
	}

	public void setLinkedin(String linkedin) {
		this.linkedin = linkedin;
	}

	public String getGithub() {
		return github;
	}

	public void setGithub(String github) {
		this.github = github;
	}

	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Calendar dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

}
