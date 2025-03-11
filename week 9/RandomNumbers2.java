package week9;

/**
 * ũ�Ⱑ 10�� int Ÿ�� �迭�� 0 �̻� 100 �̸� ���� ������ ä�� �ְ�
 * �� ���Ҹ� ����ϰ� ������ �ִ񰪰� �ּڰ�, ����� ���� ����ϴ� ���α׷�.
 * @author ����ȣ
 */
public class RandomNumbers2 {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		int[] a = new int[SIZE];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100);
		}
		
		System.out.println("100���� ���� ���� ����");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
		
		int max = 0;
		int min = 100;
		int sum = 0;
		for(int i = 0; i < SIZE; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
			sum += a[i];
		}
		
		System.out.println("���ҵ� �� �ּҰ� : " + min);
		System.out.println("���ҵ� �� �ִ� : " + max);
		System.out.println("���ҵ��� ��հ� : " + ((double)sum / (double)SIZE));
		
		
	}

}