package com.pizzaroni.NegocioAutomoviles.Controller;


import com.pizzaroni.NegocioAutomoviles.Entity.Clientes;
import com.pizzaroni.NegocioAutomoviles.Entity.Vehiculos;
import com.pizzaroni.NegocioAutomoviles.Entity.Ventas;
import com.pizzaroni.NegocioAutomoviles.Service.IMPL.CSIMPL;
import com.pizzaroni.NegocioAutomoviles.Service.IMPL.VSIMPL;
import com.pizzaroni.NegocioAutomoviles.Service.IMPL.VesIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@org.springframework.web.bind.annotation.RestController
public class RestController {
    //Clases a controlar
    @Autowired
    private CSIMPL clienteService;

    @Autowired
    private VSIMPL vehiculoService;

    @Autowired
    private VesIMPL ventasService;

    //Controller methods

    //Clientes

    @GetMapping //Consultar
    @RequestMapping(value = "ConsultarClientes", method = RequestMethod.GET)
    public ResponseEntity<Clientes> ConsultarClientes(){
        List<Clientes> listaClientes = this.clienteService.Consultar();
        return ResponseEntity.ok((Clientes) listaClientes);
    }

    @GetMapping //Buscar
    @RequestMapping(value = "BuscarCliente", method = RequestMethod.GET)
    public ResponseEntity<Optional<Clientes>> BuscarCliente(@PathVariable int id){
        Optional<Clientes> cliente = this.clienteService.Buscar(id);
        return ResponseEntity.ok(cliente);
    }

    @PostMapping //Crear
    @RequestMapping(value = "CrearClientes", method = RequestMethod.POST)
    public ResponseEntity<Clientes> CrearCliente(@RequestBody Clientes cliente){
        Clientes clienteCreado = this.clienteService.Crear(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteCreado);
    }

    @PutMapping //Modificar
    @RequestMapping(value = "ModificarCliente/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Clientes> ModificarCliente(@RequestBody Clientes cliente){
        Clientes clienteModificado = this.clienteService.Modificar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteModificado);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarCliente/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Clientes> EliminarCliente(@PathVariable int id){
        clienteService.Eliminar(id);
        return ResponseEntity.ok().build();
    }

    //Vehiculos

    @GetMapping //Consultar
    @RequestMapping(value = "ConsultarVehiculos", method = RequestMethod.GET)
    public ResponseEntity<Vehiculos> ConsultarVehiculos(){
        List<Vehiculos> listaVehiculos = this.vehiculoService.Consultar();
        return ResponseEntity.ok((Vehiculos) listaVehiculos);
    }

    @GetMapping //Buscar
    @RequestMapping(value = "BuscarVehiculo", method = RequestMethod.GET)
    public ResponseEntity<Optional<Vehiculos>> BuscarVehiculo(@PathVariable int id){
        Optional<Vehiculos> vehiculo = this.vehiculoService.Buscar(id);
        return ResponseEntity.ok(vehiculo);
    }

    @PostMapping //Crear
    @RequestMapping(value = "CrearVehiculo", method = RequestMethod.POST)
    public ResponseEntity<Vehiculos> CrearVehiculo(@RequestBody Vehiculos vehiculo){
        Vehiculos VehiculosCreado = this.vehiculoService.Crear(vehiculo);
        return ResponseEntity.status(HttpStatus.CREATED).body(VehiculosCreado);
    }

    @PutMapping //Modificar
    @RequestMapping(value = "ModificarVehiculo/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Vehiculos> ModificarVehiculo(@RequestBody Vehiculos vehiculo){
        Vehiculos VehiculoModificado = this.vehiculoService.Modificar(vehiculo);
        return ResponseEntity.status(HttpStatus.CREATED).body(vehiculo);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarVehiculo/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Vehiculos> EliminarVehiculo(@PathVariable int id){
        vehiculoService.Eliminar(id);
        return ResponseEntity.ok().build();
    }
    //Ventas

    @GetMapping //Consultar
    @RequestMapping(value = "ConsultarVentas", method = RequestMethod.GET)
    public ResponseEntity<Ventas> ConsultarVentas(){
        List<Ventas> listaVentas = this.ventasService.Consultar();
        return ResponseEntity.ok((Ventas) listaVentas);
    }

    @GetMapping //Buscar
    @RequestMapping(value = "BuscarVentas", method = RequestMethod.GET)
    public ResponseEntity<Optional<Ventas>> BuscarVenta(@PathVariable int id){
        Optional<Ventas> Venta = this.ventasService.Buscar(id);
        return ResponseEntity.ok(Venta);
    }

    @PostMapping //Crear
    @RequestMapping(value = "CrearVentas", method = RequestMethod.POST)
    public ResponseEntity<Ventas> CrearVenta(@RequestBody Ventas venta){
        Ventas VentaCreada = this.ventasService.Crear(venta);
        return ResponseEntity.status(HttpStatus.CREATED).body(VentaCreada);
    }

    @PutMapping //Modificar
    @RequestMapping(value = "ModificarVenta/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Ventas> ModificarVenta(@RequestBody Ventas venta){
        Ventas VentaModificada = this.ventasService.Modificar(venta);
        return ResponseEntity.status(HttpStatus.CREATED).body(venta);
    }

    @DeleteMapping
    @RequestMapping(value = "EliminarVenta/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Ventas> EliminarVenta(@PathVariable int id){
        ventasService.Eliminar(id);
        return ResponseEntity.ok().build();
    }

}
