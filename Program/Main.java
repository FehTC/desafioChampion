package Program;

import java.util.Locale;
import java.util.Scanner;

import Entitie_Champion.Champion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Champion championA;
		Champion championB;
		
		
		// CHAMPION A
		System.out.println("Digite os dados do primeiro campeão: ");

		System.out.print("Nome: ");
		String nameChampion = sc.next();

		System.out.print("Vida inicial: ");
		int inicialLife = sc.nextInt();

		System.out.print("Ataque: ");
		int attackChampion = sc.nextInt();

		System.out.print("Armadura: ");
		int armorChampion = sc.nextInt();

		championA = new Champion(nameChampion, inicialLife, attackChampion, armorChampion);
		
		// CHAMPION B		
		System.out.println("\nDigite os dados do segundo campeão: ");

		System.out.print("Nome: ");
		String nameChampionB = sc.next();
				
		System.out.print("Vida inicial: ");
		int inicialLifeB = sc.nextInt();

		System.out.print("Ataque: ");
		int attackChampionB = sc.nextInt();

		System.out.print("Armadura: ");
		int armorChampionB = sc.nextInt();

		championB = new Champion(nameChampionB, inicialLifeB, attackChampionB, armorChampionB);
		
		System.out.print("\nQuantos turnos deseja executar? ");
		int N = sc.nextInt();
		
		for (int i=0;i<N;i++) {
			System.out.println("\nResultado do turno " + (i+1) + ":");
			championA.takeDamage(championB);
			System.out.println(championA.status());
			System.out.println(championB.status());
			
			if (championA.getLife() <= 0 || championB.getLife() <= 0) {
				i=N;			
			}
		}
		
		System.out.println("\nFIM DO COMBATE");
		
		
		

		sc.close();
	}

}
