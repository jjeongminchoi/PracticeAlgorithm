package algorithm;

public class fibonacciSequence {

	public static void main(String[] args) {
		
		// 문제) 피보나치 수열을 출력해라.
		// An = An-1 + An-2
		// 1 1 2 3 5 8 13 21 34 ...
		
		// 방법1) 배열을 통한 방법
		int[] arr = new int[100];
		
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i = 2 ; i < 100 ; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print(arr[i] + " ");
		}
		
		// 방법2) 초기화를 통한 방법
		System.out.println();
		
		int prevPrevNum = 1;
		int prevNum = 1;
		System.out.print(prevPrevNum + " ");
		System.out.print(prevNum + " ");
		
		for(int i = 3 ; i <= 10 ; i++) {
			int result = prevPrevNum + prevNum;
			System.out.print(result + " ");
			prevPrevNum = prevNum;
			prevNum = result;
		}
		
	}

}
