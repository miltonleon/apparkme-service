package com.apparkme.app.service;

import com.apparkme.app.domain.Vehiculo;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface IVehiculoService {
    List<Vehiculo> listAll();

    public Vehiculo getVehiculo(Long id);
    public void createVehiculo(Vehiculo vehiculo);


}




