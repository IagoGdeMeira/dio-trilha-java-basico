import java.util.Scanner;

public class ContaTerminal {
    private static int numero = 0;
    private static String agencia = "";
    private static String nomeCliente = "";
    private static double saldo = 0.0;

    public static void main(String[] args) throws Exception {
        informarDados();

        System.out.printf("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência"+
            "é %s, conta %d e seu saldo R$%.2f já está disponível para saque.\n", nomeCliente, agencia, numero, saldo);
    }

    private static void informarDados() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, informe o número da conta: ");
        numero = sc.nextInt();

        System.out.print("Por favor, informe o número da sua agência: ");
        agencia = sc.next();

        System.out.print("Por favor, informe o seu nome: ");
        nomeCliente = sc.next();

        System.out.print("Por favor, informe o saldo da sua conta: ");
        saldo = sc.nextDouble();
    }
}
