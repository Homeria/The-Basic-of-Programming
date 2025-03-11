package week4;

import java.util.Scanner;

/**
 * �� ���α׷��� �� ���� �Է¹ް�, ��Ģ���� �� �ϳ��� �Է��ϸ� �׿� �´� ����� ���ִ� ���α׷��Դϴ�.
 * �� ���� ���� �Է��� ��, +, -, *, / �� �ϳ��� �Է��Ͻø� �˴ϴ�.
 * �ٸ� ��ȣ�� ���ø� �������� �ʾ� ���α׷��� �ٷ� ����˴ϴ�.
 * @author ����ȣ
 */

public class Calculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("��Ģ ������ �ϴ� ���α׷��Դϴ�.");
		System.out.print("�� ���� ���ʷ� �Է��Ͻÿ� : ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double result = 0;
		System.out.println("�� ���� � ������ �Ͻðڽ��ϱ�?");
		System.out.print("+ - * / �� �ϳ��� �Է��Ͻÿ� : ");
		char operator = input.next().charAt(0);
		input.close();
		
		switch(operator) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;
		default:
			System.out.println("�������� �ʴ� �����Դϴ�.");
			System.exit(-1);
		}
		
		System.out.printf("%.1f %c %.1f = %f", num1, operator, num2, result);
		
		
	}

}
