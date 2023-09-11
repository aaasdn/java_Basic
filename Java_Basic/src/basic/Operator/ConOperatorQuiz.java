package basic.Operator;

public class ConOperatorQuiz {

	public static void main(String[] args) {

		/*
        - 42 ~ 396사이의 난수를 발생시킨 후
        발생한 난수가 홀수인지 짝수인지의 여부를
        3항 연산식으로 출력해 보세요.
        
        ex)
        발생한 난수: XX
        3항 연산의 결과: 홀수입니다. or 짝수입니다.
       */
		int rn = (int) ((Math.random()*355) + 42); //math.random은 0.0부터 1.0미만의 값을 랜덤으로 불러오기 때문에 원하는 값의 난수를 발생시키려면 그만큼 곱해줘야함.
												  // 시작점이 0이아니라 예를 들어 42면 뒤에 + 42를 붙히고 곱한 정수값을 그만큼 빼줘야함.
		System.out.println("발생한 난수: " +rn);
		
		String result = (rn % 2 == 0 ? "짝수입니다." : "홀수입니다.");
		System.out.println("3항 연산의 결과: " + result);
		
		System.out.println("3항 연산의 결과: "
				+ (rn % 2 == 0 ? "짝수입니다." : "홀수입니다."));
		
		
	}

}
