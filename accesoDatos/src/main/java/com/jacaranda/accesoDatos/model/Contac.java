package com.jacaranda.accesoDatos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "contactos")
public class Contac {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_contacto")
	private Integer id_contact;
	
	@NotNull
	@NotEmpty
	@Column(name = "id_persona")
	private String id_person;
	
	@NotNull
	@NotEmpty
	@Column(name = "tipo_contacto")
	private String contac_type;
	
	@NotEmpty
	@NotNull
	@Column(name = "valor")
	private String value;

	@ManyToOne
	
	public Integer getId_contact() {
		return id_contact;
	}

	public void setId_contact(Integer id_contact) {
		this.id_contact = id_contact;
	}

	public String getId_person() {
		return id_person;
	}

	public void setId_person(String id_person) {
		this.id_person = id_person;
	}

	public String getContac_type() {
		return contac_type;
	}

	public void setContac_type(String contac_type) {
		this.contac_type = contac_type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
	
	
}
