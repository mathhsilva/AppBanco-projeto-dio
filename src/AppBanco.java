import banco.ContaTerminal;

public class AppBanco {
    public static void main(String[] args) {
        System.out.println("*********************************");
        System.out.println("* Bem-vindo(a) ao Banco NuLado! *");
        System.out.println("*********************************");

        ContaTerminal conta = new ContaTerminal();
        conta.obterDetalhesConta();
    }
}