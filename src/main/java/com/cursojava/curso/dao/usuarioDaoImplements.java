package com.cursojava.curso.dao;

import com.cursojava.curso.controllers.Models.Inventario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
//estos dos son exenciales para la conexion a la base de datos
@Repository
@Transactional
public class usuarioDaoImplements implements usuarioDao{
    @PersistenceContext
    //conexion a la base de datos
    private EntityManager entityManager;

    @Override
    public List<Inventario> getUser() {
        String querysql = "FROM User";
        //
        return entityManager.createQuery(querysql).getResultList();
    }
}
