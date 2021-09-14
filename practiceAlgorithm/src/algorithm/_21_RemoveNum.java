package algorithm;

public class _21_RemoveNum {

	public static void main(String[] args) {
		
//		[중복된 수 제거]
//		1 ~ 100까지 숫자가 입력될 때 한 번이라도 입력되었으면 출력하시오.
//		입력 : 7 2 3 1 1 2 3 4 5 5
//		정답 : 1 2 3 4 5 7
		
		// inArr[숫자]의 값들을 각 방번호라고 생각하면 쉽다.
		// 그 방 번호가 출현했다면 true를 부여한다.
		// 즉 방 번호가 true라면 그 번호가 출현했다는 증거가 된다.
		// true인 방 번호의 인덱스 값만 출력해주면 끝.
		
		boolean arr[] = new boolean[101]; // 인덱스 번호 = 출현된 값
		int inArr[] = new int[101];
		inArr[0] = 7; 
		inArr[1] = 2;
		inArr[2] = 3;
		inArr[3] = 1;
		inArr[4] = 1;
		inArr[5] = 2;
		inArr[6] = 3;
		inArr[7] = 4;
		inArr[8] = 5;
		inArr[9] = 5;
		
		for(int i = 0 ; i <= 100 ; i++) {
			arr[inArr[i]] = true;
		}
		
		for(int i = 1 ; i <= 100 ; i++) {
			if(arr[i] == true) {
				System.out.print(i + " ");
			}
		}
		
	}

}
