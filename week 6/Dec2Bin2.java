package week6;

import java.util.Scanner;

/**
 * �� ���α׷��� �ϳ��� ������ �����͸� 2������ ��ȯ�ϴ� ���α׷��Դϴ�.
 * �Է��� 10������ �����ͺ��� �۰ų� ���� 2�� �ŵ����� ���� ���� ��
 * �Է��� 10������ ���� ���� 2�� �ŵ����� ���� ũ�⸦ ���Ͽ� 2������ ��ȯ�ϴ� ������ ��Ĩ�ϴ�.
 * @author ����ȣ
 *
 */

public class Dec2Bin2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("�ڿ��� �ϳ��� �������� �Է��Ͻÿ� : ");
		int num = input.nextInt();
		input.close();
		
		System.out.println(toBinary(num));
		
		
	}
	
	
	/**
	 * �־��� ������ �۰ų� ���� 2�� �ŵ��������� �� ���� ū ���� ���Ѵ�.
	 * �־��� ���� 1 �̻� �����̾�� �Ѵ�.
	 * �־��� ���� 10�̶�� 2^3 = 8
	 * �־��� ���� 6�̶�� 2^2 = 4
	 * @param n �־��� ��.
	 * @return n���� �۰ų� ���� 2�� �ŵ��������� �� ���� ū ��.
	 */
	public static int maxPower(int n) {
		int power = 0;
		for(int i = 0; i <= n; i *= 2) {
			if (i == 0) {
				i = 1;
			}
			power = i;
		}
		return power;
	}
	
	
	/**
	 * �������� �������� ��ȯ�Ͽ� ������ ���ڿ�(String)�� �����.
	 * �������� 1 �̻� �����̾�� �Ѵ�.
	 * ������ 10�� �־����� ���ڿ� '1010'�� ��ȯ�ȴ�
	 * @param n �־��� ������.
	 * @return ������ ���ڿ�.
	 */
	public static String toBinary(int n) {
		
		int maxPower;
		String s = "";
		boolean done = false;
		maxPower = maxPower(n);
		while(done == false) {
			if (n >= maxPower) {
				s = s + "1";
				n -= maxPower;
			} else {
				s = s + "0";
			}
			
			if(maxPower == 1) {
				done = true;
			}
			maxPower /= 2;
		}
		return s;
	}
		

}
