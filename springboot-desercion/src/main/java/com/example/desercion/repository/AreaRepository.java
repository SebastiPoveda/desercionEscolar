package com.example.desercion.repository;

import com.example.desercion.entity.Area;
import com.example.desercion.entity.Pregunta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AreaRepository {

    @Autowired
    AreaCrudRepository areaCrudRepository;
    public List<Area> findAll(){
        return (List<Area>) areaCrudRepository.findAll();
    }
    public Area save(Area a){
        return areaCrudRepository.save(a);
    }

}
