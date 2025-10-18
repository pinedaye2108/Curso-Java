package com.cesarlead.innovatec.banco.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.cesarlead.innovatec.banco.model.Cuenta;
import com.cesarlead.innovatec.banco.service.PortfolioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cuenta")


public class PortfolioController {
    private final PortfolioService.cuentaRepository;

    public CuentaController(PortfolioService cuentaService) {
        this.cuentaService = cuentaService;
    }

    @GetMapping
    public List<Cuenta> Cuenta() {
        return cuentaService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cuenta> getCuentaById(@PathVariable Integer id) {
        return cuentaService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}



}
