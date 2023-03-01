package com.example.demo.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.modelo.Profesor;



public interface IProfesorRep extends  MongoRepository<Profesor, Long>{

}
