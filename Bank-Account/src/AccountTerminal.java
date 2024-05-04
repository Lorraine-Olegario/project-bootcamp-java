import java.math.BigDecimal;
import java.util.Scanner;
import java.util.Locale;

public class AccountTerminal {

    public static void main(String[] args) {

        System.out.print("##### Abertura de conta BANCO CDB ##### \n\n");
        Scanner read = new Scanner(System.in).useLocale(Locale.US);;
        System.out.print("Digite o Nome do Cliente: ");
        String name = read.nextLine();

        System.out.print("Digite o Número da agencia: ");
        String agency = read.nextLine();

        System.out.print("Digite o Número da Conta: ");
        int number = read.nextInt();

        System.out.print("Digite o Saldo inicial do cliente: ");
        BigDecimal balance = read.nextBigDecimal();

        System.out.print("\n\n########## BANCO CDB ##########\n\n");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, " +
                "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                name, agency, number, balance);
    }
}