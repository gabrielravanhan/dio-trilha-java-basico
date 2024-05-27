import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("R$ ###,###,##0.00");

        int numero;
        String agencia, nomeCliente;
        double saldo;

        System.out.print("Informe o número da conta: ");
        numero = sc.nextInt();

        System.out.print("Informe a agência da conta: ");
        agencia = sc.next();

        System.out.print("Informe o nome do cliente: ");
        nomeCliente = sc.next();

        System.out.print("Informe o saldo da conta: ");
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + df.format(saldo) + " já está disponível para saque.");
    }
}
