package algorithm;

import java.util.Scanner;

public class _31_Factorial_RecursiveVer {

//		[팩토리얼 재귀ver]
//		입력된 수의 팩토리얼을 구하시오
//		입력 : 5
//		출력 : 120
	
	// 재귀함수에는 탈출조건이 중요하다. -> 없으면? 무한루프..
	// 5 * 4 * 3 * 2 * 1 * cal(0)
	
	public static int calFact(int i) {
		
		if(i == 1) { // 여기가 탈출조건!
			return i;
		}
		
		return i * calFact(i - 1);
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		input = sc.nextInt();
		int res = 0;
		
		res = calFact(input);
		
		System.out.println(res);
		
	}

}
