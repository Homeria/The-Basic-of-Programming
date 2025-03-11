package week10;

/**
 * ũ�Ⱑ 10�� int Ÿ�� �迭�� 0 �̻� 100 �̸� ���� ������ ä���, �迭�� �� ���Ҹ� ���ʷ� ����ϰ�,
 * �迭���� �ּڰ�, �ִ�, ����� ���Ͽ� ����ϴ� ���α׷�
 * @author ����ȣ
 *
 */
public class RandomStatistics {

	public static void main(String[] args) {
		final int SIZE = 10;
		final int MAX = 100;
		int[] array = new int[SIZE];
		wirteRandomNumbers(array, MAX);
		
		int min = min(array);
		int max = max(array);
		double average = average(array);
		System.out.println("���ҵ� �� �ּҰ� : " + min);
		System.out.println("���ҵ� �� �ִ� : " + max);
		System.out.println("���ҵ��� ��հ� : " + average);
		
	}
	
	/**
	 * 0 �̻� n �̸��� ���� ������ �߻����� �迭 a�� ���ʷ� ä���.
	 * @param a ������ ������ �迭
	 * @param n 0 �̻� n �̸� ���� �߻�
	 */
	public static void wirteRandomNumbers(int[] a, int n) {
		
		System.out.println(n + "���� ���� ���� ����");
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * n);
			System.out.println(a[i]);
		}
		System.out.println("");
		
		
	}
	
	
	/**
	 * �迭 a�� ���� �� �ּҰ��� ã�� ��ȯ�Ѵ�.
	 * @param a �迭�� ����Ű�� ��������
	 * @return �ּҰ�
	 */
	public static int min(int[] a) {
		int min = 100;
		for(int i = 0; i < a.length; i++) {
			if (a[i] <= min) {
				min = a[i];
			}
		}
		return min;
	}
	
	
	/**
	 * �迭 a�� ���� �� �ִ��� ã�� ��ȯ�Ѵ�.
	 * @param a �迭�� ����Ű�� ��������
	 * @return �ִ�
	 */
	public static int max(int[] a) {
		int max = 0;
		for(int i = 0; i < a.length; i++) {
			if (a[i] >= max) {
				max = a[i];
			}
		}
		return max;
	}
	
	
	/**
	 * �迭 a�� ���ҵ��� ��հ��� ��ȯ�Ѵ�.
	 * @param a �迭�� ����Ű�� ��������
	 * @return ��հ�
	 */
	public static double average(int[] a) {
		int sum = 0;
		double average;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		average = (double)sum / (double)a.length;
		return average;
	}
	
}
