package com.pizzaroni.NegocioAutomoviles.Repository;

import com.pizzaroni.NegocioAutomoviles.Entity.Clientes;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepo extends CrudRepository<Clientes,Integer> {
}
