package etc.exception.basic;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
        1. 스캐너를 통해서 정수 2개를 입력받습니다.
        2. 입력받은 값이 정수라면, 단순히 입력받은 정수의 합을 출력하고
         반복문을 종료시키세요.
        3. 입력받은 값이 에러를 발생시키는 값이라면 "정수로만 입력하세요"
         를 출력한 후에 다시 입력받을 수 있도록 작성해 주세요.
        4. 반복문을 탈출하면 프로그램 정상 종료 문장을 띄워 주세요.
		*/
		Scanner scanner = new Scanner(System.in);
		
		
//        int sum = 0;
//        
//        
//        for (int i = 1; i <= 2; i++) {
//            try {
//                System.out.print("정수를 입력하세요: ");
//                int num = scanner.nextInt();
//                sum += num; 
//            } catch (InputMismatchException e) {
//                System.out.println("정수로만 입력하세요.");
//                scanner.nextLine(); 
//                i--; 
//            }
//        }
//     
//        System.out.println("입력받은 정수의 합: " + sum);
//        System.out.println("프로그램 정상 종료");
//        
//        scanner.close();
		
	}

}
