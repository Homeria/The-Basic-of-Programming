package week13;

import java.util.Scanner;

/**
 * �� ���� �ܾ �о� ���� �� �� ���� ���Ͽ� ����������� ����ϴ� ���α׷�
 * �빮�ڰ� �ҹ��ں��� �տ� ��.
 * @author ����ȣ
 *
 */
public class Sorter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("�Է� : ");
		String a = new String(input.next());
		String b = new String(input.next());
		
		int n = a.compareTo(b);
		System.out.print("��� : ");
		if (n < 0) {
			System.out.println(a + " " + b);
		} else if (n > 0) {
			System.out.println(b + " " + a);
		} else {
			System.out.println(a + " " + b);
		}
		input.close();
	}	
		
}


