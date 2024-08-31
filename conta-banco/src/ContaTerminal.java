import java.util.Scanner;

public class ContaTerminal {
	 public static void main(String[] args) {
		//TODO: Conhecer e importar a classe Scanner
		// Exibir as Mensagens para o usuario
		// Obter pela scanner os valores digitados no terminal
		// Exibir a mensagem de conta criada
		 
		 Scanner sc = new Scanner(System.in);
		 ContaDados cd = new ContaDados();
		 
		 System.out.println("Digite o Número da sua conta");
		 cd.setnConta(sc.nextInt());
		 sc.nextLine();
		 
		 
		 System.out.println("Digite o Número da sua Agencia");
		 cd.setsAgencia(sc.nextLine());
	 
		 
		 System.out.println("Digite o Nome do Titular da sua conta");
		 cd.setsNomeCliente(sc.nextLine());
		 
		 System.out.println("Digite o Saldo da sua conta");
		 cd.setdSaldo(sc.nextDouble());		 
	 
		 cd.exibirInfos();
	 }
}
