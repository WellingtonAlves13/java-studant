package org.example;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente alves = new Cliente();
        alves.nome = "Wellington Alves";
        alves.cpf = "222.222.222-22";
        alves.profissao = "programador";

        Conta contaDoAlves = new Conta();
        contaDoAlves.deposita(100);

        contaDoAlves.titular = alves;
    }
}
