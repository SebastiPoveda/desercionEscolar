package com.example.desercion.repository;

import com.example.desercion.entity.Interes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class InteresRepository {

    @Autowired
    InteresCrudRepository interesCrudRepository;

    public List<Interes> findAll(){
        return (List<Interes>) interesCrudRepository.findAll();
    }
    public Interes save(Interes i){
        return interesCrudRepository.save(i);
    }

}
