package week5;

import java.util.Scanner;

/**
 * �� ���α׷��� Ŀ��, ���̽�ũ��, ����� ���Ǳ� ���α׷��Դϴ�.
 * �������� �ŷ��� �����մϴ�.
 * �޴��� �ؽ�Ʈ�� �����ݴϴ�.
 * �� ����� ���� �����ϴ�.
 * main �޼ҵ� �ϳ��� �����߽��ϴ�.
 * �������� ���� ��ȣ�� �Է����� ������ ó������ ���ư��ϴ�.
 * @author ����ȣ
 *
 */


public class VendingMachine {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("���̽�ũ��, Ŀ��, ���Ḧ �Ĵ� ���Ǳ��Դϴ�.");
		
		boolean done = false;
		
		while (done == false) {
			
			System.out.println("");
			System.out.println("� ������ ���Ͻʴϱ�?");
			System.out.println("���̽�ũ�� :\t1");
			System.out.println("Ŀ�� :\t\t2");
			System.out.println("���� :\t\t3");
			System.out.println("���� :\t\t4");
			System.out.print("��ȣ ���� : ");
			int num = input.nextInt();
			System.out.println("");
			
			if (num == 1 ) {
				
				System.out.println("������ ��ðڽ��ϱ�?");
				System.out.println("�ٴҶ� ���̽�ũ��(1000��) : \t1");
				System.out.println("�Ƹ�� ���̽�ũ��(1400��) : \t2");
				System.out.println("���� ���̽�ũ��(1400��) : \t3");
				System.out.println("ȣ�� ���̽�ũ��(1400��) : \t4");
				System.out.print("��ȣ ���� : ");
				num = input.nextInt();
				if ((num == 1) || (num == 2) || (num == 3) || (num == 4)) {
					System.out.printf("%d ����, �����մϴ�.", num);
					System.out.println("");
				} else {
					System.out.println("�������� ���� ��ȣ�Դϴ�. ó������ ���ư��ϴ�.");
				}
				
				
			} else if (num == 2) {
				
				System.out.println("������ ��ðڽ��ϱ�?");
				System.out.println("�Ƹ޸�ĭ(1000��) : \t\t1");
				System.out.println("ī���(1400��) : \t\t2");
				System.out.println("����������(1400��) :\t3");
				System.out.print("��ȣ ���� : ");
				num = input.nextInt();
				if ((num == 1) || (num == 2) || (num == 3)) {
					System.out.printf("%d ����, �����մϴ�.", num);
					System.out.println("");
				} else {
					System.out.println("�������� ���� ��ȣ�Դϴ�. ó������ ���ư��ϴ�.");
				}
				
				
			} else if (num == 3) {
				System.out.println("������ ��ðڽ��ϱ�?");
				System.out.println("����(1000��) : \t\t1");
				System.out.println("�������꽺(1400��) : \t2");
				System.out.println("�����꽺(1400��) : \t\t3");
				System.out.println("����(1400��) : \t\t4");
				System.out.print("��ȣ ���� : ");
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

}
