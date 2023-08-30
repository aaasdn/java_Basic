package oop.inherit.good;

public class AdCarry extends Player {

	double atkspeed;
	int mana;
	
	@Override
	void characterInfo() {
		super.characterInfo();
		System.out.println("# 공격속도: " + atkspeed + "(공격속도 최대출력 2.5)");
		System.out.println("# 마나량: " + mana);
	}
	
}
