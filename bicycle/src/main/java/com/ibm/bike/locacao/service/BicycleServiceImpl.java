package com.ibm.bike.locacao.service;

import com.ibm.bike.locacao.controller.config.exception.ObjectNotFoundException;
import com.ibm.bike.locacao.model.Bicycle;
import com.ibm.bike.locacao.model.dto.BicycleDTO;
import com.ibm.bike.locacao.repository.BicycleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BicycleServiceImpl {

    @Autowired
    private BicycleRepository rep;

    public List<BicycleDTO> getBike() {
        List<BicycleDTO> list = rep.findAll().stream().map(BicycleDTO::create).collect(Collectors.toList());
        return list;
    }

    public BicycleDTO getBikeById(String id) {

        Optional<Bicycle> bike = rep.findById(id);
        return bike.map(BicycleDTO::create).orElseThrow(() -> new ObjectNotFoundException("Bicleta não encontrada"));
    }

    public List<BicycleDTO> getBikeByModelo(String modelo) {
        return rep.findByModelo(modelo).stream().map(BicycleDTO::create).collect(Collectors.toList());
    }

    public List<BicycleDTO> getBikeByCor(String cor) {
        return rep.findByCor(cor).stream().map(BicycleDTO::create).collect(Collectors.toList());
    }

    public BicycleDTO insert(Bicycle bike) {
        Assert.isNull(bike.getId(), "Não foi possível inserir o registro");
        return BicycleDTO.create(rep.save(bike));
    }

    public BicycleDTO update(Bicycle bike, String id) {
        Assert.notNull(id, "Não foi possível atualizar o registro");

        Optional<Bicycle> optional = rep.findById(id);

        if (optional.isPresent()) {
            Bicycle db = optional.get();
            db.setModelo(bike.getModelo());
            db.setCor(bike.getCor());
            System.out.println("bike id: " + db.getId());

            rep.save(db);

            return BicycleDTO.create(db);
        } else {
            return null;
            //throw new RuntimeException("Não foi possível atualizar o registro");
        }

    }

    public void delete(String id) {
        rep.deleteById(id);

    }
}
