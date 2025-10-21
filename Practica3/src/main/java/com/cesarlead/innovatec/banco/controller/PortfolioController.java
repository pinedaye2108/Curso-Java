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
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/portfolios/clientes/{clienteId}/cuentas")
public class PortfolioController {

}
