package it.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.spring.model.Digimon;
import it.spring.repository.DigimonRepository;

@Service
@Transactional
public class DigimonService {
	@Autowired DigimonRepository repo;
	
	public void save(Digimon digimon) {
		repo.save(digimon);
	}
	
	public List<Digimon> listAll() {
		return (List<Digimon>) repo.findAll();
	}
	
	public Digimon get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}
