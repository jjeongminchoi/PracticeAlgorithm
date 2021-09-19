package algorithm;

import java.util.Scanner;

public class _32_AccSumRecursive {

//		[누적합 재귀ver]
//		입력된 두 수까지의 합을 구하시오
//		입력 : 1 4
//		출력 : 10
	
	public static int recursive(int i, int j) {
		
		if(i == j) {
			return j;
		}
		
		return i + recursive(i + 1, j);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("첫번째 수 입력");
		int startNum = sc.nextInt();
		System.out.println("두번째 수 입력");
		int endNum = sc.nextInt();
		
		int res = 0;
		
		res = recursive(startNum, endNum);
		
		System.out.println("첫번째 수와 두번째 수까지의 합은 : " + res);
	}

}
