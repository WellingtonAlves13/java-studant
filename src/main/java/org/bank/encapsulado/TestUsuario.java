package org.bank.encapsulado;

import java.util.Scanner;

public class TestUsuario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Conta conta = new Conta();

        System.out.println("Informe seu nome");
        cliente.setNome((String) teclado.nextLine());
        System.out.println("Informe seu CPF");
        cliente.setCpf(teclado.nextLine());
        System.out.println("Informe sua profissao");
        cliente.setProfissao((String) teclado.nextLine());


        System.out.println("Informe sua agencia");
        conta.setAgencia(teclado.nextInt());
        conta.setTitular(cliente);
        System.out.println("Informe sua conta");
        conta.setNumero(teclado.nextInt());

        System.out.print("Deseja depositar? \n 1 - para sim \n");
        int escolha = teclado.nextInt();
        if(escolha == 1){
            System.out.println("Informe o valor para depositar");
            conta.deposita(teclado.nextInt());
        }

        System.out.println("Cliente: " + conta.getTitular().getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Profissao: " + cliente.getProfissao());
        System.out.println("Agencia: " + conta.getAgencia());
        System.out.println("Numero da conta: " + conta.getNumero());
        System.out.println("Saldo disponivel R$: " + conta.getSaldo());
    }

}
