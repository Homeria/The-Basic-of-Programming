package week10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * data3.txt�� data4.txt���� �����͸� ���� �Է¹޾� �迭�� �����ϰ�, �� �迭�� �����ϴ� ���α׷�
 * data3.txt�� data4.txt���� �����͸� ó�� �Է¹��� ���� �迭�� ũ�⸦ �Է¹ް�, ���Ŀ� �����͸� �Է¹���
 * @author ����ȣ
 */
public class ArrayReturn4 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input1 = new Scanner(new File("data3.txt"));
		Scanner input2 = new Scanner(new File("data4.txt"));
		
		int a1Len = input1.nextInt();
		int a2Len = input2.nextInt();
		int[] a1 = new int[a1Len];
		int[] a2 = new int[a2Len];
		int[] a3 = new int[a1Len + a2Len];
		
		
		//�迭 1
		System.out.print("�迭 1 : \t");
		for(int i = 0; i < a1.length; i++) {
			a1[i] = input1.nextInt();
			System.out.print("\t" + a1[i]);
		}
		System.out.println("");
		

		
		//�迭 2
		System.out.print("�迭 2 : \t");
		for(int i = 0; i < a2.length; i++) {
			a2[i] = input2.nextInt();
			System.out.print("\t" + a2[i]);
		}
		System.out.println("");
		
		
		//�迭 3
		System.out.print("����� �迭 : \t");
		a3 = catArrays(a1, a2);
		for(int i = 0; i < a3.length; i++) {
			System.out.print(a3[i] + "\t");
			
		}
	}
	
	
	
	/**
	 * �迭 a1�� a2�� ������ �� �迭�� ��ȯ�Ѵ�.
	 * ���� a1�� 1 2 3�� ��� �ְ� (a1�� ũ��� 3)
	 * a2�� 5 6�� ��� �ִٸ� (a2�� ũ��� 2)
	 * �� ���� ������ �� �迭���� 1 2 3 4 5�� ��� ������
	 * �� �迭�� ũ��� 5�̴�
	 * a1�� a2�� ������� �ʴ´�.
	 * @param a1 �迭
	 * @param a2 �迭
	 * @return a1�� a2�� ������ �� �迭 (��Ȯ����, �� �迭�� ����Ű�� ����)
	 */
	public static int[] catArrays(int[] a1, int[] a2) {
		int[] a3 = new int[a1.length + a2.length];
		for(int i = 0; i < a1.length; i++) {
			a3[i] = a1[i];
		}
		for(int i  = 0; i < a2.length; i++) {
			a3[a1.length + i] = a2[i];
		}
		return a3;
	}
	

}
