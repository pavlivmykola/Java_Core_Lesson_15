package ua.lviv.lgs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ZooClub zc = new ZooClub();		
		while (true) {
			System.out.println();
			System.out.println("������ 1 ��� ������ �������� �����");
			System.out.println("������ 2 ��� ������ �������� �� �������� �����");
			System.out.println("������ 3 ��� �������� �������� � �������� �����");
			System.out.println("������ 4 ��� �������� �������� �����");
			System.out.println("������ 5 ��� �������� ��������� �������� � ��� ��������");
			System.out.println("������ 6 ��� ������� �� ����� �������");
			System.out.println("������ ����� 6 ��� ����� � ��������");
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
