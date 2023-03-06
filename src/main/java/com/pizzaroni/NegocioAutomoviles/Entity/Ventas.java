package com.pizzaroni.NegocioAutomoviles.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "ventas")
public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Clientes cliente_id;

    @ManyToOne
    @JoinColumn(name = "vehiculo_id")
    private Vehiculos vehiculo_id;

    @Column(name = "fecha_venta")
    private LocalDate fecha_venta;

    @Column(name = "precio_venta")
    private BigDecimal precio_venta;

    //Getters and Setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Clientes getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(Clientes cliente_id) {
        this.cliente_id = cliente_id;
    }

    public Vehiculos getVehiculo_id() {
        return vehiculo_id;
    }

    public void setVehiculo_id(Vehiculos vehiculo_id) {
        this.vehiculo_id = vehiculo_id;
    }

    public LocalDate getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(LocalDate fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public BigDecimal getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(BigDecimal precio_venta) {
        this.precio_venta = precio_venta;
    }
}
