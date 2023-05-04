package com.example.desercion.repository;

import com.example.desercion.entity.Area;
import com.example.desercion.entity.Pregunta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.core.CrudMethods;

public interface AreaCrudRepository extends CrudRepository<Area,Integer> {

}
