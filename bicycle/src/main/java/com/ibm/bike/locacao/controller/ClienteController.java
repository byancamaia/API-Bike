//package com.ibm.bike.locacao.controller;
//
//import com.ibm.bike.locacao.model.Bicycle;
//import com.ibm.bike.locacao.model.Cliente;
//import com.ibm.bike.locacao.model.dto.BicycleDTO;
//import com.ibm.bike.locacao.model.dto.ClienteDTO;
//import com.ibm.bike.locacao.service.ClienteService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
//
//import javax.validation.Valid;
//import java.net.URI;
//
//@RestController
//@RequestMapping("/clientes")
//public class ClienteController {
//
//    @Autowired
//    ClienteService clienteService;
//
//    @GetMapping()
//    public ResponseEntity get() {
//        return ResponseEntity.ok(clienteService.findAll());
//    }
//
//    @GetMapping(path = "/{id}")
//    public ResponseEntity getById(@PathVariable("id") String id){
//        ClienteDTO clienteDTO = clienteService.findById(id);
//        return ResponseEntity.ok(clienteDTO);
//    }
//
//    //monta a url até o caminho id
//    private URI getUri(String id) {
//        return ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(id).toUri();
//    }
//
//    @PostMapping(path = "/salvar")
//    public ResponseEntity post(@RequestBody @Valid Cliente cliente) {
//        ClienteDTO c = clienteService.save(cliente);
//        URI location = getUri(c.getId());
//        return ResponseEntity.created(location).build();
//    }
//
//
//    @PutMapping(path = "/{id}")
//    public ResponseEntity update(@PathVariable String id, @RequestBody Cliente cliente){
//        ClienteDTO cli = clienteService.update(cliente);
//        return cli != null ?
//                ResponseEntity.ok().build() :
//                ResponseEntity.notFound().build();
//
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity delete(@PathVariable("id") String id) {
//        clienteService.deleteById(id);
//        return ResponseEntity.ok().build();
//    }
//
//
//
//}
