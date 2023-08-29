package oop.constructor;

public class Person {
	
	String names;
	int ages;
	int cm;
	
	
	Person() {}
	
	Person(String pNames, int pAges, int pCm){
		System.out.println("신상정보 호출!");
		names = pNames;
		ages = pAges;
		cm = pCm;
		
	}
	
	void info() {
		System.out.println("*** 정보 ***");
		System.out.println("이름: " + names);
		System.out.println("나이: " + ages + "세");
		System.out.println("키: " + cm);
	}
		
}
