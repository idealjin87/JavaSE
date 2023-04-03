package day08.exception;

public class MainClass03 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		int num3 = 5;
		int result = 0;
		int result2 = 2;
		
		try {
			System.out.println("DB를 연결합니다.");
			
			result = num1 / num2;
			System.out.println("result : " + result);
			
			result2 = num1 / num3;
			System.out.println("result : " + result2);
			
		} catch(Exception e) {
			System.out.println("예외가 발생하였습니다.");
		} finally { // 반드시 실행
			System.out.println("DB 연결 해제합니다.");
		}
	}
}
