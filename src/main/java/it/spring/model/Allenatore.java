package it.spring.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Allenatore {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	@OneToMany
	private List<Digimon> digimon;
	
	
	public Allenatore() {
	}

	protected Allenatore(Long id, String nome,List<Digimon> digimon) {
		this.nome = nome;
		this.id = id;
		this.digimon = digimon;
	}

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

	public List<Digimon> getDigimon() {
		return digimon;
	}

	public void setDigimon(List<Digimon> digimon) {
		this.digimon = digimon;
	}
	
}
