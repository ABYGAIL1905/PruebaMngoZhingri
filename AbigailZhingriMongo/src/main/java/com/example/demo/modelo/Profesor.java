package com.example.demo.modelo;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Profesor")
@Data
public class Profesor {
	
	@Id
	private Long profe_id;
	private String nombre_profe;
	private String direccion_profe;
	private String telefono_profe;
	Depto dep;
	public Long getProfe_id() {
		return profe_id;
	}
	public void setProfe_id(Long profe_id) {
		this.profe_id = profe_id;
	}
	public String getNombre_profe() {
		return nombre_profe;
	}
	public void setNombre_profe(String nombre_profe) {
		this.nombre_profe = nombre_profe;
	}
	public String getDireccion_profe() {
		return direccion_profe;
	}
	public void setDireccion_profe(String direccion_profe) {
		this.direccion_profe = direccion_profe;
	}
	public String getTelefono_profe() {
		return telefono_profe;
	}
	public void setTelefono_profe(String telefono_profe) {
		this.telefono_profe = telefono_profe;
	}
	public Depto getDep() {
		return dep;
	}
	public void setDep(Depto dep) {
		this.dep = dep;
	}
	
	

}
