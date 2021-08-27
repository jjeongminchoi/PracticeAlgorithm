package algorithm;

public class GCD {

	public static void main(String[] args) {
		
		// 문제) 최대공약수를 구하시오.
		
		int num1, num2;
		
		num1 = 30;
		num2 = 15;
		
		int small, big;
		
		if(num1 > num2) {
			big = num1;
			small = num2;
		} else {
			big = num2;
			small = num1;
		}
		
		int gcd = 1; // 최대공약수
		
		for(int i = 1; i <= small ; i++) {
			if(big % i == 0 && small % i == 0) {
				gcd = i;
			}
		}
		
		System.out.println(gcd);
		
	}

}
