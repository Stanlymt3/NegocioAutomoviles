package com.pizzaroni.NegocioAutomoviles.Service.IMPL;

import com.pizzaroni.NegocioAutomoviles.Entity.Vehiculos;
import com.pizzaroni.NegocioAutomoviles.Repository.VehiculosRepo;
import com.pizzaroni.NegocioAutomoviles.Service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class VSIMPL extends CrudService<Vehiculos, Integer> {

    //Utilizar para metodos concretos no pertenecientes a la clase CrudService
    @Autowired
    private VehiculosRepo vRepo;
    @Override
    protected CrudRepository<Vehiculos, Integer> getRepository() {
        return null;
    }
}
