package week4;

import java.util.Scanner;

/**
 * �� ���α׷��� ���� ����� ATM ��� ���α׷��Դϴ�.
 * �� ���� �ŷ��� ���˴ϴ�.
 * �ܾ� Ȯ��, �Ա�, ����� �����մϴ�.
 * @author ����ȣ
 */

public class ATMMachine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double money = 5000;
		
		System.out.println("ATM ���α׷��Դϴ�. ��ȣ�� �Է��ϼ��� .");
		System.out.println("�ܾ� Ȯ�� : 1");
		System.out.println("�������� : 2");
		System.out.println("�Ա� : 3");
		System.out.println("���� : 4");
		System.out.print("��ȣ ���� : ");
		int num = input.nextInt();
		input.close();
		double withdrawalMoney;
		double deposit;
		
		switch(num) {
		case 1:
			System.out.printf("�ܾ��� %.1f�� �Դϴ�.", money);
			break;
			
		case 2:
			System.out.print("�ݾ���? : ");
			withdrawalMoney = input.nextInt();
			if(withdrawalMoney > money) {
				System.out.println("���� ���ڶ��ϴ�");
			} else {
				money -= withdrawalMoney;
			}
			System.out.printf("�ܾ��� %.1f�Դϴ�.", money);
			break;
			
		case 3:
			System.out.print("�ݾ���? : ");
			deposit = input.nextDouble();
			money += deposit;
			System.out.printf("�ܾ��� %.1f���� �Ǿ����ϴ�.", money);
			break;
			
		case 4:
			System.out.println("�����մϴ�.");
			break;
			
		default:
			System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�.");
			
		}
		
		
	}

}
