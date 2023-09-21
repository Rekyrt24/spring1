package com.example.Joao.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Joao.entities.ClienteEntitie;
import com.example.Joao.repositories.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	public ClienteEntitie saveClienteEntitie(ClienteEntitie clienteEntitie){
		return clienteRepository.save(clienteEntitie);
	}
	public ClienteEntitie getClienteEntitieById(Long idCliente) {
		return clienteRepository.findById(idCliente).orElse(null);
	}
	public List<ClienteEntitie> getAllClienteEntities(){
		return clienteRepository.findAll();
	}
	public void deleteClienteEntitie (Long idCliente) {
		clienteRepository.deleteById(idCliente);
	}
}
