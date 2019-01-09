package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ZooClub {
	private Map<Person,ArrayList<Animal>> map;
	

	
	public ZooClub() {
		super();
		this.map = new HashMap<>();
	}



	public void addPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("������� ������ �������� �����");
		System.out.println("������ ��'� ��������");
		String name = sc.nextLine();
		System.out.println("������ �� ��������");
		int age = sc.nextInt();
		map.put(new Person(name, age),new ArrayList<Animal>());
	}


	
	public void addAnimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("������� �������� �� �������� �����");
		System.out.println("������ ��'� ��������");
		String name = sc.nextLine();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				System.out.println("�������� �������� ����� "+name+". ������ �������� �� �������� �����");
				System.out.println("������ ��� ��������");
				String animalType = sc.nextLine();
				System.out.println("������ ��'� ��������");
				String animalName = sc.nextLine();
				ArrayList<Animal> value = next.getValue();
				value.add(new Animal(animalType,animalName));
				next.setValue(value);
			}
		}
		
	}


	public void deleteAnimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("��������� �������� � �������� �����");
		System.out.println("������ ��'� ��������");
		String name = sc.nextLine();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				System.out.println("�������� �������� ����� "+name+". ��������� �������� � �������� �����");
				System.out.println("������ ��'� ��������");
				String animalName = sc.nextLine();
				ArrayList<Animal> value = next.getValue();
				Iterator<Animal> iterator2 = value.iterator();
				while (iterator2.hasNext()) {
					if (iterator2.next().getName().equals(animalName)) {
						iterator2.remove();
						System.out.println("�������� ��������");
					} 
				}
				next.setValue(value);
			}
		}
		
	}
	
	
	public void deletePerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("��������� �������� �����");
		System.out.println("������ ��'� ��������");
		String name = sc.nextLine();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getKey().getName().equals(name)) {
				iterator.remove();
				System.out.println("�������� �������� �����");
			}
		}
	}
	

	public void deleteAnimalFromAll() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("��������� ��������");
		System.out.println("������ ��'� ��������");
		String animalName = sc.nextLine();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			ArrayList<Animal> value = next.getValue();
			Iterator<Animal> iterator2 = value.iterator();
			while (iterator2.hasNext()) {
				if (iterator2.next().getName().equals(animalName)) {
					iterator2.remove();
					System.out.println("�������� �������� � "+next.getKey().getName());
				}
			}
			next.setValue(value);
		}
		
	}
	
	
	public void print() {
		System.out.println("�������");
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			System.out.println(next.getKey().getName());
			ArrayList<Animal> value = next.getValue();			
			for (Animal animal : value) {
				System.out.println("                   "+animal.getName());;
			}
		}
	}
	
}
