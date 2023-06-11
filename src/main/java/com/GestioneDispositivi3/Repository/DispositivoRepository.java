package com.GestioneDispositivi3.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.GestioneDispositivi3.model.Dispositivo;
@Repository
public interface DispositivoRepository extends CrudRepository<Dispositivo, Long> {

}
