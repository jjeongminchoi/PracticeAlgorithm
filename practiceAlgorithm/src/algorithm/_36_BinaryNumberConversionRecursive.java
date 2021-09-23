package algorithm;

import java.util.Scanner;

public class _36_BinaryNumberConversionRecursive {

//		[2진수 변환 재귀ver]
//		입력된 수를 2진수로 변환하세요.
//		입력 : 17
//		출력 : 10001
	
	// 17 / 2 -> 8...1
	//  8 / 2 -> 4...0
	//  4 / 2 -> 2...0
	//  2 / 2 -> 1...0
	//  1 / 2 -> 0...1
	
	// 8 / 2 -> 4...0
	// 4 / 2 -> 2...0
	// 2 / 2 -> 1...0
	// 1 / 2 -> 0...1
	
	public static void conversion(int N) {
		
		if(N / 2 == 0) {
			System.out.print(N % 2); // N을 찍어도 됨.
			return;
		}
		
		conversion(N / 2); // c(8) , c(4), c(2), c(1), c(0)

		System.out.print(N % 2);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2진수로 변환할 수를 입력하세요.");
		
		int n = sc.nextInt();
		
		conversion(n);
		
	}

}
