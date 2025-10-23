package com.example.EjercicioComprension1.Model;

public class Cuentas {
    //atributos de la clase Cuentas
    private String Cuenta;
    private double Cantidad;
    private double Saldo;

    // constructor de los atributos de la clase Cuentas
    public Cuentas(String Cuenta, double Cantidad, double Saldo) {
        this.Cuenta = Cuenta;
        this.Cantidad = Cantidad;
        this.Saldo = Saldo;
    }

    //setter
    public void setCuenta(String cuenta) {
        Cuenta = cuenta;
    }

    public void setCantidad(double cantidad) {
        Cantidad = cantidad;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
    //getter

    public String getCuenta() {
        return Cuenta;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public double getSaldo() {
        return Saldo;
    }

    //crear metodo to String
    @Override
    public String toString() {
        return "Cuentas" +
                "Cuenta='" + Cuenta + '\'' +
                ", Cantidad=" + Cantidad +
                ", Saldo=" + Saldo +
                '}';
    }
}
