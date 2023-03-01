/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Depto;
import com.example.demo.modelo.Profesor;
import com.example.demo.service.IDeptoService;

/**
 *
 * @author daysi
 */

@RestController
@RequestMapping("/api/depto")
public class ControllerDepto {
	@Autowired
    IDeptoService dservice;
	
	 @GetMapping("/listar")
	    public ResponseEntity<List<Depto>> listarDep() {
	        return new ResponseEntity<>(dservice.findByAll(), 
	                HttpStatus.OK);
	    }
	    @PostMapping("/crear")
	    public ResponseEntity<Depto> crearDep(
	            @RequestBody Depto d) {
	        return new ResponseEntity<>(dservice.save(d), 
	                HttpStatus.CREATED);
	    }

	    @PutMapping("/actualizar/{id}")
	    public ResponseEntity<Depto> actualizarDep(@PathVariable Long id, @RequestBody Depto p) {
	        Depto depENcontrada = dservice.findById(id);
	        if (depENcontrada == null) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        } else {
	            try {
	                depENcontrada.setNombre_dep(p.getNombre_dep());
	                depENcontrada.setDescripcion_dep(p.getDescripcion_dep());
	                depENcontrada.setDirector(p.getDirector());
	                return new ResponseEntity<>(dservice.save(p), HttpStatus.OK);
	            } catch (DataAccessException e) {
	                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	            }
	        }
	    }

	    @DeleteMapping("/eliminar/{id}")
	    public ResponseEntity<Profesor> eliminarDep(@PathVariable Long id) {
	        dservice.delete(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }
	

}
