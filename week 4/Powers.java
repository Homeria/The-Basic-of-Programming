package week4;

import java.util.Scanner;

/**
 * �� ���α׷��� �Է¹��� ������ŭ 2�� �ŵ������� ���ϴ� ���α׷��Դϴ�.
 * ���� 10�� �Է��Ѵٸ� 2�� 0�������� 2�� 10�������� ����մϴ�.
 * ����ڴ� �׻� 0 �̻��� ������ �Է��ؾ� �մϴ�.
 * 2�� 31�������ʹ� �ùٸ��� ���� ���� ��µ˴ϴ�.
 * @author ����ȣ
 */

public class Powers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("2�� �� �������� ���ұ��? ");
		int num = input.nextInt();
		int count = 0;
		input.close();
		
		for(int i = 0; count <= num; i *= 2) {
			if (i == 0) {
				i = 1;
			}
			System.out.println("2�� " + count + "���� : " + i);
			count += 1;
		}
		
	}

}
