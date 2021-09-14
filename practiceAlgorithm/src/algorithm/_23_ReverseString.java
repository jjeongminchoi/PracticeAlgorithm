package algorithm;

public class _23_ReverseString {

	public static void main(String[] args) {
		
//		[문자열 뒤집기]
//		입력된 문자열을 뒤집어서 출력하시오.
//		입력 : ADEFH
//		정답 : HFEDA
		
		// 방1
		String s = "ADEFH";

		char[] arr = s.toCharArray();
		
		for(int i = arr.length - 1 ; i >= 0 ; i--) {
			System.out.print(arr[i]);
		}
		
		System.out.println();
		
		// 방2
		String n = "ADEFH";
		
		char[] str = n.toCharArray();
		int len = str.length;
		char temp;
		
		for(int i = 0 ; i < len / 2 ; i++) {
			temp = str[i];
			str[i] = str[len - i - 1];
			str[len - i - 1] = temp;
		}
		
		n = new String(str);
		
		System.out.println(n);
		
	}

}
