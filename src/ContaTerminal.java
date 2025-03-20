import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de sua Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número de sua Conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Digite seu Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o saldo da sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, " + 
                "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + 
                " já está disponível para efetuar saque saque.");

        scanner.close();
    }
}
