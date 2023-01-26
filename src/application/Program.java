package application;

import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Champion champion1 = null;
		Champion champion2 = null;

		for (int i = 1; i <= 2; i++) {
			if (i == 1) {
				System.out.println("Digite os dados do primeiro campeão:");
			} else {
				System.out.println("Digite os dados do segundo campeão:");
			}

			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Vida inicial: ");
			int life = sc.nextInt();
			System.out.print("Ataque: ");
			int damage = sc.nextInt();
			System.out.print("Armadura: ");
			int armor = sc.nextInt();

			if (i == 1) {
				champion1 = new Champion(name, life, damage, armor);
			}
			champion2 = new Champion(name, life, damage, armor);

		}
		
		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int turns = sc.nextInt();
		System.out.println();
		
		int somador = 1;
		while(turns > 0 && champion1.getLife() > 0 && champion2.getLife() > 0) {			
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			System.out.printf("Resultadodo turno %d:%n", somador);
			
			System.out.println(champion1.status());
			System.out.println(champion2.status());
			System.out.println();
			
			somador ++;
			turns --;
			
			
		}
		
		System.out.println("FIM DO COMBATE");

		sc.close();

	}

}
