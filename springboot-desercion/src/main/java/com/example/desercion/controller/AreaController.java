package com.example.desercion.controller;

import com.example.desercion.entity.Area;
import com.example.desercion.entity.Pregunta;
import com.example.desercion.service.AreaService;
import com.example.desercion.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/area")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @GetMapping("/all")
    public List<Area> getAreas(){
        return (List<Area>) areaService.getAll();
    }

    @PostMapping("/save")
    public Area saveArea(@RequestBody Area a){
        return areaService.save(a);
    }

}
