package ExercíciosLacosDeRepeticao;

import java.util.Scanner;

public class Exe3 {

	public static void main(String[] args) {
		
		int x,y=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite um número: ");
		x = leia.nextInt();
		
		do{
			if(x>0) {
				y += x;
			}
			System.out.println("\nDigite um número: ");
			x = leia.nextInt();
			
		}while(x != 0);
		
		System.out.println("\nA soma dos número positivos é: "+y);
	}

}
