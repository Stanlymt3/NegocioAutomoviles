package com.pizzaroni.NegocioAutomoviles.Service.IMPL;


import com.pizzaroni.NegocioAutomoviles.Entity.Ventas;
import com.pizzaroni.NegocioAutomoviles.Repository.VehiculosRepo;
import com.pizzaroni.NegocioAutomoviles.Repository.VentasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class VesIMPL extends CrudService<Ventas, Integer>{

    //Utilizar para metodos concretos no pertenecientes a la clase CrudService
    @Autowired
    private VentasRepo veRepo;


    @Override
    protected CrudRepository<Ventas, Integer> getRepository() {
        return null;
    }
}
