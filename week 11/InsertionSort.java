package week11;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ ������? ");
		int num = input.nextInt();
		input.close();
		int[] array = ArrayUtil.makeRandomArray(num, num);
		
		System.out.print("�� �迭 : ");
		ArrayUtil.printArray(array, num);
		
		sort(array, num);
		System.out.print("���ĵ� �迭 : ");
		ArrayUtil.printArray(array, num);
		
	}
	
	
	/**
	 * x[0], x[1], ..., x[i-1]�� �̹� ������������ ���ĵǾ� �ִ� ���¿���
	 * x[i]�� �� ���� �ùٸ� ��ġ�� �����Ͽ�
	 * x[0], x[1], ..., [xi]�� ������������ ���ĵǵ��� �Ѵ�.
	 * �������� : x[0], x[1], ..., x[i-1]�� �̹� ������������ ���ĵǾ� �ִ�.
	 * 			i�� �迭 x�� ũ�⺸�� �۴�.
	 * @param x �迭
	 * @param i �ùٸ� ��ġ�� ã���� ������ �ε���
	 */
	public static void insert(int[] x, int i) {
		int temp = x[i];
		int j = i - 1;
		
		while((j >= 0) && temp < x[j]) {
			x[j + 1] = x[j];
			j -= 1;
		}
		x[j + 1] = temp;
	}
	
	
	/**
	 * �迭 x�� �����Ѵ�.
	 * x[0], x[1], ..., x[n-1]�� ���ĵ� ���·� �����.
	 * @param x �迭
	 * @param n ������ ������ ����
	 */
	public static void sort(int[] x, int n) {
		for(int i = 1; i < n; i++) {
			insert(x, i);
		}
	}

}
