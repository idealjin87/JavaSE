package day05.method;

public class MainClass02 {
	private static String name; // �������� name ����
	
	public static void main(String[] args) {
		setName("�Ḹ��");
		
		String name = getName();
		
		System.out.println("name :" + name);
		
		int[] nums = {1, 2, 3};
		int resultSum = sum(nums);
		System.out.println(resultSum);
		
		int resultSum2 = sum(1,2,3);
		System.out.println(resultSum2);
		
	}
	
	// ���� X ���� O
	public static String getName() {
		return MainClass02.name;
	}
	
	public static void setName(String name) {
		MainClass02.name = name;
	}
	
	// ���� O ���� O
	public static int sum(int[] args) {
		int sum = 0;
		for(int arg : args) {
			sum += arg;
		}
		return sum;
	}
	
	public static int sum(int a, int b, int c) {
		return a + b + c;
	}
}
