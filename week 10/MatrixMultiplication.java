package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * matrix1.txt�� matrix2.txt���� ���� �����͸� ������ �迭 ���·� �Է¹ް�, �� ����� ���� ���ϴ� ���α׷� 
 * @author ����ȣ
 */
public class MatrixMultiplication {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input1 = new Scanner(new File("matrix1.txt"));
		Scanner input2 = new Scanner(new File("matrix2.txt"));
		
		int[][] array1 = new int[3][5];
		int[][] array2 = new int[5][3];
		int[][] array3 = new int[3][3];
		
		
		System.out.println("A ���");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 5; j++) {
				array1[i][j] = input1.nextInt();
				System.out.print(array1[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
		
		
		System.out.println("B ���");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				array2[i][j] = input2.nextInt();
				System.out.print(array2[i][j] + "\t");
			}
			System.out.println("");
		}
		System.out.println("");
		
		
		System.out.println("C = AB ���");
		array3 = multiply(array1, array1.length, array1[0].length, array2, array2[0].length);
		ArrayUtil.printMatrix(array3, 3, 3);
		
		
	}
	
	
	/**
	 * �־��� �� ���� ����� ������� ���Ѵ�W
	 * �������� : ù ����� �� ������ �� ��° ����� �� ������ ���ƾ� �Ѵ�.
	 * @param a ù ���
	 * @param m a ����� �� ����
	 * @param n a ����� �� ����
	 * @param b �� ���� ���
	 * @param p b ����� �� ����
	 * @param q b ����� �� ����
	 * @return �־��� �� ����� ���� ��Ÿ���� ���(�迭)
	 */
	public static int[][] multiply(int[][] a, int m, int n, int[][] b, int q) {
		//m = 3, n = 5, q = 3
		int[][] array = new int[m][q];
		
		for(int i = 0; i < m; i++) {
			Arrays.fill(array[i], 0);
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < q; j++) {
				for(int c = 0; c < n; c++) {
						array[i][j] += a[i][c] * b[c][j];
				}
			}
		}
		return array;
	}

}
