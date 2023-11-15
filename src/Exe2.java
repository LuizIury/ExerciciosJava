package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exe2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		for(int i=0;i<10;i++) {
		System.out.println("\nDigite o "+(i+1)+"° número: ");
		meuSet.add(leia.nextInt()); 
		}
		System.out.println("\nListando dados do Set: \n");
		
		Iterator<Integer> iterator = meuSet.iterator();
			
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}
