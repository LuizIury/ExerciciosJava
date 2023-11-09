package ExerciciosLacosDeDecisao;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		double a;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		a = leia.nextDouble();
		
		if(a>0 && a% 2 == 0){
			System.out.println("\nO número "+a+" é par e positivo!");
		}else if(a<0 && a% 2 == 1){
			System.out.println("\nO número "+a+" é ímpar e negativo!");
		}if(a<0 && a% 2 == 0){
			System.out.println("\nO número "+a+" é par e negativo!");
		}else if(a>0 && a% 2 == 1){
			System.out.println("\nO número "+a+" é ímpar e positivo!");
		}
		
	}

}
