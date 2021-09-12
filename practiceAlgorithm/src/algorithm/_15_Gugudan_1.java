package algorithm;

import java.util.Scanner;

public class _15_Gugudan_1 {

	public static void main(String[] args) {
		
//		[구구단 1]
//		
//		구구단 시작 s부터 f단까지 입력 받아 아래와 같이 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단 만들기");
		System.out.println("몇 단부터 구구단을 만드시겠습니까?");
		
		int s = sc.nextInt();
		
		System.out.println("몇 단까지 구구단을 만드시겠습니까?");
		
		int f = sc.nextInt();
		
		for(int i = 1 ; i <= 9 ; i++) {
			for(int dan = s ; dan <= f ; dan++) {
				System.out.printf("%2d *%2d =%3d" , dan, i, dan * i);
			}
			System.out.println();
		}
		
	}

}
