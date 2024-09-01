package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		imprimirSelecionados();
	}
	static void imprimirSelecionados() {
		String[] candidatos = {"FELIPE","JONAS","MARCIA","ROBSON"};
		
		System.out.println("Imprimindo lista de candidatos");
		
		for(int index=0;index < candidatos.length; index++) {
			System.out.println("O candidato de n "+(index+1)+" é "+candidatos[index]);
		}
		
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
	
	static double valorPretendidoSimulado() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
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
}
