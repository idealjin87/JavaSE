package day03.operator;
/*
 *  6. ��Ʈ������  - 2������ ǥ���� �� ��Ʈ ������
 *    & : And ������
 *    | : Or ������
 *    ^ : XOR ������
 *    ~ : NOT ������
 *  
 *  7. ����Ʈ������
 *   << : �������� ��Ʈ �̵�
 *   >> : ���������� ��Ʈ �̵�
 *   
 */
public class MainClass06 {
	public static void main(String[] args) {
		System.out.println(3&4);
		System.out.println(3|4);
		System.out.println(3^4);
		System.out.println(~3); // ���� 2�Ǻ��� �� ���
		
		System.out.println(1<<1);
		System.out.println(2>>1);
	}
}
