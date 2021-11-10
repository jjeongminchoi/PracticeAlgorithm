package algorithm;

public class _37_Apart {

//		[단지수 측정 재귀ver]
//		입력된 단지의 수와 각 단지의 세대 수를 출력하시오. (33번 색칠과 유사)
//		입력 : 
//		0 0 0 1 1
//		0 0 0 0 1
//		1 0 0 0 0
//		1 1 0 0 0
//		1 1 0 1 1
//		출력 : 3 (단지 수)
//		       3 5 2 (단지의 세대 수)
	
	static final int SIZE = 5;
	static final int APART = 1;
	
	static int apartCnt = 0;
	static int[] houseHold = new int[3];
	
	static int[][] map = {
			{0, 0, 0, 1, 1},
			{0, 0, 0, 0, 1},
			{1, 0, 0, 0, 0},
			{1, 1, 0, 0, 0},
			{1, 1, 0, 1, 1}
	};
	
	public static void function(int y, int x, int apartIndex) {
		
		// Change color to 0
		map[y][x] = 0;
		houseHold[apartIndex]++;
		
		if(x - 1 >= 0 && map[y][x - 1] == APART) {
			function(y, x - 1, apartIndex);
		}
		if(x + 1 <= SIZE - 1 && map[y][x + 1] == APART) {
			function(y, x + 1, apartIndex);
		}
		if(y + 1 <= SIZE - 1 && map[y + 1][x] == APART) {
			function(y + 1, x, apartIndex);
		}
		if(y - 1 >= 0 && map[y - 1][x] == APART) {
			function(y - 1, x, apartIndex);
		}
		
	}
	
	public static void main(String[] args) {
		
		for(int i = 0 ; i < SIZE ; i++) {
			for(int j = 0 ; j < SIZE ; j++) {
				if(map[i][j] == 1) {
					function(i, j, apartCnt);
					apartCnt++;
				}
			}
		}
		
		System.out.println(apartCnt);

		for(int i : houseHold) {
			System.out.print(i + " ");
		}
		
	}

}
