package week6;

import java.util.Scanner;

/**
 * �־��� ������ ���ڸ� ������ �˾Ƴ��� ���α׷�
 * int Ÿ�� ���̾�� �ϰ� 0�� �ƴϾ�� ��.
 * @author ����ȣ
 *
 */

public class NumberOfDigitsTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("������ �ڸ� ���� �˷��ݴϴ�.");
		System.out.println("������ �Է��Ͻÿ�.");
		System.out.println("int Ÿ�� ���̾�� �ϰ� 0�� �ƴϾ�� �մϴ�.");
		int num = input.nextInt();
		input.close();
		int numberOfDigits = numberOfDigits(num);
		System.out.println(numberOfDigits + "�ڸ� ���Դϴ�.");
	}
	
	/**
	 * 10�� �ŵ����� ���� ������ش�.
	 * 10�� 0�ŵ������� 1�̴�.
	 * @param n �� �ŵ������� �� ������ �����Ѵ�. n�� 0�̻� �����̾�� �Ѵ�.
	 * @return 10�� n�ŵ�������
	 */
	public static int powersOfTen(int n) {
		int num = 1;
		for(int i = 1; i <= n; i++) {
			num *= 10;
		}
		return num;
	}
	
	
	/**
	 * �־��� ������ ���ڸ� ������ �˾Ƴ���.
	 * @param n �־��� ����, 0�� �ƴϾ�� �Ѵ�.
	 * @return n�� �� �ڸ� ������.
	 */
	public static int numberOfDigits(int n) {
		
		int i;
		for (i = 9; (n / powersOfTen(i)) == 0; i--);
		return i + 1;
	}

}
