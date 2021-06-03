package com.example.demo.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Attraction;
import com.example.demo.repositories.AttractionRepository;
import com.example.demo.services.GenericService;

public class AttractionServiceImpl implements GenericService<Attraction>{

	
    @Autowired
    private AttractionRepository attractionRepository;

	@Override
	public List<Attraction> getAll() {
		// TODO Auto-generated method stub
		return attractionRepository.findAll() ;
	}

	@Override
	public Attraction getById(Long id) {
		// TODO Auto-generated method stub
		return attractionRepository.findById(id).get();
	}

	@Override
	public Attraction create(Attraction t) {
		// TODO Auto-generated method stub
		return attractionRepository.save(t);
	}

	@Override
	public Attraction update(Attraction t) {
		// TODO Auto-generated method stub
		return attractionRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		this.attractionRepository.deleteById(id);
		
	}
}
