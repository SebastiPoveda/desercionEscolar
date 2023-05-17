package com.example.desercion.controller;

import com.example.desercion.entity.Area;
import com.example.desercion.entity.Carreras;
import com.example.desercion.service.AreaService;
import com.example.desercion.service.CarrerasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/careers")
public class CarrerasController {

    @Autowired
    private CarrerasService carrerasService;

    @GetMapping("/all")
    public List<Carreras> getCarreras(){
        return (List<Carreras>) carrerasService.getAll();
    }

    @PostMapping("/save")
    public Carreras saveCarrera(@RequestBody Carreras c){
        return carrerasService.save(c);
    }

}
