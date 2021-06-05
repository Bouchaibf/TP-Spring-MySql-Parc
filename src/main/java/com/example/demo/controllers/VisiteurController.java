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

import com.example.demo.models.Visiteur;
import com.example.demo.services.GenericService;


@RestController
@RequestMapping("visiteur")
public class VisiteurController {
	
	@Autowired
    private GenericService<Visiteur> visiteurService;
	
	
	

    @GetMapping()
    public List<Visiteur> getAll() {
        return this.visiteurService.getAll();
    }

    @GetMapping("{id}")
    public Visiteur getById(@PathVariable Long id) {
        return this.visiteurService.getById(id);
    }

    @PostMapping()
    public Visiteur create(@RequestBody Visiteur visiteur) {
        return this.visiteurService.create(visiteur);
    }

    @PatchMapping()
    public Visiteur update(@RequestBody Visiteur visiteur) {
        return this.visiteurService.update(visiteur);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.visiteurService.delete(id);
    }

  //
}
