package ExerciciosLacosDeDecisao;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		
		float a,b,c,soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com Valor de a: ");
		a = leia.nextFloat();
		System.out.println("\nEntre com Valor de b: ");
		b = leia.nextFloat();
		System.out.println("\nEntre com Valor de c: ");
		c = leia.nextFloat();
		
		if(a+b>c){
			System.out.println("\nA Soma de A + B é Maior do que C!");
		}else if(a+b<c){
			System.out.println("\nA Soma de A + B é Menor do que C!");
		}if(a+b==c){
			System.out.println("\nA Soma de A + B é igual a C!");
			

		}
			
		
	}

}
