package com.algaworks.festa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Convidado {
		@Id
		@GeneratedValue
		public Long id;
		
		public String nome;
		public Integer quantidade;

	
}
