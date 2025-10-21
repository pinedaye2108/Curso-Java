package com.cesarlead.innovatec.banco.model;

import java.math.BigDecimal;

public class Cuenta {
    private Integer id;
    private Integer clienteId;
    private String tipo;
    private String moneda;
    private BigDecimal saldo;

    public Cuenta(Integer id, String tipo, String moneda, BigDecimal saldo) {
    }
    // Getters, Setters y Constructor...

    //getters
    public Integer getClienteId() {
        return clienteId;
    }
    public Integer getId() {
        return id;
    }
    public BigDecimal getSaldo() {
        return saldo;
    }
    public String getMoneda() {
        return moneda;
    }
    public String getTipo() {
        return tipo;
    }

    //setters
    public void setClienteId(Integer clienteId) {this.clienteId = clienteId;}
    public void setId(Integer id) {
        this.id = id;
    }
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    //constructor
    public Cuenta (Integer id, Integer clienteId, String tipo, String moneda, BigDecimal saldo) {
        this.id = id;
        this.clienteId = clienteId;
        this.tipo = tipo;
        this.moneda = moneda;
        this.saldo = saldo;
    }
}

