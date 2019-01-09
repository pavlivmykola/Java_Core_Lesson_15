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
		System.out.println("¬водимо нового учасника клубу");
		System.out.println("¬вед≥ть ≥м'€ учасника");
		String name = sc.nextLine();
		System.out.println("¬вед≥ть в≥к учасника");
		int age = sc.nextInt();
		map.put(new Person(name, age),new ArrayList<Animal>());
	}


	
	public void addAnimal() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("¬водимо тваринку до учасника клубу");
		System.out.println("¬вед≥ть ≥м'€ учасника");
		String name = sc.nextLine();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				System.out.println("«найдкно учасника клубу "+name+". ƒодаЇмо тваринку до учасника клубу");
				System.out.println("¬вед≥ть тип тваринки");
				String animalType = sc.nextLine();
				System.out.println("¬вед≥ть ≥м'€ тваринки");
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
		System.out.println("¬идал€Їмо тваринку з учасника клубу");
		System.out.println("¬вед≥ть ≥м'€ учасника");
		String name = sc.nextLine();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(name)) {
				System.out.println("«найдкно учасника клубу "+name+". ¬идал€Їмо тваринку з учасника клубу");
				System.out.println("¬вед≥ть ≥м'€ тваринки");
				String animalName = sc.nextLine();
				ArrayList<Animal> value = next.getValue();
				Iterator<Animal> iterator2 = value.iterator();
				while (iterator2.hasNext()) {
					if (iterator2.next().getName().equals(animalName)) {
						iterator2.remove();
						System.out.println("“варинку видалено");
					} 
				}
				next.setValue(value);
			}
		}
		
	}
	
	
	public void deletePerson() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("¬идал€Їмо учасника клубу");
		System.out.println("¬вед≥ть ≥м'€ учасника");
		String name = sc.nextLine();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getKey().getName().equals(name)) {
				iterator.remove();
				System.out.println("¬идалено учасника клубу");
			}
		}
	}
	

	public void deleteAnimalFromAll() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("¬идал€Їмо тваринку");
		System.out.println("¬вед≥ть ≥м'€ тваринки");
		String animalName = sc.nextLine();
		Iterator<Entry<Person, ArrayList<Animal>>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Person, ArrayList<Animal>> next = iterator.next();
			ArrayList<Animal> value = next.getValue();
			Iterator<Animal> iterator2 = value.iterator();
			while (iterator2.hasNext()) {
				if (iterator2.next().getName().equals(animalName)) {
					iterator2.remove();
					System.out.println("“варинку видалено з "+next.getKey().getName());
				}
			}
			next.setValue(value);
		}
		
	}
	
	
	public void print() {
		System.out.println("«ооклуб");
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
