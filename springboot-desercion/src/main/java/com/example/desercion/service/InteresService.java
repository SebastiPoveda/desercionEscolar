package com.example.desercion.service;

import com.example.desercion.entity.Interes;
import com.example.desercion.repository.InteresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InteresService {
    @Autowired
    private InteresRepository interesRepository;

    public List<Interes> getAll() {
        return (List<Interes>) interesRepository.findAll();
    }

    public Interes save(Interes i){
        return interesRepository.save(i);
    }

}
