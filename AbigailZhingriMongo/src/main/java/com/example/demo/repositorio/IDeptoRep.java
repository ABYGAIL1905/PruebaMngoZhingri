package com.example.demo.repositorio;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.modelo.Depto;



public interface IDeptoRep extends  MongoRepository<Depto, Long>{

}
