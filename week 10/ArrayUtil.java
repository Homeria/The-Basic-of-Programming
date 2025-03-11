package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * ���� 3��, ���� 5���� 2���� �迭�� integers15.txt�� �ִ� ���ڵ��� �ְ� ����ϰ�,
 * ���� 1��, ���� 10���� �迭�� 0 �̻� 10 �̸� ���� ������ ä��� ����ϸ�,
 * ���� 2��, ���� 3���� 2���� �迭�� 0 �̻� 5 �̸��� ���� ������ ä��� ����ϴ� ���α׷�.
 * @author ����ȣ
 */
public class ArrayUtil {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("integers15.txt"));
		int rows, cols;
		
		
		// P1 - 1
		rows = 3;
		cols = 5;
		int[][] fileInputArray = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				fileInputArray[i][j] = input.nextInt();
			}
		}
		printMatrix(fileInputArray, rows, cols);
		
		
		System.out.println("");
		
		
		//P1 - 2
		rows = 1;
		cols = 10;
		int[][] randomArray = new int[rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				randomArray[i][j] = (int)(Math.random() * 10);
			}
		}
		printMatrix(randomArray, rows, cols);
		
		System.out.println("");
		
		
		//P2
		rows = 2;
		cols = 3;
		int[][] r = new int[rows][cols];
		fillMatrixRandom(r, rows, cols, 5);
		printMatrix(r, rows, cols);
		
	}
	
	
	/**
	 * �־��� �迭�� �־��� ����ŭ �����.
	 * �迭�� ���� ��� ������� �ʰ�, ���ҵ� �� �� �� �Ϻθ��� ����� �� ����.
	 * �������� : n <= array.length
	 * @param array ����� �迭�� ����Ű�� ��������.
	 * @param n �迭�� ���Ҹ� �� �� ����� ���ΰ�?
	 */
	public static void printArray(int[] array, int n) {
		int i;
		for(i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
			if(i == (array.length - 1)) {
				System.out.println("");
			}
		}
	}
	
	
	/**
	 * �־��� ������ �迭�� ���Ҹ� ���ʷ� �����.
	 * @param array ����� �迭�� ����Ű�� ��������
	 * @param rows ����� �迭�� �� ��
	 * @param cols ����� �迭�� �� ��
	 */
	public static void printMatrix(int[][] array, int rows, int cols) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println("");
		}
	}
	
	
	/**
	 * ������ �迭�� 0�̻��̰� �Ķ���ͷ� �־��� ���� �̸��� ���� ������ ä����.
	 * @param array ���� ������ ä�� �迭�� ����Ű�� ��������
	 * @param rows ���� ������ ä�� �迭�� �� ��
	 * @param cols ���� ������ ä�� �迭�� �� ��
	 * @param num ������ ������ �����ִ� ��
	 * @return ���� ������ ä�� �迭
	 */
	public static int[][] fillMatrixRandom(int[][] array, int rows, int cols, int num) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				array[i][j] = (int)(Math.random() * num);
			}
		}
		return array;
	}
	

}
