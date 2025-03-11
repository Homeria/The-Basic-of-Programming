package week5;

import java.util.Scanner;

/**
 * �� ���α׷��� Ŀ��, ���̽�ũ��, ����� ���Ǳ� ���α׷��Դϴ�.
 * �������� �ŷ��� �����մϴ�.
 * �޴��� �ؽ�Ʈ�� �����ݴϴ�.
 * �� ����� ���� �����ϴ�.
 * ���� ���� �޼ҵ�� �����߽��ϴ�.
 * �������� ���� ��ȣ�� �Է����� ������ ó������ ���ư��ϴ�.
 * @author ����ȣ
 */

public class VendingMachine2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean done = false;
		int num;
		
		System.out.println("���̽�ũ��, Ŀ��, ���Ḧ �Ĵ� ���Ǳ��Դϴ�.");
		while(done == false) {
			printMenu();
			num = input.nextInt();
			if (num == 1 ) {
				
				printIceCreamMenu();
				num = input.nextInt();
				if ((num == 1) || (num == 2) || (num == 3) || (num == 4)) {
					System.out.printf("%d ����, �����մϴ�.", num);
					System.out.println("");
				} else {
					System.out.println("�������� ���� ��ȣ�Դϴ�. ó������ ���ư��ϴ�.");
				}
				
				
			} else if (num == 2) {
				
				printCoffeeMenu();
				num = input.nextInt();
				if ((num == 1) || (num == 2) || (num == 3)) {
					System.out.printf("%d ����, �����մϴ�.", num);
					System.out.println("");
				} else {
					System.out.println("�������� ���� ��ȣ�Դϴ�. ó������ ���ư��ϴ�.");
				}
				
				
			} else if (num == 3) {
				printDrinkMenu();
				num = input.nextInt();
				if ((num == 1) || (num == 2) || (num == 3) || (num == 4)) {
					System.out.printf("%d ����, �����մϴ�.", num);
					System.out.println("");
				} else {
					System.out.println("�������� ���� ��ȣ�Դϴ�. ó������ ���ư��ϴ�.");
				}
				
				
			} else if (num == 4) {
				done = true;
				System.out.println("�����մϴ�. �ŷ��� �����մϴ�.");
				
			} else {
				System.out.println("������ ���� �Էµ��� �ʾҽ��ϴ�. �ٽ� �Է����ּ���.");
			}	
		}
		input.close();
		
	}
	
	
/**
 * � ������ �ִ��� �޴��� �����ִ� �޼ҵ�.	
 */
	public static void printMenu() {
		System.out.println("");
		System.out.println("� ������ ���Ͻʴϱ�?");
		System.out.println("���̽�ũ�� :\t1");
		System.out.println("Ŀ�� :\t\t2");
		System.out.println("���� :\t\t3");
		System.out.println("���� :\t\t4");
		System.out.print("��ȣ ���� : ");
	}

/**
 * � ���̽�ũ�� ������ �ִ��� �޴��� �����ִ� �޼ҵ�.	
 */
	public static void printIceCreamMenu() {
		System.out.println("");
		System.out.println("������ ��ðڽ��ϱ�?");
		System.out.println("�ٴҶ� ���̽�ũ��(1000��) : \t1");
		System.out.println("�Ƹ�� ���̽�ũ��(1400��) : \t2");
		System.out.println("���� ���̽�ũ��(1400��) : \t3");
		System.out.println("ȣ�� ���̽�ũ��(1400��) : \t4");
		System.out.print("��ȣ ���� : ");
	}

/**
 * � Ŀ�� ������ �ִ��� �޴��� �����ִ� �޼ҵ�.	
 */
	public static void printCoffeeMenu() {
		System.out.println("");
		System.out.println("������ ��ðڽ��ϱ�?");
		System.out.println("�Ƹ޸�ĭ(1000��) : \t\t1");
		System.out.println("ī���(1400��) : \t\t2");
		System.out.println("����������(1400��) :\t3");
		System.out.print("��ȣ ���� : ");
	}

/**
 * � ����� ������ �ִ��� �޴��� �����ִ� �޼ҵ�.	
 */
	public static void printDrinkMenu() {
		System.out.println("");
		System.out.println("������ ��ðڽ��ϱ�?");
		System.out.println("����(1000��) : \t\t1");
		System.out.println("�������꽺(1400��) : \t2");
		System.out.println("�����꽺(1400��) : \t\t3");
		System.out.println("����(1400��) : \t\t4");
		System.out.print("��ȣ ���� : ");
	}
	
	

}
