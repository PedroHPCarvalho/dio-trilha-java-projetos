import java.util.Iterator;
import java.util.Scanner;


public class Contador {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o primeiro parametro");
		int parametroUm = sc.nextInt();
		
		sc.nextLine();
	
		System.out.println("Insira o segundo parametro");
		int parametroDois = sc.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parametro deve ser o MAIOR");
			System.out.println("Continuando programa");
		}
		
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O Primeiro Parametro deve ser menor que o Segundo Parametro");
		}
		
		
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o número "+i);
		}
	}
}
