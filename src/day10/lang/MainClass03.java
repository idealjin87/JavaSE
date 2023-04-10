package day10.lang;
/*
 *  [[ 래퍼클래스 (Wrapper Class) ]]
 *   기본 자료형을 객체로 감싸서 사용할수 있도록 해주는 클래스
 *   Boolean, Character, Byte, Short, Integer, Long, Float, Double
 * 
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		// 문자열 "12345"를 정수로 반환하여 int값으로 저장
		String intStr = "12345";
		int iValue = Integer.parseInt(intStr);
		System.out.println("iValue : " + iValue);
		
		// 기본형처럼 대입 가능
		Integer number1 = 10;
		System.out.println("number1 : " + number1);
		
		// 결과가 음수이면 number1 < number2
		// 결과가 양수이면 number1 > number2
		// 결과가 0이면 number1 == number2
		Integer number2 = 10000;
		System.out.println("compareto: " + number1.compareTo(number2));
		
		// equals 같은지 확인
		Integer number3 = 10; // 불변
	    Integer number4 = new Integer(10); // 가변
	    Integer number5 = Integer.valueOf(10); // 불변
	    Integer number6 = Integer.parseInt("10"); // 불변
	    
		// 불변(immutable)
	    System.out.println("equals1 : " + number1.equals(number3));
		System.out.println("equals2 : " + number1.equals(number4));
		System.out.println("equals3 : " + (number1==number3));
		
		// 가변(mutable)
		System.out.println("equals4 : " + (number1==number4));
		
		// 불변(immutable)
		System.out.println("equals5 : " + number1.equals(number5));
		System.out.println("equals6 : " + (number1==number5));
		
		// 불변(immutable)
		System.out.println("equals7 : " + number1.equals(number6));
		System.out.println("equals8 : " + (number1==number6));

		
//		number5 = 5;
//		number6 = 5;
		
		System.out.println(System.identityHashCode(number1));
		System.out.println(System.identityHashCode(number3));
		System.out.println(System.identityHashCode(number4));
		System.out.println(System.identityHashCode(number5));
		System.out.println(System.identityHashCode(number6));
		
		// Integer 객체를 문자열로 반환
		System.out.println("toString : " + number1.toString());
		
		
		                                                                                              
	}                                                                                                 
}
