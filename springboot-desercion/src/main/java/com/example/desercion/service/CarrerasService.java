package com.example.desercion.service;

import com.example.desercion.entity.Area;
import com.example.desercion.entity.Carreras;
import com.example.desercion.repository.AreaRepository;
import com.example.desercion.repository.CarrerasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarrerasService {
    @Autowired
    private CarrerasRepository carrerasRepository;

    public List<Carreras> getAll(){
        return (List<Carreras>) carrerasRepository.findAll();
    }
    public Carreras save(Carreras c){ return carrerasRepository.save(c);}
    
}
