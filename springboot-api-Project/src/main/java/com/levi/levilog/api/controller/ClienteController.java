package com.levi.levilog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.levi.levilog.domain.model.Cliente;

@RestController
public class ClienteController {

		@GetMapping("/clientes")
		public List<Cliente> listar() {
			
			var Cliente1 = new Cliente(); 
			Cliente1.setId(1L);
			Cliente1.setNome("Mateus");
			Cliente1.setTelefone("32 99999-1111");
			Cliente1.setEmail("mateus@gmail.com");
			
			var Cliente2 = new Cliente();  
			Cliente2.setId(2L);
			Cliente2.setNome("Maria");
			Cliente2.setTelefone("32 99999-2222");
			Cliente2.setEmail("maria@gmail.com"); 
			
			
			return Arrays.asList(Cliente1, Cliente2); 
		}
}
