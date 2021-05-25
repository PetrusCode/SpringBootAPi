package com.netmind.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netmind.demo.dao.ClienteRepository;
import com.netmind.demo.model.Cliente;
import com.netmind.demo.service.ClienteServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("cliente")
public class ClienteController {
	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private ClienteServiceImpl clienteService;

	@GetMapping(path = "/cliente", produces = "application/json")
	public ResponseEntity<List<Cliente>> getH2Clientes() {
		return ResponseEntity.ok(clienteRepository.findAll());
	}

	@PostMapping("/cliente")
	public ResponseEntity<Cliente> createH2Cliente(
			@RequestBody Cliente cliente) {
		return ResponseEntity.ok(clienteService.create(cliente));
	}
}
