package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Visiteur;

public interface VisiteurRepository extends JpaRepository<Visiteur, Long>{

}
