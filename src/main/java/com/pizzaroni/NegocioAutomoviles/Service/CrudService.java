package com.pizzaroni.NegocioAutomoviles.Service;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public abstract class CrudService<T, ID> {
    protected abstract CrudRepository<T, ID> getRepository();
    public List<T> Consultar(){
        return (List<T>) getRepository().findAll();
    }
    public Optional<T> Buscar(ID id){return getRepository().findById(id);}
    public T Crear(T entidad){
        return getRepository().save(entidad);
    }
    public T Modificar(T entidad){
        return getRepository().save(entidad);
    }

    public void Eliminar(ID id){
        getRepository().deleteById(id);
    }
}
