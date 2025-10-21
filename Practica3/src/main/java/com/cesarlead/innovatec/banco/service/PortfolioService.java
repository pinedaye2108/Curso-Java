package com.cesarlead.innovatec.banco.service;

import com.cesarlead.innovatec.banco.model.Cuenta;
import com.cesarlead.innovatec.banco.dto.CuentaDTO;
import com.cesarlead.innovatec.banco.repository.CuentaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class PortfolioService {
    private CuentaRepository cuentaRepository;

    public List<Cuenta> getPortfolioFiltrado(Integer clienteId, String tipoCuenta, BigDecimal saldoMinimo) {
        List<Cuenta> cuentasDelCliente = cuentaRepository.buscarPorClienteId(clienteId);
        Stream<Cuenta> stream = cuentasDelCliente.stream();

        if (tipoCuenta != null && !tipoCuenta.isEmpty()) {
            stream = stream.filter(c -> c.getTipo().equalsIgnoreCase(tipoCuenta));
        }
        if (saldoMinimo != null) {
            stream = stream.filter(c -> c.getSaldo().compareTo(saldoMinimo) > 0);
        }

        return stream.collect(Collectors.toList());
    }

}
