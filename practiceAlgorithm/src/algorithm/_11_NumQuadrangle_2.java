package algorithm;

public class _11_NumQuadrangle_2 {

	public static void main(String[] args) {
		
		// 숫자 사각형(2)
		// 문제) 입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력하시오.
		// ex) inputNum = 4
		// 출력
		// 1 2 3 4
		// 8 7 6 5
		// 9 10 11 12
		// 16 15 14 13

//		// 나
//		int inputNum = 9;
//		int cnt = 1;
//		int go = 1;
//		int[] arr = new int[inputNum];
//		int up = 0;
//		
//		for(int i = 0 ; i < inputNum ; i++) {
//			if(go == 1) {
//				for(int j = 0 ; j < inputNum ; j++) {
//					arr[j] = cnt;
//					cnt++;
//					System.out.printf("%4d", arr[j]);
//				}
//				go = -1;
//			} else if(go == -1) {
//				for(int k = inputNum - 1 ; k >= 0 ; k--) {
//					arr[k] = cnt;
//					cnt++;
//					System.out.printf("%4d", arr[up]);
//					up++;
//				}
//				up = 0;
//				go = 1;
//			}
//			System.out.println();
//		}
		
		int n = 5;
		int arr[][] = new int[n][n];
		
		for(int i = 0 ; i < n ; i++) {
			if(i % 2 == 0) { // 행이 짝수 일 때 열은 순서대로
				for(int j = 0 ; j < n ; j++) {
					arr[i][j] = (i * n) + (j + 1);
				}
			} else { // 행이 홀수 일 때 열은 반대로
				for(int j = n - 1 ; j >= 0 ; j--) {
					arr[i][j] = (i * n) + (n - j);
				}
			}
		}
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
	}

}

// 변수를 최대한 줄이고 로직을 구현할 수 있도록 노력해보자..