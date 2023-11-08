package JavaInicial;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
	
		float sal,abo,novosal;
			
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o salário: ");
		sal = leia.nextFloat();
		System.out.println("\nEntre com o abono: ");
		abo = leia.nextFloat();
		
		novosal = (sal+abo);
		System.out.println("\nO seu novo saário é: "+novosal);	 
	}

}
