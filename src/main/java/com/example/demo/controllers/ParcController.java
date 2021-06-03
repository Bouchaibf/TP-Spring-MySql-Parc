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

import com.example.demo.models.Parc;
import com.example.demo.services.GenericService;

@RestController
@RequestMapping("parc")
public class ParcController {

	@Autowired
    private GenericService<Parc> parcService;
	
	
	@GetMapping()
    public List<Parc> getAll() {
        return this.parcService.getAll();
    }

    @GetMapping("{id}")
    public Parc getById(@PathVariable Long id) {
        return this.parcService.getById(id);
    }

    @PostMapping()
    public Parc create(@RequestBody Parc parc) {
        return this.parcService.create(parc);
    }

    @PatchMapping()
    public Parc update(@RequestBody Parc parc) {
        return this.parcService.update(parc);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.parcService.delete(id);
    }
	
}
