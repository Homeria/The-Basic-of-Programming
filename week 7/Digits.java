package week7;

import java.util.Scanner;

/**
 * �Է¹��� ���ڸ� ���ڿ��� ����Ͽ� ���ڿ��� ���̸� �˷��ְ�, �� �ڸ����� �и��Ͽ� ����ϴ� ���α׷�
 * ���̳ʽ� ��ȣ�� ���ڿ��� ���̿� ����
 * length, charAt ���
 * @author CKH
 *
 */
public class Digits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		String num = input.next();
		String digits = "";
		input.close();
		
		System.out.println(num.length() + "���� ���ڷ� �̷���� ���ڿ��Դϴ�.");
		for (int i = 0; i < num.length(); i++) {
			digits += num.charAt(i);
			digits += " ";
		}
		System.out.println(digits);
		
	}

}
