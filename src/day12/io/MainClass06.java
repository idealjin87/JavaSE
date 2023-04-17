package day12.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 	[[ Try-with-resources ]]
 *   try �ڵ� ����� ������ �ڵ����� resource�� �������ִ� ����̴�.
 *   
 *   AuthoCloseable ��ӹ��� resources�� ����!
 * 
 */
public class MainClass06 {
	public static void main(String[] args) {
		File f1 = null; 
		File f2 = null;
		
		try {
			// upload3 ���� ����
			f1 = new File("./upload3");
			f1.mkdir();
			
			f2 = new File(f1, "hello5.txt");
			f2.createNewFile();		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try (   // �ڵ����� close ���ش�.
				FileInputStream fis = new FileInputStream("./upload/hello.txt");
				BufferedInputStream bis = new BufferedInputStream(fis);
				
				FileOutputStream fos = new FileOutputStream(f2);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				PrintStream ps = new PrintStream(bos, true);
				){
			int readByteCnt = 0;
			byte[] b = new byte[1024];
			
			while((readByteCnt = bis.read(b)) != -1) {
				bos.write(b, 0, readByteCnt);
			}
			
			bos.flush();
			
			ps.println();
			ps.println("***********************");
			ps.println("Try-with-resources");
			ps.println("***********************");
			
			System.out.println("���� �Ϸ�!");
			
		}catch (Exception e) {
	    	   e.printStackTrace();
			
	    } 
       } 
		
       }

