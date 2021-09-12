package algorithm;

public class _18_Star_3 {

	public static void main(String[] args) {
		
//		[별 출력 3]
//		다음 입력 n을 받아 아래와 같은 *을 출력하시오
//		입력 : 5
//		정답 :
//		    *
//		   **
//		  ***
//		 ****
//		*****
//		0 -> 4
//		1 -> 3
//		2 -> 2
//		3 -> 1
//		4 -> 0
		
		int n = 5;
		
		// 나
		for(int i = 0 ; i < n ; i++) {
			for(int j = n ; j > 0 ; j--) {
				if(i < j - 1) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 영상
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(i < n - (j + 1)) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}

}
