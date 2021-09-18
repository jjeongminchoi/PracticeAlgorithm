package algorithm;

import java.util.Scanner;

public class _24_MaybeOverAvg {

	public static void main(String[] args) {
		
//		[평균은 넘겠지]
//		학생수와 점수들이 순서대로 입력된다. 평균보다 넘은 학생들의 비율을 출력하시오.
//		입력 : 7 100 95 90 80 70 60 50
//		정답 : 57.143%
		
		Scanner sc = new Scanner(System.in);
		double score = 0;
		double cnt = 0;
		
		System.out.println("학생 수를 입력하세요(숫자만 입력)");
		int studentNum = sc.nextInt();
		double arr[] = new double[studentNum];
		
		System.out.println("학생들의 점수를 입력하세요.(학생 한명씩)");
		for(int i = 0 ; i < studentNum ; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < studentNum ; i++) {
			score += arr[i];
		}
		
		double avg = score / studentNum;
		
		for(int i = 0 ; i < studentNum ; i++) {
			if(arr[i] > avg) {
				cnt++;
			}
		}

		System.out.println("평균보다 높은 사람 수 : " + cnt);
		System.out.println("학생 수 : " + studentNum + "명");
		System.out.println("총 점수 : " + score + "점");
		System.out.println("평균 : " + avg + "점");
		
		System.out.println("평균 점수보다 높은 학생 비율 : " + (cnt / studentNum * 100));
	}

}
