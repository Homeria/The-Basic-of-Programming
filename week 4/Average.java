package week4;

import java.util.Scanner;

/**
 * �� ���α׷��� �Է��� ������� ����� ���ϴ� ���α׷��Դϴ�.
 * �Է��� ���Ѱ� �Է��� �� ������, �Է��� ��ġ���� 0 ������ ���� �Է��ϼž� �մϴ�.
 * �Է��� ����Ǹ� �Է��Ͻ� ������ ���ϰ�, ������ ������ ���� ����� ���մϴ�.
 * @author ����ȣ
 */

public class Average {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������� ����� ���ϴ� ���α׷��Դϴ�.");
		System.out.println("�Է��� ��ġ���� 0 ������ ���� �Է��Ͻÿ�");
		System.out.println("");
		
		int count = 0;
		double num = 1;
		double sum = 0;
		boolean condition = true;
		
		while(condition == true) {
			System.out.print("���ڸ� �Է��Ͻÿ� : ");
			num = input.nextDouble();
			if (num <= 0) {
				condition = false;
			} else {
				sum += num;
				count += 1;
			}	
		}
		input.close();
		
		if (sum > 0) {
			double average = sum / count;
			System.out.printf("��� = %.2f", average);
		} else {
			System.out.println("����� �ϳ��� �Էµ��� �ʾҽ��ϴ�.");
		}
		
		
		
		
	}

}
