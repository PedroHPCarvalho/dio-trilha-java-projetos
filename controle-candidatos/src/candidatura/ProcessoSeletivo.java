package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String [] candidatos = {"FELIPE","JOBSON","MARLI","ROSANA"};
		for (String candidato: candidatos) {
			ligarCandidato(candidato);
		}
	}
	static void ligarCandidato(String candidato) {
		int numeroTentativas = 1;
		boolean continuarTentandoContato = true;
		boolean candidatoAtendeu =  false;
		do {
			candidatoAtendeu = atender();
			continuarTentandoContato = !candidatoAtendeu;
			if (continuarTentandoContato == true) {
				numeroTentativas++;
			} else {
				System.out.println("Contato Realizado com sucesso");
			}
					
		} while(continuarTentandoContato == true && numeroTentativas < 3);
		
		if (candidatoAtendeu == true) {
			System.out.println("Conseguimos Contato com "+candidato+" em "+numeroTentativas+" Tentativas");
		} 
		if (candidatoAtendeu == false) {
			System.out.println("Não conseguimos contato com "+candidato+" em 3 tentativas");
		}
	}

 	static void imprimirSelecionados() {
		String[] candidatos = {"FELIPE","JONAS","MARCIA","ROBSON"};
		
		System.out.println("Imprimindo lista de candidatos");
		
		for(int index=0;index < candidatos.length; index++) {
			System.out.println("O candidato de n "+(index+1)+" é "+candidatos[index]);
		}
		
		System.out.println("Forma abreviada do for each");
		
		//forma abreviada
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi "+candidato);
		}
	}
	
	static void selecaoCandidatos(){
		String[] candidatos = {"Alice", "Bruno", "Carlos", "Daniela", "Eduardo", "Fernanda", "Gabriel", "Helena", "Igor", "Juliana"};
		
		int candidatosSelecionados = 0;
		int indexCandidatoAtual= 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && indexCandidatoAtual < candidatos.length) {
			String candidato = candidatos[indexCandidatoAtual];
			double salarioPretendido = valorPretendidoSimulado();
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato "+candidato+" foi selecionado para a vaga com o salario pretendido de "+salarioPretendido);
				candidatosSelecionados++;
			}
			indexCandidatoAtual++;
		}
	
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido){
			System.out.println("Ligar para o candidato");
		}else if(salarioBase == salarioPretendido){
			System.out.println("Ligar para candidato com contra proposta");
		}else{
			System.out.println("Aguardando outros candidatos");
		}
	}
 
	//metodo auxiliar
	static double valorPretendidoSimulado() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}

	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
}
