package com.apparkme.app.service.impl;

import com.apparkme.app.domain.Vehiculo;
import com.apparkme.app.repository.IVehiculoRepository;
import com.apparkme.app.service.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculosServiceImpl implements IVehiculoService {
    @Autowired
    private IVehiculoRepository vehiculoRepository;
    @Override
    public List<Vehiculo> listAll() {

        return vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo getVehiculo(Long id) {
        return null;
    }

    @Override
    public void createVehiculo(Vehiculo vehiculo) {

    }
}
