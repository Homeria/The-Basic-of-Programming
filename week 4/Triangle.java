package week4;

import java.util.Scanner;

/**
 * �� ���α׷��� �Ʒ��� ���� ����� �ﰢ���� �׸��� ���α׷��Դϴ�.
 * �ﰢ���� ũ��� ����ڰ� �Է��Ͽ� ������ �� �ֽ��ϴ�.
 * *
 * **
 * ***
 * ****
 * *****
 * @author ����ȣ
 */

public class Triangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("�ﰢ���� �׸��� ���α׷��Դϴ�.");
		System.out.print("�ﰢ���� ũ�⸦ �󸶷� �ұ��? 1 �̻��� ������ �Է��ϼ��� : ");
		int num = input.nextInt();
		input.close();
		
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
