package etc.api.lang.math;

public class MathQuiz {

	public static int page(int num) {
		return (int) Math.ceil(num/ 10.0);
		// 스태틱 메서드를 선언한 후, 인트값으로 리턴을 해야함. 
		// 문제를 보면 규칙이 있는데 숫자가 커져도 그 규칙은 같음
		// 그 규칙을 이용해서 메인 메서드에 출력을 할때, 매개변수 값을 넣는데 
		// 올림을 이용해서 값을 넣고 10으로 나눈다. 그리고 소숫점이 나오기 때문에 앞에 인트를 붙혀서
		// 정수로 나오게 바꾸자. (올림을 했기 때문에 소숫점 앞자리는 무조건 위로 올린다)
	
	}
	
	
	public static void main(String[] args) {

		/*
        1 ~ 10이 전달되면 1이 반환되고,
        11 ~ 20이 전달되면 2가 반환되고,
        21 ~ 30이 전달되면 3이 반환되고.......
        이러한 로직을 수행하는 static 메서드 page를 선언해 보세요.
		 */

		System.out.println(page(45));
		
	}

}
