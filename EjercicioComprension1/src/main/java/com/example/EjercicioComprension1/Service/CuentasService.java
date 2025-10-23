package com.example.EjercicioComprension1.Service;

import com.example.EjercicioComprension1.Model.Cuentas;

public class CuentasService {
    // Método para ingresar dinero
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            double saldoDespuesDeRetiro = this.saldo - cantidad;
            if (saldoDespuesDeRetiro < 0) {
                this.saldo = 0;
            } else {
                this.saldo = saldoDespuesDeRetiro;
            }
        }
    }

}
