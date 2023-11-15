package Fila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExeF1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		
		int op;
		
		do {
			
			System.out.println("\n****************************************");
			System.out.println("\n1- Adicionar clientes na fila");
			System.out.println("\n2- Listar todos os clientes da fila");
			System.out.println("\n3- Retiar clientes da fila");
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
					System.out.println("\nO nome não foi adicionado na fila...");
				}else {
				fila.add(nome);
				System.out.println("\nCliente adicionado...\n");
				}
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nLista de clientes da fila...");
				for(Iterator<String> it = fila.iterator();it.hasNext();) {
					System.out.println(it.next());
				}
				break;
				
			case 3:
				leia.nextLine();
				
				if(fila.isEmpty() == true) {
					System.out.println("\nA fila está vazia...");
				}else {
					System.out.printf("\nO (a) cliente %s foi chamado(a)!",fila.poll());
					System.out.println("\nFila: \n");

					for(Iterator<String> it = fila.iterator();it.hasNext();) {
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