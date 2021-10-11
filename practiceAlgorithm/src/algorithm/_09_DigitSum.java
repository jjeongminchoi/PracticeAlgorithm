package algorithm;

import java.util.Scanner;

public class _09_DigitSum {

	public static void main(String[] args) {
		
		// 문제) 입력된 수의 각 자릿수 합을 구하시오.
		// inputNum = 1242
		// result = 9
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");

		int inputNum = sc.nextInt();
		int result = 0;
		
		while(inputNum > 0) {
			result += inputNum % 10;
			inputNum /= 10;
		}
		
		System.out.println(result);
		
	}

}
