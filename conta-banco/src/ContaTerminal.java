import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.next();
        scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o valor do depósito inicial: ");
        double depositoInicial = scanner.nextDouble();

        System.out.println();
        System.out.println("Olá "
                + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia
                + ", conta "
                + numeroConta
                + " e seu saldo "
                + depositoInicial
                + " já está disponível para saque.");

        scanner.close();

    }
}
