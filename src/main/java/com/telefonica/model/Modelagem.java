package com.telefonica.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonProperty;

 
@Entity
@Table(name = "tb_job")
public class Modelagem {

	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	
	@Id
	private Long id;
	
	@JsonProperty("Descrição: ")
	@Column(name = "descricao")
	private String descricao;

	@JsonProperty("Tempo estimado: ")
	@Column(name = "tempo")
	private int tempo;

	@JsonProperty("Data Máxima de conclusão do Job: ")
	@Column(name = "data")
	@DateTimeFormat
	public Date data;

	 

	public Long getId() {
		return id;
	}

	public void getId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Modelagem(Long id, String descricao, int tempo, Date data) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.tempo = tempo;
		this.data = data;
	}

	public Modelagem() {
		super();
	}

 

}
