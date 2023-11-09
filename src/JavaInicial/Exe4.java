package JavaInicial;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		
		float n1,n2,n3,n4,calculo;
		
		Scanner ler = new Scanner(System.in); 
		
		System.out.println("\nEntre com o valor N1: ");
		n1 = ler.nextFloat();
		System.out.println("\nEntre com o valor N2: ");
		n2 = ler.nextFloat();
		System.out.println("\nEntre com o valor N3: ");
		n3 = ler.nextFloat();
		System.out.println("\nEntre com o valor N4: ");
		n4 = ler.nextFloat();
		
		calculo = (n1*n2)-(n3*n4);
		System.out.println("\nValor do calculo: "+calculo);
		

	}

}
