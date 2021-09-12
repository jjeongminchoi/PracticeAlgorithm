package algorithm;

public class _12_NumQuadrangle_3 {

	public static void main(String[] args) {
		
		// 숫자 사각형(3)
		// 문제) 입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력하시오.
		// ex) inputNum = 4
		// 출력
		// 1 5 9 13
		// 2 6 10 14
		// 3 7 11 15
		// 4 8 12 16
		
		// 나
		// 각 행의 첫 번째 인덱스 값을 기준으로 inputNum을 더해 구한다.
		int inputNum = 4;
		int arr[][] = new int[inputNum][inputNum];
		int cnt = 1;
		
		for(int i = 0 ; i < inputNum ; i++) {
			for(int j = 0 ; j < inputNum ; j++) {
				arr[i][j] = cnt;
				cnt += inputNum;
			}
			cnt = i + 2;
		}
		
		for(int i = 0 ; i < inputNum ; i++) {
			for(int j = 0 ; j < inputNum ; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 영상
		// 배열에 들어가는 i와 j를 반대로 대입해 첫번째 열의 인덱스부터 입력하면서 차례로 이동한다.
		int n = 4;
		int arr1[][] = new int[n][n];
		int num = 1;
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				arr1[j][i] = num;
				num++;
				// arr[j][i] = i * n + j + 1;
			}
		}
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				System.out.printf("%4d", arr1[i][j]);
			}
			System.out.println();
		}
		
	}

}
