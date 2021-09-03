package algorithm;

public class TenToTwoEssenceConversion {

	public static void main(String[] args) {
		
		// 10진수를 2진수로 변환하시오.
		// inputNum = 19
		// result => 10011
		
		// 내가 푼 것
		int inputNum = 19;
		int m, n; // m : 몫, n : 나머지
		int seq = 0; // 인덱스
		int[] arr = new int[100];
		
		while(inputNum > 0) {
			m = inputNum / 2;
			n = inputNum % 2;
			inputNum = m;
			arr[seq] = n;
			seq++;
		}
		
		for(int i = seq - 1 ; i >= 0 ; i--) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
		// 영상에서 푼 것
		int inputNum1 = 19;
		int bin[] = new int[100];
		
		int i = 0;
		int mok = inputNum1;
		
		while(mok > 0) {
			bin[i] = mok % 2;
			mok /= 2;
			i++;
		}
		
		i--;
		for(; i >= 0 ; i--) { // 초기값을 안적어도 되는건 처음 알았다...
			System.out.print(bin[i]);
		}
		
	}

}
