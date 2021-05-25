package com.netmind.demo.service;

import com.netmind.demo.model.Cliente;

public interface ClienteService {
	Cliente create(final Cliente cliente);

	Cliente getUser(final Long id);

	Cliente update(Cliente cliente);

}
