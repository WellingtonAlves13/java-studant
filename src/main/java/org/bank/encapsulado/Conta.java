package org.bank.encapsulado;

import org.bank.encapsulado.Cliente;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    public void deposita(double valor) {
        saldo += valor;
    }

    public double saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque efetuado");
            return valor;
        } else {
            System.out.println("Saque negado");
            return saldo;
        }
    }

    public Conta() {
    }

    public Conta(int agencia, int numero) {
        Conta.total++;
        //System.out.println("O total de contas é" + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
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
        if (agencia <= 0){
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
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

    public void retornaCliente(Conta conta, Cliente cliente){
        System.out.println("Cliente: " + conta.getTitular().getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Profissao: " + cliente.getProfissao());
        System.out.println("Agencia: " + conta.getAgencia());
        System.out.println("Numero da conta: " + conta.getNumero());
        System.out.println("Saldo disponivel R$: " + conta.getSaldo());

    }
    public static int getTotal(){
        return Conta.total;
    }

}


