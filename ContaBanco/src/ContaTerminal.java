import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Atributos da classe
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner input = new Scanner(System.in).useLocale(Locale.US); // Instancia a classe Scanner para caapturar as entradas no terminal
        
        System.out.println("Digite o número da sua conta: ");
        numero = input.nextInt();
        input.nextLine(); // Limpeza do terminal para não capturar a quebra de linha no próximo input

        System.out.println("Digite o número da sua agência: ");
        agencia = input.nextLine();

        System.out.println("Digite o seu nome completo: ");
        nomeCliente = input.nextLine();

        System.out.println("Digite o seu saldo: ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        input.close(); // Fechamennto da instancia do Scanner
    }
}
