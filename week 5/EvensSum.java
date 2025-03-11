package week5;

import java.util.Scanner;

/**
 * �־��� �� �� ������ ¦���� ���� ���ϴ� ���α׷��Դϴ�.
 * �־��� ���� ¦���̸� �� ���� �տ� ���Ե˴ϴ�.
 * @author ����ȣ
 *
 */

public class EvensSum {

	public static void main(String[] args) {

		int sumResult;
		int temp;
		boolean done = false;
		
		Scanner input = new Scanner(System.in);
		System.out.println("������ ������ ¦������ ���� ���մϴ�.");
		
		while(done == false) {
			System.out.print("�� ���� ������ �Է��Ͻÿ� : ");
			int from = input.nextInt();
			int to = input.nextInt();
			
			if ((from == 0) && (to == 0)) {

				System.out.println("�����մϴ�. ���α׷��� ��Ĩ�ϴ�.");
				done = true;
			} else {
				if (from > to) {
					temp = to;
					to = from;
					from = temp;
				}
				sumResult = getEvensSum(from, to);
				System.out.printf("%d���� %d������ ¦���� �� = %d\n", from, to, sumResult);
			}
		}
		input.close();
		
		
	}
	
	/**
	 * �־��� �� �� ������ ¦���� ���� ���մϴ�.
	 * �־��� ���� ¦���̸� �� ���� �տ� ���Ե˴ϴ�.
	 * 	�������� : from <= to
	 * 	�� �޼ҵ��� ȣ���� ���� �� ���������� ���Ѿ� �մϴ�.
	 * 	���������� ��ų ���� �� �޼ҵ�� �ùٸ� ����� �����մϴ�.
	 * 
	 * @param from �־��� ��
	 * @param to �־��� ��
	 * @return ¦���� ��
	 */
	public static int getEvensSum(int from, int to) {
		
		int sumResult = 0;
		for(int i = from; i <= to; i++) {
			if ((i % 2) == 0) {
				sumResult += i;
			}
		}
		return sumResult;
		
	}

}
