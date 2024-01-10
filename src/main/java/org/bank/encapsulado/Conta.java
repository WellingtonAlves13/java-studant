package org.bank.encapsulado;

import org.bank.encapsulado.Cliente;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;

    public void deposita(double valor) {
        saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }
        return false;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero(){ return this.numero;}

    public void setNumero(int numero){ this.numero = numero; }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Cliente getTitular(){
        return titular;
    }

}


