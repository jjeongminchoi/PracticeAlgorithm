package algorithm;

import java.util.Scanner;

public class _34_FibonacciRecursive {

//		[피보나치 재귀ver]
//		입력된 항의 피보나치 수를 구하시오
//		입력 : 6
//		출력 : 8 (1 -> 1 -> 2 -> 3 -> 5 -> 8)
	
	public static int Recursive(int n) {
		
		if(n == 1) {
			return 1;
		}
		if(n == 2) {
			return 1;
		}
		
		return Recursive(n - 2) + Recursive(n - 1);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 번째 항의 결과를 알고 싶나요?");
		
		int n = sc.nextInt();
		int res = Recursive(n);
		
		System.out.println(res);
		
	}

}
