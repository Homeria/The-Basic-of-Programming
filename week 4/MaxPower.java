package week4;

import java.util.Scanner;

/**
 * �� ���α׷��� �Է��� ������ �۰ų� ���� 2�� �ŵ������� �� ���� ū ���� ���ϴ� ���α׷��Դϴ�.
 * �Է��ϴ� ���� �ڿ������� �մϴ�.
 * @author ����ȣ
 *
 */

public class MaxPower {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ڿ��� �ϳ��� �Է��Ͻÿ� : ");
		int num = input.nextInt();
		input.close();
		int power = 0;
		
		for(int i = 0; i <= num; i *= 2) {
			if (i == 0) {
				i = 1;
			}
			power = i;
		}
		
		System.out.println(num + "���� �۰ų� ���� 2�� �ŵ��������� �� ���� ū �� = " + power);
		
	}

}
