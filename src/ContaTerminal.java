import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agenciaBanco;
        String nomeCliente;
        float saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da conta.");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o número da Agência.");
        agenciaBanco = scanner.next();

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Agora digite o seu nome.");
        nomeCliente = scanner1.nextLine();

        System.out.println("Digite seu saldo.");
        saldo = scanner.nextFloat();

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agenciaBanco + ", conta " + numeroConta + " e seu saldo " + saldo +
                " já está disponível para saque.");
    }
}