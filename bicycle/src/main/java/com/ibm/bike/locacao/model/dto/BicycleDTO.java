package com.ibm.bike.locacao.model.dto;

import com.ibm.bike.locacao.model.Bicycle;
import lombok.Data;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class BicycleDTO {
    private String id;
    private String modelo;
    private String cor;

    public BicycleDTO() {
    }

    public BicycleDTO(Bicycle bike) {
        this.id = id;
        this.modelo = modelo;
        this.cor = cor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public static BicycleDTO create (Bicycle b){
        ModelMapper modelMapper  = new ModelMapper();
        return modelMapper.map(b, BicycleDTO.class);
    }

    public static List<BicycleDTO> converter(List<Bicycle> bike) {
        return bike.stream().map(BicycleDTO::new).collect(Collectors.toList());
    }
}
