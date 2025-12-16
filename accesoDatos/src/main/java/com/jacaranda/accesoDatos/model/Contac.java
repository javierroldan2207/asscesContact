package com.jacaranda.accesoDatos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contactos")
public class Contac {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_contact;
	
	
	
}
