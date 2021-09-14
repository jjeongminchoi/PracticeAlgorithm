package algorithm;

public class _22_Palindrome {

	public static void main(String[] args) {
		
//		[Palindrome]
//		입력된 수가 팰린드롬인지 판별하시오.
//		입력 : 12321
//		정답 : True
		
//		팰린드롬이란?
//		주어진 숫자나 문자의 가운데 숫자나 문자를 기준으로 대칭으로 이루어진 숫자나 문자 
//		예) 기러기, 토마토, 1234321
		
		String n = "1234321";
		boolean flag = false;
	
		if(n.length() % 2 == 1) { // 입력된 값의 기준 값(가운뎃 값)이 있는지 판별
			for(int i = 0 ; i < n.length() / 2 ; i++) {
				if(n.charAt(i) == n.charAt(n.length() - (i + 1))) {
					flag = true;
				} else {
					flag = false;
				}
			}
		} else {
			flag = false;
		}
		
		System.out.println(flag);
		
	}

}
