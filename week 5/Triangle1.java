package week5;

import java.util.Scanner;


/**
 * �� ���α׷��� �ڽ��� ���ϴ� ũ��� ���ﰢ���� �׷��ִ� ���α׷��Դϴ�.
 * ���簢������ 90���� ���� ���� ��ġ�� ������, �Ʒ��� ������ �������ϴ�.
 * @author ����ȣ
 *
 */
public class Triangle1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("�ﰢ���� �׸��� ���α׷��Դϴ�.");
		System.out.print("�ﰢ���� ũ�⸦ �󸶷� �ұ��? ");
		int howMuch = input.nextInt();
		
		for (int i = howMuch; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.print("\n");
		}
		input.close();
	}

}
