package algorithm;

public class _28_Jinsu {

	public static void main(String[] args) {
		
//		[10진수 -> 2~16 진수 변환]
//		입력받은 10진수를 n진수로 변환시키시오.
//		입력 : 19 16
//		출력 : 13
		
		char[] n = new char[100];
		
		int num = 19;
		int jinsu = 16;
		int i = 0;
		
		while(num > 0) {
			int tmp = num % jinsu;
			
			if(tmp >= 10 && tmp <= 15) {
				n[i] = (char) ('A' + (tmp - 10));
			} else {
				n[i] = (char) ('0' + tmp);
			}
			num /= jinsu;
			i++;
		}
		
		for( ; i >= 0 ; i--) {
			System.out.print(n[i]);
		}
		
	}

}
