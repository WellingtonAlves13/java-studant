package org.example;

public class TesteSacaNegativo {
    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.deposita(200);
       // System.out.println(conta.saca(101));

        conta.saca(100);
        System.out.println(conta.getSaldo());

    }

}
