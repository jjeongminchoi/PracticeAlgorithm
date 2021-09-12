package algorithm;

public class _20_369Game {
	
	public static void main(String[] args) {
		
//		[3 6 9 게임]
//		100까지 369 게임을 아래와 같이 진행하시오.
//		정답:
//		1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15 짝 ... 28 짝 짝 짝 짝 짝짝 짝 ... 짝짝 100
		
		int n = 100;
		
		for(int i = 1 ; i <= n ; i++) {
			int cnt = getNum(i);
			
			if(cnt == 0) {
				System.out.print(i + " ");
			} else {
				for(int l = 0 ; l < cnt ; l++) {
					System.out.print("짝");
				}
				System.out.print(" ");
			}
		}
		
	}
	
	public static int getNum(int i) { // 3 or 6 or 9 를 몇 개 가지고 있는 카운트 하는 메서드
		int j = 0;
		
		while(i > 0) {
			if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
				j++;
			}
			i /= 10;
		}
		
		return j;
	}

}
