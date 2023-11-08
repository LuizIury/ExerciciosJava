package JavaInicial;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		
		float salb,an,he,des,sl;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite seu Salário Bruto: ");
		salb = leia.nextFloat();
		System.out.println("\nDigite seu Adicional Noturno: ");
		an = leia.nextFloat();
		System.out.println("\nDigite suas Horas Extras: ");
		he = leia.nextFloat();
		System.out.println("\nDigite seus Descontos: ");
		des = leia.nextFloat();

		sl = (salb+an+(he*5)-des);
		
		System.out.println("\nSeu Salário líquido é de: "+sl);
	}

}
