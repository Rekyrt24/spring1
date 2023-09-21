package com.example.Joao.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Joao.entities.ClienteEntitie;
import com.example.Joao.services.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	private final ClienteService clienteService;
	
	@Autowired
	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@PostMapping
	public ClienteEntitie createCliente(@RequestBody ClienteEntitie clienteEntitie) {
		return clienteService.saveClienteEntitie(clienteEntitie);
	}
	
	@GetMapping("/{idCliente}")
	public ClienteEntitie getClienteEntitie(@PathVariable Long idCliente) {
		return clienteService.getClienteEntitieById(idCliente);
	}
	
	@GetMapping
	public List<ClienteEntitie> getAllClienteEntities(){
		return clienteService.getAllClienteEntities();
	}
	
	@DeleteMapping("/{idCliente}")
	public void deleteClienteEntitie(@PathVariable Long idCliente) {
		clienteService.deleteClienteEntitie(idCliente);
	}
}
