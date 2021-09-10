package algorithm;

public class _10_NumQuadrangle_1 {

	public static void main(String[] args) {
		
		// 숫자 사각형(1)
		// 문제) 입력된 수(N) 만큼 N행 N열의 형태로 연속으로 출력되는 숫자 사각형을 출력하시오.
		// ex) inputNum = 4
		// 출력
		// 1 2 3 4
		// 5 6 7 8
		// 9 10 11 12
		// 13 14 15 16
		
		// 내가 푼 것
		int inputNum = 5;
		int num = 1;
		
		for(int i = 0 ; i < inputNum ; i++) {
			for(int j = 0 ; j < inputNum ; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();	
		}
		
		System.out.println();
		
		// 영상에서 푼 것(1)
		int n = 5;
		int number = 1;
		
		for(int j = 0 ; j < n ; j++) {
			for(int i = 0 ; i < n ; i++) {
				System.out.printf("%4d", number);
				number++;
			}
			System.out.println();
		}

		System.out.println();
		
		// 영상(2) number 변수 없이 만들기
		int n2 = 5;
		
		for(int j = 0 ; j < n2 ; j++) {
			for(int i = 0 ; i < n2 ; i++) {
				System.out.printf("%4d", (j * n2) + (i + 1));
			}
			System.out.println();
		}
		
	}

}

/*
 * printf는 c언어에서 나오는 출력문 형태. 
 * %d는 입력되는 값이 정수임을 알려줄 때 사용. 
 * 사용방법 -> System.out.printf("%d", 숫자);
 */