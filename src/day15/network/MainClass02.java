package day15.network;

import java.net.MalformedURLException;
import java.net.URL;

/*
 * [[ URL(Uniform Resource Locator) ]]
 * 	���ͳݿ��� �� ������, �̹���, ������ ��� ���� ���ҽ��� ã�� �� �ִ� �ּ�
 * 
 * https://n.news.naver.com/article/020/0003493846?ntype=RANKING
 * 
 * 	��������(protocol)
 * 		��ǻ�� ��Ʈ��ũ�� ���� ����� �����ϱ� ���� ǥ�� ��Ģ, ����, Ȥ�� ��� ���μ����� �ǹ�
 * 		ex) http/https - ������ ��������
 * 			ftp - ���ϼ��� ��������
 * 			mailto - ���ڸ��� ���� ��������
 * 			telnet - ������ ���� ��������
 * 
 * 	ȣ��Ʈ(host)
 * 		���ҽ��� ��ġ�� ������ �̸�
 * 		ex) n.news.naver.com
 * 	
 * 	��Ʈ(port)
 * 		�������� ����ϴ� ���񽺳� �������α׷��� �Ҵ�� ��ȣ
 * 		ex) 80(http default) 443(https default)
 * 
 * 	���(path) 
 * 		�� �������� �ڿ��� ���� ���(������ �Ǵ� �߻��� ���)
 * 		ex)/article/020/0003493846
 * 			/���1/���2/�������̸�.html
 * 			/upload/2023/4/14/upload_2023414887
 * 
 * 
 * 	����(query)
 * 		�߰��� ������ ������ �Ķ���� (����ǥ ��) 
 *      ?ntype=RANKING
 *      ?key1=value1&key2=value2....&keyN=valueN
 * 
 * 	���۷���(reference)
 * 		�������� ���� Ư�� ���� �Ǵ� ���� Ư����ġ
 * 		ex) #body
 * 
 * [[ URL Class ]]
 * 	URL Ŭ���� ����Ͽ� �������� ���ҽ�, �̹���, ������, REST API �� �����͸� ������ �� �ִ�. 
 */
public class MainClass02 {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("https://n.news.naver.com:443/article/020/0003493846?ntype=RANKING#body");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		int port = url.getPort();
		String path = url.getPath();
		String query = url.getQuery();
		String refrence = url.getRef();
		
		System.out.println("protocol : " + protocol);
		System.out.println("host : " + host);
		System.out.println("port : " + port);
		System.out.println("path : " + path);
		System.out.println("query : " + query);
		System.out.println("refrence : " + refrence);
		
		
		
		
	}

}