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

		int inputNum = 4;
		int cnt = 1;
		int go = 1;
		int[] arr = new int[inputNum];
		int up = 0;
		
		for(int i = 0 ; i < inputNum ; i++) {
			if(go == 1) {
				for(int j = 0 ; j < inputNum ; j++) {
					arr[j] = cnt;
					cnt++;
					System.out.printf("%4d", arr[j]);
				}
				go = -1;
			} else if(go == -1) {
				for(int k = inputNum - 1 ; k >= 0 ; k--) {
					arr[k] = cnt;
					cnt++;
					System.out.printf("%4d", arr[up]);
					up++;
				}
				go = 1;
				up = 0;
			}
			System.out.println();
		}
		
	}

}
