package week4;

import java.util.Scanner;

/**
 * �� ���α׷��� �Ʒ��� ���� ����� ���ﰢ���� �׸��� ���α׷��Դϴ�.
 * �ﰢ���� ũ��� ����ڰ� �Է��Ͽ� ������ �� �ֽ��ϴ�.
 * *****
 * ****
 * ***
 * **
 * *
 * @author ����ȣ
 */

public class ReversedTriangle {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("���ﰢ���� �׸��� ���α׷��Դϴ�.");
		System.out.print("���ﰢ���� ũ�⸦ �󸶷� �ұ��? 1 �̻��� ������ �Է��ϼ��� : ");
		int num = input.nextInt();
		input.close();
		
		for(int i = num; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
	}

}
