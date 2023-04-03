package day07.accessmodifier;

import day07.mypac.CellPhone;
import day07.mypac.Phone;
import day07.mypac.SlidePhone;
import day07.mypac2.SmartPhone;

/*
 * [[ ����������/���������� ]]
 * 	public 	- ��� Ŭ�������� ���� ����.
 * 	protected	- ���� ��Ű�� �Ǵ� ��� ���迡�� ���ٰ���.
 * 	default	- ���� ��Ű�� ���� ����.
 * 	private	- ���� Ŭ���� �ȿ��� ���� ����
 * 
 */
public class MainClass01 {
	public static void main(String[] args) {
		Phone phone = new Phone();
		CellPhone cellPhone = new CellPhone();
		SlidePhone slidePhone = new SlidePhone();
		SmartPhone smartPhone = new SmartPhone();
		
		System.out.println("�𵨸� : " + phone.model);
		System.out.println("�𵨸� : " + cellPhone.model);
		System.out.println("�𵨸� : " + slidePhone.model);
		System.out.println("�𵨸� : " + smartPhone.getModel());
		
//		cellPhone.sendMessage();	// protected �ٸ���Ű�� ���� �Ұ�!!
		slidePhone.sendMessage();
//		slidePhone.telecomInternet();	// default �ٸ���Ű�� ���� �Ұ�!!
		smartPhone.videoMessage();
		
	}
}