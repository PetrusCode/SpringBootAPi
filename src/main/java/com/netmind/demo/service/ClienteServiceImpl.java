package com.netmind.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.netmind.demo.dao.ClienteRepository;
import com.netmind.demo.model.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	ClienteRepository clienteRepository;

	@Override
	public Cliente create(Cliente cliente) {

		return clienteRepository.save(cliente);
	}

	@Override
	@Transactional
	public Cliente update(final Cliente cliente) {
		final Cliente updatableUser = clienteRepository
				.findById(cliente.getIdcliente())
				.orElseThrow(NullPointerException::new);
		updatableUser.setApellidos(cliente.getApellidos());
		updatableUser.setNombre(cliente.getNombre());
		updatableUser.setDni(cliente.getDni());
		updatableUser.setPedidos(cliente.getPedidos());
		updatableUser.setIdcliente(cliente.getIdcliente());
		return updatableUser;
	}

	@Override
	public Cliente getUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
