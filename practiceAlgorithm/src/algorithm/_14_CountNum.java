package algorithm;

public class _14_CountNum {

	public static void main(String[] args) {
		
//		[숫자 개수 출력하기]
//		
//		입력된 숫자의 개수를 출력하라.
//		입력 : 421314218
//		정답 ->
//		0 : 0
//		1 : 3
//		2 : 2
//		3 : 1
//		4 : 2
//		5 : 0
//		6 : 0
//		7 : 0
//		8 : 1
//		9 : 0
		
		int inputNum = 421314218;
		int arr[] = new int[10]; // 0 ~ 9 입력된 수를 cnt 하기 위한 용도.
		
		while(inputNum > 0) {
			arr[inputNum % 10]++;
			inputNum /= 10;
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		
	}

}
