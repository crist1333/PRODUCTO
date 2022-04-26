package com.cursojava.curso.InventariorService;

import com.cursojava.curso.controllers.Models.Inventario;
import com.cursojava.curso.dao.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioReposity {

    @Autowired
    private InventarioRepository inventarioRepository;

    public Inventario insertar(Inventario inventario) {
       return inventarioRepository.save(inventario);
    }
    public Inventario actualizar (Inventario inventario){
        return inventarioRepository.save(inventario);
    }
    public List<Inventario> listar(){
        return (List<Inventario>) inventarioRepository.findAll();
    }
    public void eliminar (Inventario inventario){
        inventarioRepository.delete(inventario);
    }
}
