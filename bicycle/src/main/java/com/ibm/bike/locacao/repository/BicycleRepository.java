package com.ibm.bike.locacao.repository;

import com.ibm.bike.locacao.model.Bicycle;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository                        //extends JpaRepository<Bicycle, Long>
public interface BicycleRepository extends MongoRepository<Bicycle, String> {

    List<Bicycle> findByModelo(String modelo);

    List<Bicycle> findByCor(String cor);
}