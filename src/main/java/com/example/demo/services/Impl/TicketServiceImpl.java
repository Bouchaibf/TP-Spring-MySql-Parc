package com.example.demo.services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Ticket;
import com.example.demo.repositories.TicketRepository;
import com.example.demo.services.GenericService;

public class TicketServiceImpl implements GenericService<Ticket>{

    @Autowired
    private TicketRepository ticketRepository;


	
	
	
	@Override
	public List<Ticket> getAll() {
		// TODO Auto-generated method stub
		return ticketRepository.findAll() ;
	}

	@Override
	public Ticket getById(Long id) {
		// TODO Auto-generated method stub
		return ticketRepository.findById(id).get();
	}

	@Override
	public Ticket create(Ticket t) {
		// TODO Auto-generated method stub
		return ticketRepository.save(t);
	}

	@Override
	public Ticket update(Ticket t) {
		// TODO Auto-generated method stub
		return ticketRepository.save(t);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		this.ticketRepository.deleteById(id);
		
	}	
	
}
