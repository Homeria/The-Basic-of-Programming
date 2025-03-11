package week6;

import java.util.Scanner;

/**
 * �־��� ���� �ƴ� �������� �۰ų� ���� ������ �������� �� �ִ밪�� ���ϴ� ���α׷�
 * ���α׷��� ��� �ݺ��ϸ�, ������ �ԷµǸ� ����˴ϴ�.
 * @author ����ȣ
 *
 */
public class MaxSquareTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean done = false;
		
		while(done == false) {
			System.out.print("�Է� : ");
			int num = input.nextInt();
			
			if (num >= 0) {
				int maxSquare = maxSquare(num);
				System.out.println(num + "���� �۰ų� ���� �ִ� \"������ ��������\" " + maxSquare + "�Դϴ�.");
			} else {
				System.out.println("���α׷��� �������ϴ�.");
				done = true;
			}
		}
		input.close();
		
	}
	
	
	/**
	 * �־��� ���� �ƴ� �������� �۰ų� ���� "������ ������"�� �� �ִ밪�� ���Ѵ�
	 * @param bound �־��� ���� (���� �ƴϰ� �������� ��)
	 * @return �ִ� "������ ������"
	 */
	
	public static int maxSquare(int bound) {
		int num = 0;
		
		for (int i = 1; bound >= i * i; i++) {
			int num1 = i * i;
			int num2 = (i + 1) * (i + 1);
			
			if (bound < num2) {
				num = num1;
			}
		}
		return num;
	}

}
