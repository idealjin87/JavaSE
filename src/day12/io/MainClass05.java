package day12.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import day12.mypac.Member;

/*
 *  [[ ObjectInputStream / ObjectOutputStream ]]
 *   ��ü�� ����Ʈ ��Ʈ������ �а�/���� Ŭ����
 *   
 *  [[ Serializable ]]
 *   ����ȭ, ��ü�� �Ϸ��� ����Ʈ(byte)�� ��ȯ�ϴ°��� ���Ѵ�.
 *   
 */
public class MainClass05 {
	public static void main(String[] args) throws IOException {
		String filePath = "./upload/example.obj";
		
		Member member = new Member("iPod", 18);
		
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(filePath));
			oos.writeObject(member);
			System.out.println("��ü >> ���� ���");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(oos != null)oos.close();
		}
		
		try {
			ois = new ObjectInputStream(new FileInputStream(filePath));
			Member loadedMember = (Member) ois.readObject();
			System.out.println("������� >> ��üȭ");
		    System.out.println("�̸� : " + loadedMember.getName());
		    System.out.println("���� : " + loadedMember.getAge());
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if(ois != null)ois.close();
		}
	}
}
