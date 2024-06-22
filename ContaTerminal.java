import java.util.Scanner;


public class ContaTerminal{
    
    public static void main(String[] args) {
        // Criação do scanner para receber os dados via terminal
         Scanner scanner = new Scanner(System.in);
    
        // Solicitação e recebimento dos dados da conta bancária
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha deixada pelo nextInt()
    
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();
    
        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();
    
        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();
    
        // Exibição da mensagem formatada
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", 
                                              nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);
    
        // Fechamento do scanner
        scanner.close();
    }


}
