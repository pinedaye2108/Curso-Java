package com.cesarlead.innovatec.banco.dto;

import java.math.BigDecimal;

public record CuentaDTO(
        Integer id,
        String tipo,
        String moneda,
        BigDecimal saldo
) {
}