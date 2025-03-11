package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * data1.txt�� data2.txt���� �����͸� ���� �Է¹ް�, �迭�� ���Ұ��� ���ϴ� ���α׷�.
 * @author ����ȣ
 */
public class ArrayReturn3 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input1 = new Scanner(new File("data1.txt"));
		Scanner input2 = new Scanner(new File("data2.txt"));
		
		final int SIZE = 10;
		int[] a1 = new int[SIZE];
		int[] a2 = new int[SIZE];
		int[] a3 = new int[SIZE];
		
		//data1�� ���� a1 �迭�� ä��� ���
		System.out.print("�迭 1 : \t");
		for(int i = 0; i < a1.length; i++) {
			a1[i] = input1.nextInt();
			System.out.print("\t" + a1[i]);
		}
		System.out.println("");
		
		
		//data2�� ���� a2 �迭�� ä��� ���
		System.out.print("�迭 2 : \t");
		for(int i = 0; i < a2.length; i++) {
			a2[i] = input2.nextInt();
			System.out.print("\t" + a2[i]);
		}
		System.out.println("");
		
		
		//a3 �迭�� ���ϰ� ���
		System.out.print("�迭 �� : \t");
		a3 = addArrays(a1, a2);
		for(int i = 0; i < a3.length; i++) {
			System.out.print("\t" + a3[i]);
		}
		
	}
	
	/**
	 * �迭 a1�� a2�� ���Ѵ�.
	 * �������� : a1�� a2�� ũ��� ����
	 * a1, a2�� ũ�Ⱑ ���� �� �迭�� �����ϰ�
	 * �� �迭�� a1�� a2�� ���� ����� ������ ��
	 * �� �迭�� ����Ű�� ������ ��ȯ�Ѵ�.
	 * @param a1 �迭
	 * @param a2 �迭
	 * @return a1 + a2 ����� ������ �� �迭(��Ȯ����, �� �迭�� ����Ű�� ����)
	 */
	public static int[] addArrays(int[] a1, int[] a2) {
		int[] a3 = new int[a1.length];
		
		for(int i = 0; i < a3.length; i++) {
			a3[i] = a1[i] + a2[i];
		}
		return a3;
	}

}
