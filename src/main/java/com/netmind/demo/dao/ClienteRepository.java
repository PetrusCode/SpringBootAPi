package com.netmind.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.netmind.demo.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
