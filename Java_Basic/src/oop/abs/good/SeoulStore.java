package oop.abs.good;

public class SeoulStore extends HeadStore {

	@Override
	public void orderApple() {
		System.out.println("사과 주스의 가격이 3000원 입니다.");
	}

	@Override
	public void orderBanana() {
		System.out.println("바나나 주스의 가격이 3500원 입니다.");	
	}

	@Override
	public void orderGrape() {
		System.out.println("포도 주스의 가격이 2500원 입니다.");
	}

}
