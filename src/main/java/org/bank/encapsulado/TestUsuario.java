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

        System.out.print("Deseja depositar? \n SIM ou NAO \n");
        String escolha = teclado.next();
        if (escolha.equals("SIM") || escolha.equals("sim")) {
            System.out.println("Informe o valor para depositar");
            conta.deposita(teclado.nextInt());
        }

        System.out.print("Deseja sacar? \n SIM ou NAO \n");
        escolha = teclado.next();
        if (escolha.equals("SIM") || escolha.equals("sim")) {
            System.out.println("Informe o valor para sacar");
            conta.saca(teclado.nextInt());
        }
        conta.retornaCliente(conta, cliente);

//        System.out.println("Cliente: " + conta.getTitular().getNome());
//        System.out.println("CPF: " + cliente.getCpf());
//        System.out.println("Profissao: " + cliente.getProfissao());
//        System.out.println("Agencia: " + conta.getAgencia());
//        System.out.println("Numero da conta: " + conta.getNumero());
//        System.out.println("Saldo disponivel R$: " + conta.getSaldo());

        teclado.close();
    }


}
