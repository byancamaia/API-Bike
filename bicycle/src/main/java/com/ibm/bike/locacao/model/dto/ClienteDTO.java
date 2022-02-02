package com.ibm.bike.locacao.model.dto;

import com.ibm.bike.locacao.model.Bicycle;
import com.ibm.bike.locacao.model.Cliente;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ClienteDTO {

    private String id;

    private String nome;
    private String dataNasc;
    private String email;
    private String cpf;
    private String celular;

    public ClienteDTO() {
    }

    public ClienteDTO(Cliente cliente) {
        this.id = cliente.getId();
        this.nome = cliente.getNome();
        this.dataNasc = cliente.getDataNasc();
        this.email = cliente.getEmail();
        this.cpf = cliente.getCpf();
        this.celular = cliente.getCelular();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public static ClienteDTO create (Cliente cli){
        ModelMapper modelMapper  = new ModelMapper();
        return modelMapper.map(cli, ClienteDTO.class);
    }

    public static List<ClienteDTO> converter(List<Cliente> c) {
        return c.stream().map(ClienteDTO::new).collect(Collectors.toList());
    }
}
