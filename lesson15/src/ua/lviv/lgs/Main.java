package ua.lviv.lgs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ZooClub zc = new ZooClub();		
		while (true) {
			System.out.println();
			System.out.println("¬вед≥ть 1 щоб додати учасника клубу");
			System.out.println("¬вед≥ть 2 щоб додати тваринку до учасника клубу");
			System.out.println("¬вед≥ть 3 щоб видалити тваринку з учасника клубу");
			System.out.println("¬вед≥ть 4 щоб видалити учасника клубу");
			System.out.println("¬вед≥ть 5 щоб видалити конкретну тваринку з≥ вс≥х власник≥в");
			System.out.println("¬вед≥ть 6 щоб вивести на екран зооклуб");
			System.out.println("¬вед≥ть б≥льше 6 щоб вийти з програми");
			Scanner sc = new Scanner(System.in);
			int i = sc.nextInt();
			switch (i) {
			case 1:
				zc.addPerson();
				break;
			case 2:
				zc.addAnimal();
				break;
			case 3:
				zc.deleteAnimal();
				break;
			case 4:
				zc.deletePerson();
				break;
			case 5:
				zc.deleteAnimalFromAll();
				break;
			case 6:
				zc.print();
				break;
			default:
				System.exit(0);
			}
		}
		
		
		
		
	}

}
