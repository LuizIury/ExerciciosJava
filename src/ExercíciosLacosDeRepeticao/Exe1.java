package ExercíciosLacosDeRepeticao;

import java.util.Scanner;

public class Exe1 {

	public static void main(String[] args) {
		
		int a,b,x;
		
		Scanner leia = new Scanner(System.in);
		
		
		System.out.println("\nEntre com o primeiro número do intervalo: ");
		a = leia.nextInt();
		System.out.println("\nEntre com o segundo número do intervalo: ");
		b = leia.nextInt();
		
		
		if(a>b) {
			System.out.println("\nIntervalo inválido!");
		}else if(a<b) {
			for(x=a;x<=b;x++){
				if((x%3==0) && (x%5==0)) {
					System.out.println("\n"+x+" é múltiplo de 3 e 5");
				}
				
			}
		}
				
	}

}
