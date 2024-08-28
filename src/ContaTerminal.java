import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agenciaBanco;
        String nomeCliente;
        float saldo = 0F;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Por favor, digite o número da conta.");
            numeroConta = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("O campo 'NÚMERO DA CONTA' precisa ser numérico.");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta.");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o número da Agência.");
        agenciaBanco = scanner.next();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Agora digite o seu nome.");
        nomeCliente = scanner1.nextLine();

        try {
            System.out.println("Digite seu saldo.");
            saldo = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.err.println("O campo 'SALDO' precisa ser numérico.");
        }

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agenciaBanco + ", conta " + numeroConta + " e seu saldo " + saldo +
                " já está disponível para saque.");
    }
}