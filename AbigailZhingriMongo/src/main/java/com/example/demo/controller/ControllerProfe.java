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

import com.example.demo.modelo.Profesor;
import com.example.demo.service.IProfesorService;



/**
 *
 * @author daysi
 */

@RestController
@RequestMapping("/api/profesor")
public class ControllerProfe {
	
	@Autowired
    IProfesorService pservice;
	
	 @GetMapping("/listar")
	    public ResponseEntity<List<Profesor>> listarProfes() {
	        return new ResponseEntity<>(pservice.findByAll(), 
	                HttpStatus.OK);
	    }
	    @PostMapping("/crear")
	    public ResponseEntity<Profesor> crearProfe(
	            @RequestBody Profesor p) {
	        return new ResponseEntity<>(pservice.save(p), 
	                HttpStatus.CREATED);
	    }

	    @PutMapping("/actualizar/{id}")
	    public ResponseEntity<Profesor> actualizarProfe(@PathVariable Long id, @RequestBody Profesor p) {
	        Profesor personaENcontrada = pservice.findById(id);
	        if (personaENcontrada == null) {
	            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	        } else {
	            try {
	                personaENcontrada.setNombre_profe(p.getNombre_profe());
	                personaENcontrada.setDireccion_profe(p.getDireccion_profe());
	                personaENcontrada.setTelefono_profe(p.getDireccion_profe());
	                return new ResponseEntity<>(pservice.save(p), HttpStatus.OK);
	            } catch (DataAccessException e) {
	                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	            }
	        }
	    }

	    @DeleteMapping("/eliminar/{id}")
	    public ResponseEntity<Profesor> eliminarProfe(@PathVariable Long id) {
	        pservice.delete(id);
	        return new ResponseEntity<>(HttpStatus.OK);
	    }

}
