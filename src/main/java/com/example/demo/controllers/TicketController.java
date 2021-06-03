package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Ticket;
import com.example.demo.services.GenericService;


@RestController
@RequestMapping("ticket")
public class TicketController {
	
	@Autowired
    private GenericService<Ticket> ticketService;
	
	
    @GetMapping()
    public List<Ticket> getAll() {
        return this.ticketService.getAll();
    }

    @GetMapping("{id}")
    public Ticket getById(@PathVariable Long id) {
        return this.ticketService.getById(id);
    }

    @PostMapping()
    public Ticket create(@RequestBody Ticket ticket) {
        return this.ticketService.create(ticket);
    }

    @PatchMapping()
    public Ticket update(@RequestBody Ticket ticket) {
        return this.ticketService.update(ticket);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.ticketService.delete(id);
    }


}
