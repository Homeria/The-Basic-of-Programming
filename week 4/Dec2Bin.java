package week4;

import java.util.Scanner;

/**
 * �� ���α׷��� �ϳ��� ������ �����͸� 2������ ��ȯ�ϴ� ���α׷��Դϴ�.
 * �Է��� 10������ �����ͺ��� �۰ų� ���� 2�� �ŵ����� ���� ���� ��
 * �Է��� 10������ ���� ���� 2�� �ŵ����� ���� ũ�⸦ ���Ͽ� 2������ ��ȯ�ϴ� ������ ��Ĩ�ϴ�.
 * @author ����ȣ
 *
 */

public class Dec2Bin {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("�ڿ��� �ϳ��� �������� �Է��Ͻÿ� : ");
		int num = input.nextInt();
		input.close();
		int power = 0;
		boolean done = false;
		
		for(int i = 0; i <= num; i *= 2) {
			if (i == 0) {
				i = 1;
			}
			power = i;
		}
		
		while(done == false) {
			
			if (num >= power) {
				System.out.print("1");
				num -= power;
			} else {
				System.out.print("0");
			}
			if (power == 1) {
				done = true;
			}
			power /= 2;
		}
		
		
		
			
		
		
		
		
		
	}

}
