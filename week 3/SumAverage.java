package week3;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
		
		int sum = 0;
		int value;
		double average = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �� �� ���Ͻðڽ��ϱ�? ");
		int number = input.nextInt();
		
		System.out.print("3���� ������ ���ʷ� �Է��Ͻÿ� : ");
		for(int i = 1; i <= number; i++) {
			value = input.nextInt();
			sum += value;
		}
		
		input.close();
		
		average = (double)sum / number;
		System.out.println("������ �� = " + sum);
		System.out.printf("��� = %.2f", average);
	}

}
