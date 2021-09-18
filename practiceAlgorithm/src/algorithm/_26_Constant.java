package algorithm;

public class _26_Constant {

	public static void main(String[] args) {
		
//		[상수]
//		상수는 수를 다른 사람과 다르게 거꾸로 읽는다.
//		예를 들어, 734와 893을 칠판에 적었다면, 상수는 437과 398로 읽는다.
//		따라서 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
//		
//		예제 입력 : 734 893
//		예제 출력 : 437
		
		int a = 734;
		int b = 893;
		
		int[] aArr = new int[3];
		int[] bArr = new int[3];
		
		int gob = 1; // 곱할 값
		
		int reA = 0; // 최종 값
		int reB = 0; // 최종 값
		
		for(int i = 0 ; i < 3 ; i++) {
			aArr[i] = a % 10;
			bArr[i] = b % 10;
			a /= 10;
			b /= 10;
		}
		// 4 3 7
		for(int i = aArr.length-1 ; i >= 0 ; i--) {
			reA += aArr[i] * gob;
			gob *= 10;
		}
		
		if(reA > reB) {
			System.out.println(reA);
		} else {
			System.out.println(reB);
		}
		
	}

}
