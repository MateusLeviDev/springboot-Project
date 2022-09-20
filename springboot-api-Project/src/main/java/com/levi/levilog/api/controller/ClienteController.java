package com.levi.levilog.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.levi.levilog.domain.model.Cliente;
import com.levi.levilog.domain.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor 
@RestController
public class ClienteController {

		private ClienteRepository clienteRepository; 
	
		@GetMapping("/clientes")
		public List<Cliente> listar() {
			return clienteRepository.findAll();
		}
}
