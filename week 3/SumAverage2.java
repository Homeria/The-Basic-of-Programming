package week3;

import java.util.Scanner;

public class SumAverage2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("����� ���ϴ� ���α׷�");
		System.out.println("0 �̻� ������ ���� �� �Է��Ͻÿ�.");
		System.out.println("�Է��� ��ġ���� ���� ������ �Է��Ͻÿ�.");
		
		int num = 0;
		int sum = 0;
		int count = 0;
		double average = 0;
		
		while(num >= 0) {
			num = input.nextInt();
			if(num < 0) {
				break;
			}
			count += 1;
			sum += num;
		}
		average = (double)sum / count;
		input.close();
		
		System.out.println("�Էµ� 0 �̻� ���� ���� = " + count);
		
		if (sum > 0) {
			System.out.println("������ �� = " + sum);
			System.out.printf("��� = %.2f", average);
		}
		
		
		
	}

}
