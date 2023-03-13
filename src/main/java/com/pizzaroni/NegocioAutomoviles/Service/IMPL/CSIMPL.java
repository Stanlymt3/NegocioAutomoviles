package com.pizzaroni.NegocioAutomoviles.Service.IMPL;

import com.pizzaroni.NegocioAutomoviles.Entity.Clientes;
import com.pizzaroni.NegocioAutomoviles.Repository.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service

public class CSIMPL extends CrudService<Clientes,Integer> {

    //Utilizar para metodos concretos no pertenecientes a la clase CrudService
    @Autowired
    private ClienteRepo cRepo;

    @Override
    protected CrudRepository<Clientes, Integer> getRepository() {
        return null;
    }


}
