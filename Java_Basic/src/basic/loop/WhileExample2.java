package basic.loop;

public class WhileExample2 {

	public static void main(String[] args) {

		int i = 48;
		
		while(i <= 150) {
			if(i % 8 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		System.out.println(); //한줄띄우기
		
		// 1~100까지의 정수 중 4의 배수이면서
		// 8의 배수는 아닌 수를 가로로 출력해 보세요.
		
		int n = 1;
		while(n <= 100) {
			if(n % 4 == 0 && n % 8 != 0) {
				System.out.print(n + " ");
			}
			n++;
		}
		
		System.out.println(); //한줄띄우기
		
		// 1~30000까지의 정수 중 258의 배수의 개수를 출력
		int j = 1;
		int count =0; // 배수의 개수를 세 줄 변수.
		
		while(j <=30000) {
			if(j % 258 == 0) {
				count++;
			}
			j++;
		}
		
		System.out.println(count);
		
		
		// 1000의 약수의 개수를 구하세요
		int a = 1;
		int b = 0; // 약수의 개수
		
		while(a <= 1000) {
			if(1000 % a == 0) {
				b++;
			}
			a++;
		}
		System.out.println(b);
	}
}	
	
