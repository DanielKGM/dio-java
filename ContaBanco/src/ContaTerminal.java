
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int numero;
        String agencia;
        String nomeCliente;
        final double SALDO = 69.24;

        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.next();

        System.out.println("Por favor, digite o número da Conta !");
        numero = sc.nextInt();

        sc.nextLine();
        System.out.println("Por favor, digite o nome do Cliente !");
        nomeCliente = sc.nextLine();

        sc.close();

        System.out.println(String.format(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeCliente, agencia, numero, SALDO));
    }
}
