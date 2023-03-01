package com.example.demo.modelo;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Depto")
@Data
public class Depto {

	@Id
	private Long dep_id;
	private String nombre_dep;
	private String director;
	private String descripcion_dep;
	public Long getDep_id() {
		return dep_id;
	}
	public void setDep_id(Long dep_id) {
		this.dep_id = dep_id;
	}
	public String getNombre_dep() {
		return nombre_dep;
	}
	public void setNombre_dep(String nombre_dep) {
		this.nombre_dep = nombre_dep;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDescripcion_dep() {
		return descripcion_dep;
	}
	public void setDescripcion_dep(String descripcion_dep) {
		this.descripcion_dep = descripcion_dep;
	}
	
	
	
}
