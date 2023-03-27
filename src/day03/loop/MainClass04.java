package day03.loop;
/*
 * 
 * 
 * 
 * 
 * 
 * 주말 숙제
2번
   *
  **
 ***
****

3번
   *
  ***
 *****
******* 
  
4번
   *
  ***
 *****
*******
 *****
  ***
   *
   ☆
   *
  ***
 *****
******* 
  | | Merry Christmas~*
 */
public class MainClass04 {
	public static void main(String[] args) {
		for(int i = 0; i < 7; i++) {      
			for(int j = 0; j < 7; j++) {  
				System.out.print("*");
			}
			
			System.out.println(); // 개행
		}
		    System.out.println();
               		
	    for(int i = 0; i < 7; i++) {      
	    	System.out.print(i + " : ");
	    	for(int j = 0; j < i+1; j++) {  
		    	System.out.print("*");
		}
		
		    System.out.println();
	
}
	
}
}