package com.example.EjercicioComprension1;

import com.example.EjercicioComprension1.Model.Cuenta;
import com.example.EjercicioComprension1.Service.CuentasService;

public class Main {
    public static void main(String[] args) {

        // 1. Creamos el MODELO (la caja fuerte)
        // Creamos una cuenta para "Yelitza" con un saldo inicial de 1000.0
        Cuenta cuentaDeYelitza = new Cuenta("YEL-12345", 1000.0);
        System.out.println("Estado inicial: " + cuentaDeYelitza);

        // 2. Creamos el SERVICIO (el cajero)
        CuentasService servicioBancario = new CuentasService();

        // 3. Usamos el SERVICIO para operar sobre el MODELO

        // Caso 1: Ingresar 500
        System.out.println("\n--- Intentando ingresar 500 ---");
        servicioBancario.ingresar(cuentaDeYelitza, 500.0);

        // 4. Verificación
        // Salida esperada: Saldo 1500.0
        System.out.println("Estado actual: " + cuentaDeYelitza);


        // Caso 2: Retirar 200
        System.out.println("\n--- Intentando retirar 200 ---");
        servicioBancario.retirar(cuentaDeYelitza, 200.0);

        // 4. Verificación
        // Salida esperada: Saldo 1300.0
        System.out.println("Estado actual: " + cuentaDeYelitza);


        // Caso 3: Retirar más de lo que hay (1500)
        System.out.println("\n--- Intentando retirar 1500 ---");
        servicioBancario.retirar(cuentaDeYelitza, 1500.0);

        // 4. Verificación (según tu lógica original)
        // Salida esperada: Saldo 0.0
        System.out.println("Estado actual: " + cuentaDeYelitza);
    }
}
