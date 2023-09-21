package com.example.Joao.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_Cliente")
public class ClienteEntitie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	
	@Column(name = "Cliente")
	private String nCliente;
	
	@Column(name = "Fone")
	private String Fone;
	
	public Long getidCliente() {
		return idCliente;
	}
	public void setidCliente(Long idCliente) {
		this.idCliente = idCliente;
	}
	public String getCliente() {
		return nCliente;
	}
	public void setCliente(String nCliente) {
		this.nCliente = nCliente;
	}
	public String getFone() {
		return Fone;
	}
	public void setFone(String Fone) {
		this.Fone = Fone;
	}
}
