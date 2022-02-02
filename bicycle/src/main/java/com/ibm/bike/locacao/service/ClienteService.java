package com.ibm.bike.locacao.service;

import com.ibm.bike.locacao.model.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente save(Cliente cliente);

    Cliente findByCpf(String cpf);

    Cliente update(Cliente cliente);

    Cliente findById(String id);

    List<Cliente> findAll();

    void deleteById(String id);
}
