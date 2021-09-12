package algorithm;

public class _16_Star_1 {

	public static void main(String[] args) {
		
//		[별 출력 1]
//		다음 입력 n을 받아 아래와 같은 *을 출력하시오
//		입력 : 5
//		정답 :
//		*
//		**
//		***
//		****
//		*****
		
		int n = 5;
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < i + 1 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
