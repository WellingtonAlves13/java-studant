package org.bank.encapsulado;

public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setNumero(1521);
        System.out.println(conta.getNumero());

        Cliente alves = new Cliente();
        alves.setNome("Alves Santos");

        conta.setTitular(alves);

        System.out.println(conta.getTitular().getNome());
    }
}
