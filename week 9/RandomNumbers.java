package week9;

/**
 * ũ�Ⱑ 20�� int Ÿ�� �迭�� 0�̻� 10�̸� ���� ������ ��� ä�� �� �� ���Ҹ� ���ʷ� ����ϴ� ���α׷�.
 * @author ����ȣ
 *
 */
public class RandomNumbers {

	public static void main(String[] args) {
		
		final int SIZE = 20;
		int[] a = new int[SIZE];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 10);
		}
		
		System.out.println("10���� ���� ���� ����");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}

	}

}