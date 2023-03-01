/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Profesor;
import com.example.demo.repositorio.IProfesorRep;

/**
 *
 * @author daysi
 */
@Service
public class ProfesorImpl extends GenericServiceImpl<Profesor, Long> implements IProfesorService{
@Autowired
IProfesorRep profeRep;

@Override
    public CrudRepository<Profesor, Long> getDao() {
        return profeRep;
    }
}
