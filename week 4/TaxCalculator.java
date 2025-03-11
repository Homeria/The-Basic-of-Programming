package week4;

import java.util.Scanner;

/**
 * �� ���α׷��� �Է��� �ҵ濡 ���� �ٸ� ������ �����Ͽ� �ҵ漼�� �˷��ִ� ���α׷��Դϴ�.
 * �ҵ��� 4600���� ���ϴ� 15%, 8800���� ���ϴ� 24%, 8800���� �ʰ��� 35%�� ������ �߻��մϴ�.
 * ���� �ҵ��� 9000�����̶�� 4600������ 15%
 * 8800�������� 4600������ �� 4200�������� 24%
 * 9000�������� 8800������ �� 200�������� 35%�� ������ �߻��մϴ�.
 * @author ����ȣ
 *
 */

public class TaxCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double TAX_RATE_LOW = 15.0/100.0;
		final double TAX_RATE_MID = 24.0/100.0;
		final double TAX_RATE_HIGH = 35.0/100.0;
		double tax = 0;
		
		System.out.print("�ҵ���? ���������� �Է��Ͻÿ� : ");
		int income = input.nextInt();
		input.close();
		
		if (income > 8800) {
			tax = 4600 * TAX_RATE_LOW + (8800 - 4600) * TAX_RATE_MID + (income - 8800) * TAX_RATE_HIGH;
		} else if ((income > 4600) && (income <= 8800)) {
			tax = 4600 * TAX_RATE_LOW + (income - 4600) * TAX_RATE_MID;
		} else {
			tax = income * TAX_RATE_LOW;
		}
		
		System.out.printf("�ҵ漼 : " + tax + "����");
		
		
	}

}
