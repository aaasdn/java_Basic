package basic.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayBasicpractice {

	public static void main(String[] args) {

		/*
		 - 정수 1개를 입력받아서 해당 정수가 소수(prime number)
		  인지를 판별하시면 됩니다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		System.out.println("> ");
		int num = sc.nextInt();
		
		int i = 1; //begin
		int count = 0;
		
		while(i <= num) { // end
			if(num % i == 0) {
				count++;
			}
			i++; //step
		}

		if(count == 2) {
			System.out.println(num + "은(는) 소수입니다.");
		} else {
			System.out.println(num + "은(는) 소수가 아닙니다.");
		}
		
	}

}






