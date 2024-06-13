import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        int conta = 0;
        String agencia;
        String nome = "Jonathan";
        double saldo = 237.48;

        Scanner sc = new Scanner(System.in);

        System.out.println("bem vindo ao banco ganhe mais, para começar criar sua conta siga os proximos passos:");
        System.out.println();

        System.out.println("Por favor insira o numero da conta: ");
        conta = sc.nextInt();
        

        System.out.println("Por favor insira o numero da agencia por exemplo 12345-0");
        agencia = sc.next();
        
        // saida Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque"
        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + " conta "+ conta+" e seu saldo "+ saldo+" ja está disponivel para saque");

    }
}
