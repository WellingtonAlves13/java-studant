package org.bank.encapsulado;

public class TestGeral {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Conta conta = new Conta();

        cliente.setNome("Alves Santos");
        cliente.setCpf("222.444.888-08");
        cliente.setProfissao("Developer");

        conta.setTitular(cliente);
        conta.setAgencia(2115);
        conta.setNumero(603037);
        conta.deposita(2000);

        System.out.println("Cliente: " + conta.getTitular().getNome());
        System.out.println("CPF: " + cliente.getCpf());
        System.out.println("Profissao: " + cliente.getProfissao());
        System.out.println("Agencia: " + conta.getAgencia());
        System.out.println("Numero da conta: " + conta.getNumero());
        System.out.println("Saldo disponivel R$: " + conta.getSaldo());


    }
}
