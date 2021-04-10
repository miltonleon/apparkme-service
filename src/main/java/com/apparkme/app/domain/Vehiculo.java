package com.apparkme.app.domain;

import javax.persistence.Table;
import java.io.Serializable;

@Table(name = "vehiculos")

public class Vehiculo {
    private Long id;
    private String descripcion;
    private String tipo;
    private String patente;

    public Vehiculo(Long id, String descripcion, String tipo, String patente) {
        this.id = id;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.patente = patente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
