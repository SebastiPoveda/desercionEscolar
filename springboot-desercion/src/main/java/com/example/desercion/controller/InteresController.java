package com.example.desercion.controller;

import com.example.desercion.entity.Area;
import com.example.desercion.entity.Interes;
import com.example.desercion.service.AreaService;
import com.example.desercion.service.InteresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/interes")
public class InteresController {

    @Autowired
    private InteresService interesService;

    @GetMapping("/all")
    public List<Interes> getInteres(){
        return (List<Interes>) interesService.getAll();
    }

    @PostMapping("/save")
    public Interes saveInteres(@RequestBody Interes i){
        return interesService.save(i);
    }
}
