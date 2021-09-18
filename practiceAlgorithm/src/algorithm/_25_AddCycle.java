package algorithm;

public class _25_AddCycle {

	public static void main(String[] args) {
		
//		[더하기 사이클]
//		N이 주어졌을 때 N의 사이클의 길이를 구하시오 ( 1 <= N <= 100 )
//		입력 : 26
//		정답 : 4
//		예) 26시작 -> 2 + 6 = 8 -> 68 6 + 8 -> 14 -> 84 8 + 4 = 12 -> 42 4 + 2 => 26
		
		int n = 26;
		int res = n;
		int tmp = 0;
		int cnt = 0;
		
		do {
			tmp = res / 10 + res % 10;
			res = ((res % 10)*10) + tmp % 10;
			cnt++;
		} while(n != res);
		
		System.out.println(cnt);
			
	}

}
