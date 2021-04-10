package com.apparkme.app.repository;

import com.apparkme.app.domain.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVehiculoRepository extends JpaRepository<Vehiculo,Long>{
}
