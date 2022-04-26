package com.cursojava.curso.controllers;

import com.cursojava.curso.InventariorService.InventarioReposity;
import com.cursojava.curso.controllers.Models.Inventario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping(value = "/Inventario")
    public class InventarioControllers {

     @Autowired
     private InventarioReposity inventarioRepository;
        @GetMapping("/listar")
        public List<Inventario> listar(){
            return inventarioRepository.listar();
        }
        @PostMapping(value = "/insertar", consumes = MediaType.APPLICATION_JSON_VALUE)
        public ResponseEntity<Object> insertar(@RequestBody Inventario inventario){
            return ResponseEntity.ok(this.inventarioRepository.insertar(inventario));
        }
        @PutMapping("/actualizar")
        public Inventario actualizar(@RequestBody Inventario inventario){
            return inventarioRepository.actualizar(inventario);
        }
        @DeleteMapping("/eliminar")
        public void eliminar(@RequestBody Inventario inventario){
            inventarioRepository.eliminar(inventario);
        }
    // @PostMapping("/filtroPorCiudad")
       /* public List<User> postUser(@RequestBody List<User> users) {
            //return users.stream().filter(x -> x.getCity().equals(x)).collect(Collectors.toList());
            //filter en este caso se filtra toda la informacion por ciudad de mi lista pero tambien se pueden otras cosas
            //estudiar stream en java
            return userService.listar().stream().filter(x ->x.getCity().equals(x)).collect(Collectors.toList());
        }*/

}
