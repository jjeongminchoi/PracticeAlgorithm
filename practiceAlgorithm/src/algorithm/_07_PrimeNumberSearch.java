package algorithm;

public class _07_PrimeNumberSearch {

	public static void main(String[] args) {
		
		// 문제) 소수판별
		
		// 1과 자기자신을 제외한 수로 나누어 떨어질 경우 소수가 x.
		// 1과 자기자신으로만 나누어 떨어질 경우 소수가 o.
		
		int inputNumber = 13; // 판별할 수
		
		boolean isPrimeNumber = true;
		
		for(int i = 2 ; i <= inputNumber - 1 ; i++) {
			if(inputNumber % i == 0) {
				isPrimeNumber = false;
			}
		}
		
		if(isPrimeNumber) {
			System.out.println(inputNumber + "은 소수가 맞습니다.");
		} else {
			System.out.println(inputNumber + "은 소수가 아닙니다.");
		}
		
	}

}
