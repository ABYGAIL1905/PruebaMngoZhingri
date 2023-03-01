package com.example.demo.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.modelo.Curso;



public interface ICursoRep extends  MongoRepository<Curso, Long>{

}
