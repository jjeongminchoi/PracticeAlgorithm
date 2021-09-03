package algorithm;

import java.util.Scanner;

public class Mode {

	public static void main(String[] args) {
		
		// 문제1) 최빈수 구하기
		
		// ex) 사용자의 input -> 1 2 2 3 1 4 2 2 4 3
		
		// 1: 2
		// 2: 4 --> 최빈수!
		// 3: 2
		// 4: 2
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오 (10개)");
		int[] inputNum = new int[10];
		for(int i = 0 ; i < 10 ; i++) {
			inputNum[i] = scan.nextInt();
		}
		
		int[] mode = new int[10];
		
		// index -> 출현한 수
		// index 값 -> index(출현한 수)가 몇번 나왔는지 저장하는 용도
		for(int i = 0 ; i < 10 ; i++) {
			mode[inputNum[i]]++;
		}
		
		int modeNum = 0; // 최빈수
		int modeCnt = 0; // 최빈수가 나온 횟수
		for(int i = 0 ; i < 10 ; i++) {
			if(modeCnt < mode[i]) {
				modeCnt = mode[i];
				modeNum = i;
			}
		}
		
		System.out.println("최빈수는 : " + modeNum + ", 횟수 : " + modeCnt);
		System.out.println("프로그램 종료");
	}

}
