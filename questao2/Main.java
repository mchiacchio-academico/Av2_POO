package questao2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		alunoEnem a1 = new alunoEnem(0, null, 0);
		System.out.println("Digite o ID do aluno: ");
		a1.setId_aluno(ler.nextInt());
		System.out.println("Digite o nome do aluno: ");
		a1.setNome(ler.next());
		System.out.println("Digite o ano do aluno: ");
		a1.setAno(ler.nextInt());
		
		//
		
		ArrayList<provaEnem>provas = new ArrayList<> ();
		
		double notaFinal=0;
		for(int i=0; i<5; i++) {
			System.out.println("Digite o ID da prova: ");
			int id_prova = ler.nextInt();
			System.out.println("Digite o titulo da prova: ");
			String titulo = ler.next();
			System.out.println("Digite a nota da prova: ");
			int nota = ler.nextInt();
			
			provaEnem prova = new provaEnem (id_prova, titulo, nota);
			provas.add(prova);
			notaFinal += prova.getNota();
		}
		
		System.out.println("Nota final: "+ notaFinal);
	}
}
