package week4;

import java.util.Scanner;

/**
 * �� ���α׷��� ���� ����� ATM ��� ���α׷��Դϴ�.
 * �ŷ��� ������ ���˴ϴ�.
 * �ܾ� Ȯ��, �Ա�, ����� �����մϴ�.
 * 4���� �Է��ϸ� ���α׷��� �ٷ� ����˴ϴ�.
 * @author ����ȣ
 */

public class ATMMachine2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double money = 5000;
		int num;
		double withdrawalMoney;
		double deposit;
		boolean done = false;
		
		while (done == false) {
			
			System.out.println("ATM ���α׷��Դϴ�. ��ȣ�� �Է��ϼ��� .");
			System.out.println("�ܾ� Ȯ�� : 1");
			System.out.println("�������� : 2");
			System.out.println("�Ա� : 3");
			System.out.println("���� : 4");
			System.out.print("��ȣ ���� : ");
			num = input.nextInt();
			
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
				done = true;
				break;
				
			default:
				System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�.");
				
			}
			System.out.println("\n");
		}
		
		input.close();
		
		
		
	}

}
