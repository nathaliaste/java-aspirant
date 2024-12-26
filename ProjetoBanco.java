import java.util.Scanner;

public class ProjetoBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeCliente;
        String tipoConta = ("Conta corrente");
        double saldoInicial = 1000.0;

        System.out.println("Bem-vindo ao banco Mega!Digite seus dados para ter acesso à sua conta \n");
        System.out.println("Digite seu nome completo: ");
        nomeCliente = scanner.nextLine();

        System.out.printf("""
            \n
                **************************************************
                    Seja Bem-vindo, %s, ao Banco Mega!
                **************************************************

                Dados do cliente:

                Nome:           %s.
                Tipo de Conta:  %s.
                Saldo Inicial:  %.2f

        """
               , nomeCliente, nomeCliente, tipoConta, saldoInicial);

        System.out.println("Operações");
        int escolha = 0;

        while (escolha != 4) {
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Receber valor");
            System.out.println("3. Transferir valor");
            System.out.println("4. Sair");
            System.out.print("*Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Seu saldo é de: " + saldoInicial);
            } else if (escolha == 2) {
                System.out.print("Informe o valor a receber: ");
                double valorReceber = scanner.nextDouble();
                double recebido = saldoInicial + valorReceber;
                System.out.println("Saldo atualizado: " + recebido);
            } else if (escolha == 3) {
                System.out.print("Informe o valor a tranferir: ");
                double valorTransfere = scanner.nextDouble();
                if (valorTransfere > saldoInicial) {
                    System.out.println("Saldo insuficiente");
                }
                double transfere = saldoInicial - valorTransfere;
                System.out.println("Saldo atualizado: " + transfere);
            } else if (escolha == 4) {
                System.out.println("Programa encerrado.");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}