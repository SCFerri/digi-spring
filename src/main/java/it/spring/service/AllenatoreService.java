package it.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.spring.model.Allenatore;
import it.spring.repository.AllenatoreRepository;

@Service
@Transactional
public class AllenatoreService {
	@Autowired AllenatoreRepository repo;
	
	public void save(Allenatore allenatore) {
		repo.save(allenatore);
	}
	
	public List<Allenatore> listAll() {
		return (List<Allenatore>) repo.findAll();
	}
	
	public Allenatore get(Long id) {
		return repo.findById(id).get();
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}
}