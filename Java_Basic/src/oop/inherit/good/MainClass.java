package oop.inherit.good;

public class MainClass {

	public static void main(String[] args) {

		Warrior w1 = new Warrior();
		w1.level = 1;
		w1.atk = 3;
		w1.hp = 50;
		w1.name = "전사1";
		w1.rage = 60;
		w1.characterInfo();
		
		System.out.println("-------------------------");
		
		AdCarry a1 = new AdCarry();
		a1.level = 6;
		a1.atk = 102;
		a1.hp = 1150;
		a1.name = "카이팅왕";
		a1.atkspeed = 0.8;
		a1.mana = 650;
		a1.characterInfo();
		
				
	}

}
