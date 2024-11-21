import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
       
  
        System.out.println("Por favor, iforme nome do cliente!");
        String nomeCliente = input.nextLine();

        System.out.println("Por favor, iforme número de agência da conta!");
        String agencia = input.nextLine();
        
        System.out.println("Por favor, iforme número da conta!");
        String numero = input.nextLine();

        System.out.println("Por favor, informe saldo da conta!");
         double saldo = input.nextDouble();

      System.out.println("Olá, " + nomeCliente + " , obrigado por criar um conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        
        
    }
}
