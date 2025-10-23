package com.example.EjercicioComprension1.Service;

// Importamos el modelo corregido (ahora singular)
import com.example.EjercicioComprension1.Model.Cuenta;

public class CuentasService {

    /**
     * Método para ingresar dinero EN UNA CUENTA ESPECÍFICA.
     *
     * @param cuenta   El objeto Cuenta que será modificado.
     * @param cantidad El monto a ingresar.
     */
    public void ingresar(Cuenta cuenta, double cantidad) {
        // 1. Validamos que la cantidad sea positiva.
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a ingresar debe ser positiva.");
            return; // Salimos del método si no es válida.
        }

        // 2. Obtenemos el saldo ACTUAL de la cuenta.
        double saldoActual = cuenta.getSaldo();

        // 3. Calculamos el nuevo saldo.
        double nuevoSaldo = saldoActual + cantidad;

        // 4. Actualizamos el saldo EN LA CUENTA (usando su setter).
        //    No usamos "this.saldo", usamos "cuenta.setSaldo()".
        cuenta.setSaldo(nuevoSaldo);

        System.out.println("Ingreso exitoso. Nuevo saldo: " + nuevoSaldo);
    }

    /**
     * Método para retirar dinero DE UNA CUENTA ESPECÍFICA.
     *
     * @param cuenta   El objeto Cuenta que será modificado.
     * @param cantidad El monto a retirar.
     */
    public void retirar(Cuenta cuenta, double cantidad) {
        // 1. Validamos que la cantidad sea positiva.
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a retirar debe ser positiva.");
            return;
        }

        // 2. Obtenemos el saldo actual.
        double saldoActual = cuenta.getSaldo();

        // 3. Lógica de negocio (Overdraft): ¿Qué pasa si intento sacar más de lo que tengo?
        //    Tu lógica original ponía el saldo en 0.
        if (cantidad > saldoActual) {
            System.out.println("Fondos insuficientes. Se retirará el saldo total disponible.");
            cuenta.setSaldo(0);
        } else {
            // 4. Si hay fondos, calculamos y actualizamos.
            double nuevoSaldo = saldoActual - cantidad;
            cuenta.setSaldo(nuevoSaldo);
            System.out.println("Retiro exitoso. Nuevo saldo: " + nuevoSaldo);
        }
    }
}