package week6;

import java.util.Scanner;

/**
 * �־��� ������ ���ڸ� ������ �˾Ƴ��� �־��� ������ �� �ڸ� ���ڸ� ���ʷ� ����ϴ� ���α׷�
 * @author ����ȣ
 *
 */

public class DigitSplitter {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("������ �Է��Ͻÿ�, int Ÿ�� ���̾�� �ϰ� 0�� �ƴϾ�� �մϴ� : ");
		int num = input.nextInt();
		input.close();
		
		if (num < 0) {
			num = num * (-1);
		}
		
		int numberOfDigits = NumberOfDigitsTest.numberOfDigits(num);
		System.out.println(numberOfDigits + "�ڸ� ���Դϴ�.");
		
		int powersOfTen;
		int digits;
		for (int i = numberOfDigits; i >= 1; i--) {
			powersOfTen = 1;
			for (int j = 1; j < i; j++) {
				powersOfTen *= 10;
			}
			digits = num / powersOfTen;
			System.out.print(digits + " ");
			num -= digits * powersOfTen;
		}
		
		
	}

}
