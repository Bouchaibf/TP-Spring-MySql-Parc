package com.example.demo.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Visiteur;
import com.example.demo.repositories.VisiteurRepository;
import com.example.demo.services.GenericService;


public class VisiteurServiceImpl implements GenericService<Visiteur>{

    @Autowired
    private VisiteurRepository visiteurRepository;


		
	@Override
	public List<Visiteur> getAll() {
		// TODO Auto-generated method stub
		return visiteurRepository.findAll() ;
	}

	@Override
	public Visiteur getById(Long id) {
		// TODO Auto-generated method stub
		return visiteurRepository.findById(id).get();
	}

	@Override
	public Visiteur create(Visiteur t) {
		// TODO Auto-generated method stub
		return visiteurRepository.save(t);
	}

	@Override
	public Visiteur update(Visiteur t) {
		// TODO Auto-generated method stub
		return visiteurRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		this.visiteurRepository.deleteById(id);
		
	}
}
