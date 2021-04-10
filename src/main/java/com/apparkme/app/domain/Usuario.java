package com.apparkme.app.domain;

import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.List;

@Table(name="usuarios")

public class Usuario {
    private Long id;
    private String userName;
    @ManyToOne()
    private List<Vehiculo>vehiculos;

    public Usuario(Long id, String userName, List<Vehiculo> vehiculos) {
        this.id = id;
        this.userName = userName;
        this.vehiculos = vehiculos;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
}
