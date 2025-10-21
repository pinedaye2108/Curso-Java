package com.cesarlead.innovatec.banco.mapper;

import com.cesarlead.innovatec.banco.dto.CuentaDTO;
import com.cesarlead.innovatec.banco.model.Cuenta;
import org.springframework.stereotype.Component;

@Component
public class mapperCuenta {
       public CuentaDTO toDTO (Cuenta cuenta) {return new CuentaDTO(
               cuenta.getId(),
               cuenta.getTipo(),
               cuenta.getMoneda(),
               cuenta.getSaldo()
       );}
    public Cuenta toEntity (CuentaDTO dto){return new Cuenta(
            dto.id(),
            dto.tipo(),
            dto.moneda(),
            dto.saldo()
    );}
}