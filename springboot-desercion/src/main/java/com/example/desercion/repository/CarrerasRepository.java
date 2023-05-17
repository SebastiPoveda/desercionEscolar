package com.example.desercion.repository;

import com.example.desercion.entity.Area;
import com.example.desercion.entity.Carreras;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarrerasRepository {

    @Autowired
    CarrerasCrudRepository carrerasCrudRepository;
    public List<Carreras> findAll(){
        return (List<Carreras>) carrerasCrudRepository.findAll();
    }
    public Carreras save(Carreras c){
        return carrerasCrudRepository.save(c);
    }
}
