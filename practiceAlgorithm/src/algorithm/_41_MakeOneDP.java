package algorithm;

import java.util.Scanner;

//	[1로 만들기 DPver]
//	정수 x에 사용할 수 있는 연산은 다음과 같이 세 가지다.
//	1. 정수 x가 3으로 나누어 떨어지면, 3으로 나눈다.
//	2. x가 2로 나누어 떨어지면, 2로 나눈다.
//	3. 1을 뺀다.
//	정수 n이 주어졌을 때, 위와 같은 연산 세 가지를 적절히 사용해서 1을 만들려고 한다.
//	연산을 사용하는 횟수의 최솟값을 출력하시오.
//
//	입력 : 2
//	      10
//	출력 : 1
//	       3

public class _41_MakeOneDP {

	static int[] ans = new int[1000001]; // 입력 되는 정수는 10의 6승까지 가능을 전제.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ans[2] = 1; // 입력이 2라면, 1로 빼거나 2로 나누는 방법을 이용해 최소 횟수 1회로 가능하기 때문에 하드코딩.
		ans[3] = 1; // 입력이 3이라면, 3으로 나누는 방법을 이용해 최소 횟수 1회로 가능하기 때문에 하드코딩.
		
		// ans[4]을 1로 만드는 경우 -> 최소 횟수 2회
		// 1. 1을 먼저 뺼 경우 -> 3(ans[3]) -> 2회
		// 2. 2를 먼저 나눌 경우 -> 2(ans[2]) -> 2회
		
		// ans[5]을 1로 만드는 경우 -> 최소 횟수 3회
		// 4 -> 2 -> 1 => 3회
		
		// ans[6]을 1로 만드는 경우 -> 최소 횟수 2회
		// 1. 1을 먼저 뺼 경우 -> 5(ans[5]) -> 4회
		// 2. 3으로 먼저 나눌 경우 -> 2(ans[2]) -> 2회
		// 3. 2로 먼저 나눌 경우 -> 3(ans[3]) -> 2회
		
		// 즉, 입력된 값의 이전 인덱스 값들을 가지고 횟수를 구하면 된다.
		
		System.out.println("숫자를 입력하세요.");

		int input = sc.nextInt();
		
		for(int i = 4 ; i <= 100000 ; i++) {
			int a = 99999, b = 99999, c = 99999; // min 값을 구할 때는 max값을 채우고 시작하는게 보통.
			for(int w = 1 ; w <= 3 ; w++) { // w : 방법 3가지
				if(w == 1) {
					a = ans[i - 1];
				} else if(w == 2) {
					if(i % 2 == 0) {
						b = ans[i / 2];
					}
				} else if(w == 3) {
					if(i % 3 == 0) {
						c = ans[i / 3];
					}
				}
			}
			
			int min = min(a, b, c); // a, b, c중에 가장 작은 값을 min으로 갱신.
			ans[i] = 1 + min;
			
		}
		
		System.out.println(ans[input]);
		
	}

	private static int min(int a, int b, int c) {
		return 0;
	}

}
