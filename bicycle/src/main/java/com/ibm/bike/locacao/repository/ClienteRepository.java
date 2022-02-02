package com.ibm.bike.locacao.repository;

import com.ibm.bike.locacao.model.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends MongoRepository<Cliente, String> {

    Cliente findByEmail(String email);

    Cliente findByCpf(String cpf);


}

