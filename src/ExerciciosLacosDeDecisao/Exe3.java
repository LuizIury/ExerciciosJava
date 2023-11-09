package ExerciciosLacosDeDecisao;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		
		int lan,a;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\n\t\tMenu de Lanches e Bebidas");
		System.out.println("\n1- Cachorro Quente - R$ 10.00");
		System.out.println("\n2- X-Salada - R$ 15.00");
		System.out.println("\n3- X-Bacon - R$ 18.00");
		System.out.println("\n4- Bauru - R$ 12.00");
		System.out.println("\n5- Refrigerante - R$ 8.00");
		System.out.println("\n6- Suco de Laranja - R$ 13.00");
		System.out.println("\nEscolha a sua opção de Lanches ou Bebidas: ");
		lan = leia.nextInt();
		
		System.out.println("\n\t\tEscolha a quantidade: ");
		a = leia.nextInt();
		
		switch(lan) {
		case 1:
			System.out.println("\nProduto: Cachorro Quente e Valor total: R$1"+(a*10.00));
			break;
		case 2:
			System.out.println("\nProduto: X-Salada e Valor total: R$"+(a*15.00));
			break;
		case 3:
			System.out.println("\nProduto: X-Bacon e Valor total: R$"+(a*18.00));
			break;
		case 4:
			System.out.println("\nProduto: Bauru e Valor total:  R$"+(a*12.00));
			break;
		case 5:
			System.out.println("\nProduto: Refrigerante e Valor total: R$"+(a*8.00));
			break;
		case 6:
			System.out.println("\nProduto: Suco de Laranja e Valor total: R$"+(a*13.00));
			break;
			default:
				System.out.println("\nOpção Inválida!!!");
		}

	}

}
