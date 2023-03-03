package com.crud.run.model;
import jakarta.persistence.*;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String name;
	private String direccion;
	private String telefono;
	private String link;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Usuario(Integer id, String name, String direccion, String telefono, String link) {
		this.id = id;
		this.name = name;
		this.direccion = direccion;
		this.telefono = telefono;
		this.link = link;
	}
	public Usuario() {
	}
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", direccion=" + direccion + ", telefono=" + telefono
				+ ", link=" + link + "]";
	}

}
