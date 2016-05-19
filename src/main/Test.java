package main;

import java.util.LinkedList;

import databases.Illnesses;

public class Test {

	LinkedList<Illnesses> databaseI = new LinkedList<Illnesses>();
	
	public static void main(String[] args) {
		Test t = new Test();
		Illnesses i;
		t.addIllness("ADHD");
		int arraysize = t.databaseI.size();
		System.out.println((t.databaseI.get(arraysize-1)).name);

	}
	
	public void addIllness(String i){
		databaseI.add(new Illnesses (i));
	}

}
