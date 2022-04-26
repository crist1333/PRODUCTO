package com.cursojava.curso.dao;

import com.cursojava.curso.controllers.Models.Inventario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventarioRepository extends CrudRepository<Inventario, Integer> {

    }

