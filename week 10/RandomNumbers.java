package week10;

/**
 * 0 �̻� 10 �̸� ���� ���� 20���� �迭�� �����ϰ�, �迭�� ����ϴ� ���α׷�
 * @author ����ȣ
 */
public class RandomNumbers {

	public static void main(String[] args) {
		
		final int SIZE = 20;
		final int MAX = 10;
		int[] array = new int[SIZE];
		array = makeRandomArray(SIZE, MAX);
		
		System.out.println("0�̻� " + MAX + "�̸� ���� ����");
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
	
	
	/**
	 * max �̸��� ���� ������ n ũ�⸸ŭ�� �迭�� ä���, �迭�� ��ȯ��.
	 * @param n �迭�� ũ��
	 * @param max ���� ������ �ִ� ����
	 * @return 0 �̻� max �̸��� ���� ������ n�� ��� �迭
	 */
	public static int[] makeRandomArray(int n, int max) {
		int[] array = new int[n];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * max);
		}
		return array;
	}
	

}
