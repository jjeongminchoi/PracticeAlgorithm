package algorithm;

public class _13_NumQuadrangle_4 {

	public static void main(String[] args) {
		
		// 숫자 사각형(4)
		// 문제) 입력된 수(N) 만큼 N행 N열의 형태로 아래와 같이 출력되는 숫자 사각형을 출력하시오.
		// ex) inputNum = 4
		// 출력
		// 1 2 3 4
		// 2 4 6 8
		// 3 6 9 12
		// 4 8 12 16
		
		// 나, 영상
		// 각 행의 첫 열의 값을 기준으로 1 ~ inputNum 까지 각각 곱하면서 배열에 담아 출력한다.
		int inputNum = 5;
		int arr[][] = new int[inputNum][inputNum];
		
		for(int i = 0 ; i < inputNum ; i++) {
			for(int j = 0 ; j <inputNum ; j++) {
				arr[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for(int i = 0 ; i < inputNum ; i++) {
			for(int j = 0 ; j < inputNum ; j++) {
				System.out.printf("%4d", arr[i][j]);
			}
			System.out.println();
		}
		
	}

}
