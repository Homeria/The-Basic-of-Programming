package week3;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("� ���� ������� ����ұ��? ");
		int number = input.nextInt();
		input.close();
		
		System.out.println("1 �̻� 100 ���� �� �� " + number + "�� �����");
		for(int i = 1; i <= 100; i++) {
			if ((i % number) == 0) {
				System.out.print(i + " ");
			}
		}
		
		
		
		

	}

}
