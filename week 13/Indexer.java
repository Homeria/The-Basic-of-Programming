package week13;

import java.util.Scanner;

/**
 * �� ���� ������ �о� �鿩 'a', 'b', 'c'�� ó�� ������ �ε����� ���� ����ϴ� ���α׷�.
 * @author ����ȣ
 *
 */
public class Indexer {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("�Է� : ");
		String a = new String(input.nextLine());
		a = a.toLowerCase();
		
		int sum = 0;
		sum += returnIndex(a, 'a');
		sum += returnIndex(a, 'b');
		sum += returnIndex(a, 'c');
		
		System.out.println("��� : " + sum);
		
		input.close();
	}
	
	
	/**
	 * ���忡 ���ϴ� ���ڰ� �ִ��� �Ǻ��ϰ� �� ���ڰ� ������ ù ��° �ε����� ��ȯ�ϴ� �޼ҵ�
	 * @param a ����
	 * @param b ã�� ���ϴ� ����
	 * @return ���� ã�� ���ϴ� ���ڰ� �ִٸ� ���忡���� �ε�����
	 * 			���� ã�� ���ϴ� ���ڰ� ���ٸ� -1
	 */
	public static int returnIndex(String a, char b) {
		char c;
		for(int i = 0; i < a.length(); i++) {
			c = a.charAt(i);
			if (c == b) {
				return i;
			}
		}
		return -1;
	}
	
	
	

}
