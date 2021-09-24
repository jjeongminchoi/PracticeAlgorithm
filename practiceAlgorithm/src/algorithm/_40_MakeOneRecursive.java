package algorithm;

import java.util.Scanner;

public class _40_MakeOneRecursive {

//		[1로 만들기 재귀ver]
//		정수 x에 사용할 수 있는 연산은 다음과 같이 세 가지다.
//		1. 정수 x가 3으로 나누어 떨어지면, 3으로 나눈다.
//		2. x가 2로 나누어 떨어지면, 2로 나눈다.
//		3. 1을 뺀다.
//		정수 n이 주어졌을 때, 위와 같은 연산 세 가지를 적절히 사용해서 1을 만들려고 한다.
//		연산을 사용하는 횟수의 최솟값을 출력하시오.
//		
//		입력 : 2
//			 10
//		출력 : 1
//			 3
	
	static int min = 99999999;
	
	public static void doFunc(int x, int way, int cnt) {
		
		if(x % 3 == 0 && way == 3) {
			x /= way;
			cnt++;
			for(int i = 1 ; i <= 3 ; i++) {
				doFunc(x, way, cnt);
			}
		} else if(x % 2 == 0 && way == 2) {
			x /= way;
			cnt++;
			for(int i = 1 ; i <= 3 ; i++) {
				doFunc(x, way, cnt);
			}
		} else if(x >= 2) {
			x -= 1;
			cnt++;
			for(int i = 1 ; i <= 3 ; i++) {
				doFunc(x, way, cnt);
			}
		}
		
		if(x == 1 && cnt < min) {
			min = cnt;
			return;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		int n = sc.nextInt();
		
		for(int i = 1 ; i <= 3 ; i++) {
			doFunc(n, i, 0);
		}
		
		System.out.println(min);
		
	}

}
