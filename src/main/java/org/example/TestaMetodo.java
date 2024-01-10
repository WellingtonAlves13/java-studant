package org.example;

public class TestaMetodo {
    public static void main(String[] args) {

        Conta minhaConta = new Conta();

        minhaConta.getSaldo();
        minhaConta.deposita(50);
        System.out.println(minhaConta.getSaldo());

        boolean consegueRetirar = minhaConta.saca(20);
        System.out.println(minhaConta.getSaldo());
        System.out.println(consegueRetirar);

        Conta segundaConta = new Conta();
        segundaConta.deposita(1000);

        boolean sucessoTransferencia = segundaConta.transfere(300, minhaConta);
        if (sucessoTransferencia) {
            System.out.println("transferencia com sucesso");
        } else {
            System.out.println("Faltou dinheiro");
        }
        System.out.println(segundaConta.getSaldo());
        System.out.println(minhaConta.getSaldo());


    }
}
