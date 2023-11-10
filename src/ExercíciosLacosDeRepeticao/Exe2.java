package ExercíciosLacosDeRepeticao;

import java.util.Scanner;

public class Exe2 {

	public static void main(String[] args) {
		
		int a=0,b=0,x;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite uma idade: ");
		x = leia.nextInt();
		
		while(x>0){
			if(x<21){
				a++; 
			}else if(x>50){
				b++; 
			}	
		
			System.out.println("\nDigite uma idade: ");
			x = leia.nextInt();
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: "+a);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+b);
			
}
}