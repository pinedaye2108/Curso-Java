package com.cesarlead.innovatec.banco.controller;

import com.cesarlead.innovatec.banco.dto.CuentaDTO;
import com.cesarlead.innovatec.banco.model.Cuenta;
import com.cesarlead.innovatec.banco.service.PortafolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

    @RestController
    @RequestMapping("/api/v1/portfolios/clientes/{clienteId}/cuentas")
    public class PortafolioController {

        @Autowired
        private PortafolioService portafolioService;

        public PortafolioController(PortafolioService portafolioService) {
        }

        @GetMapping
        public List<Cuenta> cuenta() {
            return (cuenta());
        }


        public ResponseEntity<?> getCuentasByClienteId(@PathVariable Long clienteId) {

            // 2. Verifica si el cliente existe
            if (clienteId == null) { // O una comprobación que indique que el cliente no existe
                return ResponseEntity.notFound().build(); // 404 Not Found si el cliente no existe
            }

            // 3. Verifica si hay resultados de búsqueda
            if (clienteId == 0 ) {
                return ResponseEntity.ok(Collections.emptyList()); // 200 OK con lista vacía si el cliente existe pero no hay coincidencias
            } else {
                return ResponseEntity.ok(clienteId); // 200 OK con la lista de CuentasDTO
            }
        }
    }

