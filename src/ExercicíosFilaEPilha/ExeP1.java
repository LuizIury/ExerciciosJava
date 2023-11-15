package Pilha;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExeP1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();
		
		int op;
		
		do {
			System.out.println("\n****************************************");
			System.out.println("\n1- Adicionar livro na pilha");
			System.out.println("\n2- Listar todos os livros da pilha");
			System.out.println("\n3- Retiar livros da pilha");
			System.out.println("\n0- Sair\n");
			System.out.println("\n****************************************");
			System.out.println("\nEntre com a opção desejada: ");
			op = leia.nextInt();
			
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o seu nome:");
				String nome = leia.nextLine();
				if(nome.isEmpty()) {
					System.out.println("\nO Livro não foi adicionado na pilha...");
				}else {
				pilha.push(nome);
				System.out.println("\nLivro adicionado...\n");
				}
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nLista da pilha de livros...\n");
				for(Iterator<String> it = pilha.iterator();it.hasNext();) {
					System.out.println(it.next());
				}
				break;
				
			case 3:
				leia.nextLine();
				
				if(pilha.isEmpty() == true) {
					System.out.println("\nA pilha está vazia...");
				}else {
					System.out.printf("\nO livro %s foi retirado!",pilha.pop());
					System.out.println("\nPilha: \n");

					for(Iterator<String> it = pilha.iterator();it.hasNext();) {
						System.out.println(it.next());
					}
					System.out.println();
					
				}
				break;
				
			case 0:
				System.out.println("\nPrograma finalizado...");
				break;
				
				default:
					System.out.println("\nOpção inválida!!!");
			}
			
			
		}while(op !=0);

	}

}
