package com.example.EjercicioComprension1.Model;

// 1. Renombramos la clase a singular: "Cuenta" (Account)
//    en lugar de "Cuentas" (Accounts), ya que la clase representa UNA sola cuenta.
public class Cuenta {

    // 2. Atributos en minúscula (camelCase) y nombres más claros.
    //    He renombrado "cuenta" a "numeroCuenta" para que sea más descriptivo.
    private String numeroCuenta;

    // 3. Eliminamos el atributo "cantidad" por ser innecesario.
    //    La cuenta solo necesita saber su saldo.
    private double saldo;

    // 4. Constructor actualizado solo con los atributos necesarios.
    public Cuenta(String numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    // 5. Getters y Setters (sin cambios de lógica, solo de nombres)
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        // 6. Corregimos el formato del toString
        return "Cuenta{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}