package algorithm;

public class _08_Factorial {

	public static void main(String[] args) {
		
		// 문제) 어떠한 숫자가 입력되었을 때 그 숫자의 팩토리얼을 구하시오.
		
		// 앞의 값과 뒤에 값을 곱해 나온 결과물을 뒤에 값과 곱하고...
		
		// 앞에 숫자부터 곱하기
		int inputNumber = 5; // 팩토리얼할 값
		int result = 1;
		
		for(int i = 1 ; i <= inputNumber ; i++) {
			result *= i;
		}
		
		System.out.println(result);
		
		// 뒤에 숫자부터 곱하기
		result = 1;
		
		for(int i = inputNumber ; i >= 1 ; i--) {
			result *= i;
		}
		
		System.out.println(result);
		
	}

}
