package com.example.demo.services;

import java.util.List;

public interface GenericService<T> {
    
    
     public List<T> getAll() ;
    
     public T getById(Long id);
    
     public T create(T t);
    
     public T update(T t);
    
     public void delete(Long id);
    
}