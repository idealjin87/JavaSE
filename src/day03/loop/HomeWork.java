package day03.loop;
/*
 * 
 * 0:   *
 * 1:  ***
 * 2: *****
 * 3:*******
 * 4: *****
 * 5:  ***
 * 6:   *
 * 
 * 
 */
public class HomeWork {
public static void main(String[] args) {
	
	for(int i = 0; i < 7; i++) {
		System.out.print(i + ":");
		
		for(int j = 0; j < 7; j++) {
			if(i < 3 - j) {
				System.out.print(" ");
			}else if(j - i > 3) {
				System.out.print(" ");
			}else if(i - j > 3) {
				System.out.print(" ");
			}else if(i + j > 9) {
				System.out.print(" ");
			}else {
			System.out.print("*");
			}
		}
		System.out.println(); // °³Çà
	}
}
}
