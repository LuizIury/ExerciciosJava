package ExerciciosLacosDeDecisao;

import java.util.Scanner;

public class Exe4 {

	public static void main(String[] args) {
		
		int a;
		float sal;
		String nome;
		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nNome do colaborador: ");
		nome = leia.nextLine();
		
		System.out.println("\n\tCargos");
		System.out.println("\n1- Gerente");
		System.out.println("\n2- Vendedor");
		System.out.println("\n3- Supervisor");
		System.out.println("\n4- Motorista");
		System.out.println("\n5- Estoquista");
		System.out.println("\n6- Técnico de TI");
		System.out.println("\nInforme o código do cargo: ");
		a = leia.nextInt();
		
		System.out.println("\nInforme o salário atual: ");
		sal = leia.nextFloat();
		
		
		
		switch(a){
				
		case 1:
			System.out.println("Nome do colaboraodr: "+nome+"\tCargo: Gerente\tSalário: "+(sal+(sal*0.1)));
			break;
		case 2:
			System.out.println("Nome do colaboraodr: "+nome+"\tVendedor\tSalário: "+(sal+(sal*0.07)));
			break;
		case 3:
			System.out.println("Nome do colaboraodr: "+nome+"\tSupervisor\tSalário: "+(sal+(sal*0.09)));
			break;
		case 4:
			System.out.println("Nome do colaboraodr: "+nome+"\tMotorista\tSalário: "+(sal+(sal*0.06)));
			break;
		case 5:
			System.out.println("Nome do colaboraodr: "+nome+"\tEstoquista\tSalário: "+(sal+(sal*0.05)));
			break;
		case 6:
			System.out.println("Nome do colaboraodr: "+nome+"\tTécnico de TI\tSalário: "+(sal+(sal*0.8)));
			break;
		}
		
		
	}

}
