package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *integers15.txt���� �����͸� �Է¹޾� 2���� �迭(���)�� ������ ����, ������ ����� ��ġ����� ���ϴ� ���α׷�.
 * @author ����ȣ
 */
public class MatrixTranspose  {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("integers15.txt"));
		
		
		int rows = 3;
		int cols = 5;
		int[][] array = new int[rows][cols];
		
		//���� ��� ������ ���
		System.out.println("������ ���");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				array[i][j] = input.nextInt();
			}
		}
		ArrayUtil.printMatrix(array, rows, cols);
		System.out.println("");
		
		
		//��ġ��� ������ ���
		System.out.println("��ġ���");
		int[][] transposedArray = transpose(array, rows, cols);
		ArrayUtil.printMatrix(transposedArray, cols, rows);
	}
	
	
	/**
	 * �־��� ����� ��ġ����� ����
	 * @param originalArray ��ġ����� ���� ���� ���(�迭)
	 * @param rows ��
	 * @param cols ��
	 * @return �־��� ����� ��ġ���
	 */
	public static int[][] transpose(int[][] originalArray, int rows, int cols) {
		int[][] array = new int[cols][rows];
		
		for(int i = 0; i < cols; i++) {
			for(int j = 0; j < rows; j++) {
				array[i][j] = originalArray[j][i];
			}
		}
		return array;
	}
	

}
