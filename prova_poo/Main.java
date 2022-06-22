package prova_poo;

import java.util.Scanner;

import questao2.alunoEnem;

public class Main {

	public static void main(String[] args) {

		
		Scanner ler=new Scanner(System.in);
		
		Publicacao p1 = new Publicacao(null, null, null);
		System.out.println("Digite a data da publicação: ");
		p1.setDataPublicacao(ler.next());
		System.out.println("Digite o texto da publicação: ");
		p1.setTextoPublicacao(ler.next());
		System.out.println("Digite o link midia: ");
		p1.setLinkMidia(ler.next());
		
		Publicacao p2 = new Publicacao(null, null, null);
		System.out.println("Digite a data da publicação: ");
		p2.setDataPublicacao(ler.next());
		System.out.println("Digite o texto da publicação: ");
		p2.setTextoPublicacao(ler.next());
		System.out.println("Digite o link midia: ");
		p2.setLinkMidia(ler.next());
		
		p1.imprimePublicacoes();
		p2.imprimePublicacoes();
	}

}
