package com.ibm.bike.locacao.service;

import com.ibm.bike.locacao.controller.config.exception.ObjectNotFoundException;
import com.ibm.bike.locacao.model.Bicycle;
import com.ibm.bike.locacao.model.Cliente;
import com.ibm.bike.locacao.model.dto.BicycleDTO;
import com.ibm.bike.locacao.model.dto.ClienteDTO;
import com.ibm.bike.locacao.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ClienteServiceImpl {

    @Autowired
    ClienteRepository clienteRepository;

    public void deleteById(String id) {
        clienteRepository.deleteById(id);
    }

    public ClienteDTO save(Cliente cliente) {
        Assert.isNull(cliente.getId(), "Não foi possível inserir o registro");
        return ClienteDTO.create(clienteRepository.save(cliente));
    }

    public ClienteDTO update(Cliente cliente, String id) {
        Optional<Cliente> clienteid = clienteRepository.findById(cliente.getId());
//        if(clienteid.isEmpty()){
//            throw new RuntimeException("Cliente não encontrado");
//        } return clienteRepository.save(cliente);
        if (clienteid.isPresent()) {
            Cliente db = clienteid.get();
            clienteRepository.save(db);
            return ClienteDTO.create(db);
        } else
            return null;
    }

    public ClienteDTO findById(String id){
        Optional<Cliente> bike = clienteRepository.findById(id);
        return bike.map(ClienteDTO::create).orElseThrow(() -> new ObjectNotFoundException("Cliente não encontrado"));
    }

    public List<ClienteDTO> findAll(){
        List<ClienteDTO> list = clienteRepository.findAll().stream().map(ClienteDTO::create).collect(Collectors.toList());
        return list;
    }

    public Cliente findByCpf(String cpf){
        return clienteRepository.findByCpf(cpf);
    }
}
