# Conta Terminal

Este projeto é um programa simples em Java que simula a criação de uma conta bancária, permitindo a inserção de detalhes da conta pelo usuário via terminal. O programa valida os dados inseridos e exibe uma mensagem de confirmação com as informações da conta.

## Estrutura do Projeto


`ContaTerminal
├── src
│   └── banco
│       └── ContaTerminal.java
└── README.md` 

## Pré-requisitos

-   JDK 8 ou superior
-   IntelliJ IDEA ou outra IDE Java

## Como Executar o Projeto

1.  **Clonar o Repositório**:
    
    `git clone https://github.com/seu-usuario/ContaTerminal.git
    cd ContaTerminal` 
    
2.  **Abrir o Projeto na IDE**:
    
    -   Abra a IntelliJ IDEA (ou outra IDE Java de sua preferência).
    -   Importe o projeto como um projeto Maven existente (ou simplesmente abra a pasta do projeto).
3.  **Compilar e Executar**:
    
    -   Navegue até a classe `ContaTerminal` no pacote `banco`.
    -   Execute o método `main` da classe `ContaTerminal`.

## Funcionalidades

-   Solicita ao usuário que insira:
    -   Número da Conta (inteiro)
    -   Número da Agência (texto, até 6 caracteres)
    -   Nome do Cliente (texto, até 30 caracteres)
-   Exibe uma mensagem de confirmação com os detalhes da conta.
-   Valida o comprimento dos campos `agencia` e `nomeCliente`.

## Exemplo de Uso

`Por favor, digite o número da Conta:
1021
Por favor, digite o número da Agência:
067-8
Por favor, digite o nome do Cliente:
MARIO ANDRADE
Esse é seu saldo inicial: R$237.48
Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo R$237.48 já está disponível para saque.` 

## Código-Fonte

package banco;

import java.util.Scanner;

public class ContaTerminal {
    int numeroConta;
    String agencia;
    String nomeCliente;
    double saldo = 237.48;

    public void obterDetalhesConta() {
        Scanner scanner = new Scanner(System.in);

        // Limites de caracteres
        int maxAgenciaLength = 6; // exemplo: "067-8"
        int maxNomeClienteLength = 30; // exemplo: "MARIO ANDRADE"

        // Leitura e validação do número da conta
        System.out.println("Por favor, digite o número da Conta:");
        this.numeroConta = Integer.parseInt(scanner.next());

        // Limpar buffer do scanner
        scanner.nextLine();

        // Leitura e validação da agência
        while (true) {
            System.out.println("Por favor, digite o número da Agência:");
            this.agencia = scanner.nextLine();
            if (this.agencia.length() <= maxAgenciaLength) {
                break;
            } else {
                System.out.println("Número da Agência deve ter no máximo " + maxAgenciaLength + " caracteres. Tente novamente.");
            }
        }

        // Leitura e validação do nome do cliente
        while (true) {
            System.out.println("Por favor, digite o nome do Cliente:");
            this.nomeCliente = scanner.nextLine();
            if (this.nomeCliente.length() <= maxNomeClienteLength) {
                break;
            } else {
                System.out.println("Nome do Cliente deve ter no máximo " + maxNomeClienteLength + " caracteres. Tente novamente.");
            }
        }

        // Exibir saldo inicial
        System.out.println("Esse é seu saldo inicial: R$" + saldo);

        // Exibir mensagem formatada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldo + " já está disponível para saque.");

        // Fechar o scanner
        scanner.close();
    }

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.obterDetalhesConta();
    }
}

## Contribuição

1.  Faça um fork do projeto.
2.  Crie uma branch para sua feature (`git checkout -b feature/AmazingFeature`).
3.  Faça commit das suas alterações (`git commit -m 'Add some AmazingFeature'`).
4.  Faça push para a branch (`git push origin feature/AmazingFeature`).
5.  Abra um Pull Request.

----------

Desfrute de seu uso! Se você tiver alguma dúvida ou sugestão, sinta-se à vontade para abrir uma issue ou enviar um pull request.
