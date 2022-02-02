package com.ibm.bike.locacao.controller;

import com.ibm.bike.locacao.model.Bicycle;
import com.ibm.bike.locacao.model.dto.BicycleDTO;
import com.ibm.bike.locacao.service.BicycleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/api/bike")
public class BicycleController {

    @Autowired
    private BicycleServiceImpl service;

    @GetMapping()
    public ResponseEntity get() {
        return ResponseEntity.ok(service.getBike());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity get(@PathVariable("id") String id) {
        BicycleDTO bike = service.getBikeById(id);
        return ResponseEntity.ok(bike);
    }

    @GetMapping(value = "/modelo/{modelo}")
    public ResponseEntity getBikeByModelo(@PathVariable("modelo") String modelo) {
        List<BicycleDTO> bike = service.getBikeByModelo(modelo);

        if (bike.isEmpty())
            return ResponseEntity.noContent().build();
        else
            return ResponseEntity.ok(bike);
    }

    @GetMapping(value = "/cor/{cor}")
    public ResponseEntity getBikeByCor(@PathVariable("cor") String cor) {
        List<BicycleDTO> bike = service.getBikeByCor(cor);

        if (bike.isEmpty())
            return ResponseEntity.noContent().build();
        else
            return ResponseEntity.ok(bike);
    }

    @PostMapping
    //@Secured({"ROLE_ADMIN"})
    public ResponseEntity post(@RequestBody Bicycle bike) {
        BicycleDTO b = service.insert(bike);
        URI location = getUri(b.getId());
        return ResponseEntity.created(location).build();
    }

    private URI getUri(String id) {
        return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
    }

    @PutMapping("/{id}")
    public ResponseEntity put(@PathVariable("id") String id, @RequestBody Bicycle bike) {
        BicycleDTO b = service.update(bike, id);
        return b != null ?
                ResponseEntity.ok().build() :
                ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") String id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

}
