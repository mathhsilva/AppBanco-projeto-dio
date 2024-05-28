package banco;

import java.util.Scanner;

public class ContaTerminal {
    int numeroConta;
    String agencia;
    String nomeCliente;
    double saldo = 237.48;

    public void obterDetalhesConta(){
        Scanner scanner = new Scanner(System.in);
        int maxAgenciaLength = 6;
        int maxNomeClienteLength = 30;

        System.out.println("Por favor, digite o número da Conta:");
        this.numeroConta = Integer.parseInt(scanner.next());

        scanner.nextLine();

        while (true) {
            System.out.println("Por favor, digite o número da Agência:");
            this.agencia = scanner.nextLine();
            if (this.agencia.length() <= maxAgenciaLength) {
                break;
            } else {
                System.out.println("Número da Agência deve ter no máximo " + maxAgenciaLength + " caracteres. Tente novamente.");
            }
        }

        while (true) {
            System.out.println("Por favor, digite o nome do Cliente:");
            this.nomeCliente = scanner.nextLine();
            if (this.nomeCliente.length() <= maxNomeClienteLength) {
                break;
            } else {
                System.out.println("Nome do Cliente deve ter no máximo " + maxNomeClienteLength + " caracteres. Tente novamente.");
            }
        }

        System.out.println("Esse é seu saldo inicial: R$" + saldo);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta "+ numeroConta +" e seu saldo R$"+saldo + " já está disponível para saque.");

        scanner.close();
    }
}
