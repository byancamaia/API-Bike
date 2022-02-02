package com.ibm.bike.locacao.service;

import com.ibm.bike.locacao.model.Bicycle;
import com.ibm.bike.locacao.model.dto.BicycleDTO;

import java.util.List;

public interface BicycleService {

    List<BicycleDTO> getBike();

    BicycleDTO getBikeById(String id);

    List<BicycleDTO> getBikeByModelo(String modelo);

    List<BicycleDTO> getBikeByCor(String cor);

    BicycleDTO insert(Bicycle bike);

    BicycleDTO update(Bicycle bike, String id);

    public void delete(String id);


}

