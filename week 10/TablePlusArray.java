package week10;

import java.util.Scanner;

/**
 * ������ �迭�� ������ ä�� �� ���� �հ� ���� ��, ������ �߰��Ͽ� ����ϴ� ���α׷�
 * @author ����ȣ
 */
public class TablePlusArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("���� �� : ");
		int rows = input.nextInt();
		System.out.print("���� �� : ");
		int cols = input.nextInt();
		System.out.print("������ �ִ� : ");
		int max = input.nextInt();
		input.close();
		
		int[][] table = new int[rows][cols];
		int[] rowSum = new int[rows];
		int[] colSum = new int[cols];
		int total;
		
		System.out.println("");
		
		//�ʱ� table ���
		System.out.println("�ʱ� �迭");
		display(table, rows, cols);
		
		//random �޼ҵ� ȣ��
		random(table, rows, cols, max);
		
		//������ ä���� table ���
		System.out.println("������ ����� �迭");
		display(table, rows, cols);
		
		//calculateRowSums �޼ҵ� ȣ��
		calcualteRowSums(table, rows, cols, rowSum);
		//calculatecolSums �޼ҵ� ȣ��
		calculateColSums(table, rows, cols, colSum);
		//calculateTotal �޼ҵ� ȣ��
		total = calculateTotal(rowSum);
		
		//��ü ���
		System.out.println("����, ���� ���� ���� �迭");
		displayAll(table, rows, cols, rowSum, colSum, total);
		
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
		System.out.println("");
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
	 * 2���� �迭 table�� ���� ���� ���� rowSum�� �����Ѵ�.
	 * table�� 0�� ���� ���� ���� rowSum[0]��,
	 * table�� 1�� ���� ���� ���� rowSum[1]��,
	 * ...
	 * table�� (rows - 1)�� ���� ���� ���� rowSum(rows - 1)�� �����Ѵ�.
	 * @param table 2���� �迭
	 * @param rows table�� �� ��
	 * @param cols table�� �� ��
	 * @param rowSum �� ���� ���� ���� ������ �迭
	 */
	public static void calcualteRowSums(int[][] table, int rows, int cols, int[] rowSum) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				rowSum[i] += table[i][j];
			}
		}
		
	}
	
	
	/**
	 * 2���� �迭 table�� ���� ���� ���� colSum�� �����Ѵ�.
	 * table�� 0�� ���� ���� ���� colSum[0]��,
	 * table�� 1�� ���� ���� ���� colSum[1]��,
	 * ...
	 * table�� (cols - 1)�� ���� ���� ���� colSum(cols - 1)�� �����Ѵ�.
	 * @param table 2���� �迭
	 * @param rows table�� �� ��
	 * @param cols table�� �� ��
	 * @param rowSum �� ���� ���� ���� ������ �迭
	 */
	public static void calculateColSums(int[][] table, int rows, int cols, int[] colSum) {
		for(int i = 0; i < cols; i++) {
			for(int j = 0; j < rows; j++) {
				colSum[i] += table[j][i];
			}
		}
		
	}
	
	
	/**
	 * 2���� �迭 table�� ���ҵ��� ������ ���Ѵ�.
	 * 2���� �迭�� ������ ������ ���� �յ��� ��� ���ؼ� ���� �� �ִ�.
	 * @param rowSum ���� �� �迭
	 * @return ����
	 */
	public static int calculateTotal(int[] rowSum) {
		int total = 0;
		for(int i = 0; i < rowSum.length; i++) {
			total += rowSum[i];
		}
		return total;
	}
	
	
	/**
	 * ������ �����Ͱ� ��� �ִ� 2���� �迭, ���� �� �迭, ���� �� �迭, ������ ǥ ���·� ���
	 * @param table ���� �����Ͱ� ��� �ִ� 2���� �迭
	 * @param rows table�� �� ��
	 * @param cols table�� �� �� 
	 * @param rowSum ���� �� �迭
	 * @param colSum ���� �� �迭
	 * @param total ����
	 */
	public static void displayAll(int[][] table, int rows, int cols, int[] rowSum, int[] colSum, int total) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.print("| \t");
			System.out.println(rowSum[i]);
		}
		System.out.println("");
		for(int i = 0; i < cols; i++) {
			System.out.print(colSum[i] + "\t");
		}
		System.out.print("| \t");
		System.out.print(total);
		
	}

}
