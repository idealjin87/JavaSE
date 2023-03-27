package day04.array;

/*
1  2  3  4  5  6  7
8  9  10 11 12 13 14
15 16 17 18 19 20 21
22 23 24 25 26 27 28
29 30 31 32 33 34 35
36 37 38 39 40 41 42
43 44 45 46 47 48 49

1. 2중배열 선언하고
2. for 문으로 1~49 값을 대입하기
3. 2중배열 출력하기 지그재그

1 
2 8 
15 9 3 
4 10 16 22 
29 23 17 11 5 
6 12 18 24 30 36 
43 37 31 25 19 13 7 
14 20 26 32 38 44 
45 39 33 27 21 
28 34 40 46 
47 41 35 
42 48 
49 


*/
public class MainClass06 {
	public static void main(String[] args) {
		int[][] array = new int[7][7];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = i * 7 + j + 1;
				if (array[i][j] < 10) {
					System.out.print(" " + array[i][j] + "[" + i + "]" + "[" + j + "]");
				} else {
					System.out.print(array[i][j] + "[" + i + "]" + "[" + j + "]");
				}
				System.out.println(); // 개행
			} // for j

			System.out.println(); // 개행
		} // for i
		for (int i = 0; i < 13; i++) {
			if (i < 10) {
				System.out.println(" ");
			}
			System.out.print(i + ":");

			// 숙제 코드
			if (i < 7) {
				for (int j = 0; j < i + 1; j++) {
					if (i % 2 < 1) { // 인덱스번호 짝수 0 포함
						System.out.print(array[i - j][j] + " ");
					} else {
						System.out.print(array[j][i - j] + " ");
					}
				}
			} else {
				for (int j = 0; j < 13 - i; j++) {
					if(i % 2 < 1) {
						System.out.print(array[6-j][i-6+j] + " ");
					} else {
						System.out.print(array[i-6+j][6-j] + " ");
					}
				}
			}
		}

	}

}
