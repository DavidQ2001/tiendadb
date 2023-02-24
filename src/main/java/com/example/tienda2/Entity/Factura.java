package com.example.tienda2.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "facturas")
public class Factura implements Serializable {

    private static final Long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",nullable = false)
    private  Integer id;

    private String descripcion;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;
    @JsonIgnoreProperties({"hibernateLazyInitialize","handler"})
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "factura_id")
    private List<ITemFactura> items;

    @JsonIgnoreProperties({"facturas","hibernateLazyInitialize","handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    private Cliente cliente;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<ITemFactura> getItems() {
        return items;
    }

    public void setItems(List<ITemFactura> items) {
        this.items = items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @PrePersist
    public void prePersit(){
        this.fechaCreacion = new Date();
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
