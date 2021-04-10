package com.apparkme.app.controller;

import com.apparkme.app.service.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vehiculos")
public class VehiculoRest {
    @Autowired
    private IVehiculoService vehiculoService;
}
