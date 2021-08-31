package algorithm;

public class tenToTwoEssenceConversion {

	public static void main(String[] args) {
		
		// 10진수를 2진수로 변환하시오.
		// inputNum = 19
		// result => 10011
		
		int inputNum = 19;
		int m, n; // m : 몫, n : 나머지
		int seq = 0; // 인덱스
		int[] arr = new int[5];
		
		while(inputNum > 1) {
			m = inputNum / 2;
			inputNum = m;
			n = inputNum % 2;
			arr[seq] = n;
			seq++;
		}
		
		for(int i = arr.length ; i > 0 ; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
