package week10;

import java.util.Scanner;

/**
 * ������ �迭�� ������ ä�� �� ���� �հ� ���� ��, ������ �߰��Ͽ� ����ϴ� ���α׷�
 * TablePlusArray.java�� �ٸ��� 2���� �迭 �ϳ��� ������ �����Ϳ� ���� ��, ���� ��, ������ ��� ���� �ִ� ���
 * @author ����ȣ
 */
public class Table {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("���� �� : ");
		int rows = input.nextInt();
		System.out.print("���� �� : ");
		int cols = input.nextInt();
		System.out.print("������ �ִ� : ");
		int max = input.nextInt();
		
		int[][] table = new int[rows + 1][cols + 1];
		
		System.out.println("");
		
		//�ʱ� table ���
		System.out.println("�ʱ� �迭");
		display(table, rows, cols);
		
		System.out.println("");
		
		//random �޼ҵ� ȣ��
		random(table, rows, cols, max);
		
		//������ ä���� table ���
		System.out.println("������ ����� �迭");
		display(table, rows, cols);
		System.out.println("");
		
		//total �޼ҵ� ȣ��
		total(table);
		
		//��ü ���
		System.out.println("����, ���� ���� ���� �迭");
		for(int i = 0; i < rows + 1; i++) {
			for(int j = 0; j < cols + 1; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println("");
		}
		input.close();
		
	}
	
	
	
	/**
	 * ������ �迭 table�� ù rows ��, ù cols ���� �ִ� ���ҵ��� ǥ ���·� ���
	 * ���� ���� : row�� table�� �� �������� �۰ų� ����, cols�� table�� �� �������� �۰ų� ����.
	 * @param table ������ ���� �迭
	 * @param rows ����� �� ��
	 * @param cols ����� �� ��
	 */
	public static void display(int[][] table, int rows, int cols) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	
	/**
	 * 2���� �迭 table�� ���� Ȥ�� �Ϻο� ������ ä���.
	 * ������ 0 �̻�, max ���� �����̾�� �Ѵ�.
	 * ���� ���� : rows�� table�� �� �������� �۰ų� ����, cols�� table�� �� �������� �۰ų� ���ƾ� �Ѵ�.
	 * @param table �迭
	 * @param rows ������ ä�� �� ����
	 * @param cols ������ ä�� �� ����
	 * @param max ������ �ִ밪
	 */
	public static void random(int[][] table, int rows, int cols, int max) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				table[i][j] = (int)(Math.random() * max);
			}
		}
	}
	
	
	/**
	 * 2���� �迭 table�� ������ ����� ������ ���� �����հ� �������� ä���.
	 * a�� ������ ��� ������ ���� ������ ������ ���鿡 �����Ͱ� ��� �ִ�.
	 * @param table 2���� �迭
	 */
	public static void total(int[][] table) {
		
		//���� �� ���
		for(int i = 0; i < table.length - 1; i++) {
			for(int j = 0; j < table[0].length - 1; j++) {
				table[i][table[0].length-1] += table[i][j];
			}
		}
		
		//���� �� ���
		for(int i = 0; i < table[0].length - 1; i++) {
			for(int j = 0; j < table.length - 1; j++) {
				table[table.length-1][i] += table[j][i];
			}
		}
		
		//total ���
		for(int i = 0; i < table.length - 1; i++) {
			table[table.length - 1][table[0].length - 1] += table[i][table[0].length - 1]; 
		}
		
	}

}
