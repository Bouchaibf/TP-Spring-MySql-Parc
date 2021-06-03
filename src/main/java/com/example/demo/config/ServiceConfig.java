package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.models.Attraction;
import com.example.demo.models.Parc;
import com.example.demo.models.Ticket;
import com.example.demo.models.Visiteur;
import com.example.demo.services.GenericService;
import com.example.demo.services.Impl.AttractionServiceImpl;
import com.example.demo.services.Impl.ParcServiceImpl;
import com.example.demo.services.Impl.TicketServiceImpl;
import com.example.demo.services.Impl.VisiteurServiceImpl;


@Configuration
public class ServiceConfig {

    @Bean
    public GenericService<Attraction> attractionServiceFactory() {
        return new AttractionServiceImpl();
    }

    @Bean
    public GenericService<Parc> parcServiceFactory() {
        return new ParcServiceImpl();
    }
    
    @Bean
    public GenericService<Visiteur> visiteurServiceFactory() {
        return new VisiteurServiceImpl();
    }
    
    @Bean
    public GenericService<Ticket> ticketServiceFactory() {
        return new TicketServiceImpl();
    }
    
}

















//
