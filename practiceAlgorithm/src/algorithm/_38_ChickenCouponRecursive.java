package algorithm;

import java.util.Scanner;

public class _38_ChickenCouponRecursive {

//		[치킨쿠폰 재귀ver]
//		강민이는 치킨 한 마리를 주문할 수 있는 치킨 쿠폰을 n장 가지고 있다.
//		이 치킨집에서는 치킨을 한 마리 주문할 때마다 도장을 하나씩 찍어 주는데, 도장을 k개 모으면 치킨 쿠폰 한 장으로 교환할 수 있다.
//		강민이가 지금 갖고 있는 치킨 쿠폰으로 치킨을 최대 몇 마리나 먹을 수 있는지 구하여라.
//		단, 치킨을 주문하기 위해서는 반드시 치킨 쿠폰을 갖고 있어야 한다.
//		
//		입력 : n k
//		출력 : 정답
//		
//		예)
//		입력 :   4 3
//			  10 3
//			 100 5
//		출력 : 5
//			 14
//			 124
	
	public static void recursive(int coupon, int stamp, int k, int res) {
		
		if(coupon > 0) {
			coupon--;
			stamp++;
			res++;
			recursive(coupon, stamp, k, res);
			return;
		} else if(stamp > 0) {
			if(stamp / k > 0) {
				stamp -= k;
				coupon++;
				recursive(coupon, stamp, k, res);
			}
		}
		
		if(coupon == 0 && stamp / k == 0) {
			System.out.println(res);
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("치킨 쿠폰을 몇 장 갖고 있는 지 입력하세요.");
		int n = sc.nextInt();
		
		System.out.println("도장 몇 개를 모으면 치킨 쿠폰 한 장으로 교환할 수 있는 지 입력하세요.");
		int k = sc.nextInt();
		
		int coupon = n;
		
		recursive(coupon, 0, k, 0);
		
	}

}
