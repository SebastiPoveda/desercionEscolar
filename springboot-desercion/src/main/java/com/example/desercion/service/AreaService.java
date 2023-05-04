package com.example.desercion.service;

import com.example.desercion.entity.Area;
import com.example.desercion.entity.Pregunta;
import com.example.desercion.repository.AreaRepository;
import com.example.desercion.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AreaService {
    @Autowired
    private AreaRepository areaRepository;

    public List<Area> getAll(){
        return (List<Area>) areaRepository.findAll();
    }
    public Area save(Area a){
        return areaRepository.save(a);
    }

}
