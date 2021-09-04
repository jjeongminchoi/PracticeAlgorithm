package algorithm;

import java.util.Scanner;

public class UpperAndLowerConversion {

	public static void main(String[] args) {
		
		// 문제) 대문자는 소문자로, 소문자는 대문자로 변환하시오.
		// inputWord = helloWorlD
		// result = HELLOwORLd
		
		String inputWord = "helloWorlD"; // 입력값 선언
		char[] arr = inputWord.toCharArray(); // toCharArray() : String타입의 문자열을 한 글자씩 쪼개서 
											  // 				 char타입의 배열에 넣어주는 메서드

		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] = (char) (arr[i] + ('A' - 'a'));
			} else if(arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] = (char) (arr[i] - ('A' - 'a'));
			}
		}
		
		System.out.println(arr);
		
	}

}
