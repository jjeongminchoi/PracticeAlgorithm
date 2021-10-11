package algorithm;

import java.util.Scanner;

public class _35_ExtractNumber {

//		[숫자추출 재귀ver]
//		입력된 수를 높은 자릿수 부터 출력하시오
//		입력 : 2312
//		출력 : 
//		2
//		3
//		1
//		2
	
	public static void extract(int n) {

		if(n / 10 == 0) {
			System.out.println(n);
			return;
		}
		
		extract(n / 10);

		System.out.println(n % 10);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("순서대로 출력할 수를 입력하세요");
		
		int n = sc.nextInt();
		
		extract(n);
		
	}

}
