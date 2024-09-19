import java.util.Locale;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.err.println("Porfavor Digite o número da Agência !");
        int numero = scanner.nextInt();

        System.err.println("Porfavor Digite a Agência !");
        String agencia = scanner.next();

        System.err.println("Porfavor Digite Seu Nome !");
        String nomeCliente = scanner.next();

        System.err.println("Seu Saldo !");
        Double saldo = scanner.nextDouble();
        
        System.out.println("Olá" + " " + nomeCliente + "," + "obrigado por criar uma conta em nosso banco, sua agência é" + " " + agencia +","+ "conta" + " " + numero + " " + "e seu saldo " + saldo + " " + "já está disponível para saque");
    }
}
