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

import com.example.demo.models.Attraction;
import com.example.demo.services.GenericService;

@RestController
@RequestMapping("attraction")

public class AttractionController {
	
	
	@Autowired
    private GenericService<Attraction> attractionService;
	
	
	
    @GetMapping()
    public List<Attraction> getAll() {
        return this.attractionService.getAll();
    }

    @GetMapping("{id}")
    public Attraction getById(@PathVariable Long id) {
        return this.attractionService.getById(id);
    }

    @PostMapping()
    public Attraction create(@RequestBody Attraction attraction) {
        return this.attractionService.create(attraction);
    }

    @PatchMapping()
    public Attraction update(@RequestBody Attraction attraction) {
        return this.attractionService.update(attraction);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        this.attractionService.delete(id);
    }
	
	
}
