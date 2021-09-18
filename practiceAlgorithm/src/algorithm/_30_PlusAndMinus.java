package algorithm;

import java.util.Scanner;

public class _30_PlusAndMinus {

	public static void main(String[] args) {
		
//		[더하기 & 마이너스]
//		입력된 숫자까지 + - 를 차례대로 반복하시오
//		입력 : 9
//		출력 : 1 + 2 - 3 + 4 - 5 + 6 - 7 + 8 - 9
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 번 반복할지 입력하세요.");
		
		int n = sc.nextInt();
		String buho = "+";
		
		for(int i = 1 ; i <= n ; i++) {
			if(buho.equals("+")) {
				System.out.print(i + " ");
				if(i < n) {
					System.out.print(buho + " ");
				} else {
					System.out.print("");
				}
				buho = "-";
			} else {
				System.out.print(i + " ");
				if(i < n) {
					System.out.print(buho + " ");
				} else {
					System.out.print("");
				}
				buho = "+";
			}
		}
		
	}

}
