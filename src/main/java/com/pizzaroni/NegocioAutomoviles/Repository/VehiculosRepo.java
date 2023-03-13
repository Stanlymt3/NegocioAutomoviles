package com.pizzaroni.NegocioAutomoviles.Repository;

import com.pizzaroni.NegocioAutomoviles.Entity.Vehiculos;
import org.springframework.data.repository.CrudRepository;

public interface VehiculosRepo extends CrudRepository<Vehiculos,Integer> {
}
