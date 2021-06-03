package com.example.demo.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Parc;
import com.example.demo.repositories.ParcRepository;
import com.example.demo.services.GenericService;


public class ParcServiceImpl implements GenericService<Parc>{


    @Autowired
    private ParcRepository parcRepository;


	@Override
	public List<Parc> getAll() {
		// TODO Auto-generated method stub
		return parcRepository.findAll() ;
	}

	@Override
	public Parc getById(Long id) {
		// TODO Auto-generated method stub
		return parcRepository.findById(id).get();
	}

	@Override
	public Parc create(Parc t) {
		// TODO Auto-generated method stub
		return parcRepository.save(t);
	}

	@Override
	public Parc update(Parc t) {
		// TODO Auto-generated method stub
		return parcRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		this.parcRepository.deleteById(id);
		
	}
}