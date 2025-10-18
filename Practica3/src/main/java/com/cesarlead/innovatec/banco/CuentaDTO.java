package com.cesarlead.innovatec.banco;

import java.math.BigDecimal;

public record CuentaDTO(
        Integer id,
        String tipo,
        String moneda,
        BigDecimal saldo
) {
}