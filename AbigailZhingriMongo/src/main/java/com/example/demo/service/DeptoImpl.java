/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Depto;
import com.example.demo.repositorio.IDeptoRep;

/**
 *
 * @author daysi
 */
@Service
public class DeptoImpl extends GenericServiceImpl<Depto, Long> implements IDeptoService{
	
	@Autowired
	IDeptoRep depRep;
	@Override
    public CrudRepository<Depto, Long> getDao() {
        return depRep;
    }

}
