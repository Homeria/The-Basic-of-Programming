package week9;

/**
 * ũ�Ⱑ 10�� int Ÿ�� �迭�� ���� �����, �� �迭�� 0 �̻� 10 �̸� ���� ������ ä�� ��
 * ������ �� �迭���� �� �迭�� ���� ���� �ְ� ����ϴ� ���α׷�.
 * @author ����ȣ
 */
public class ArrayAdd {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		int[] a = new int[SIZE];
		int[] b = new int[SIZE];
		int[] c = new int[SIZE];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 10);
		}
		
		
		for(int i = 0; i < a.length; i++) {
			b[i] = (int)(Math.random() * 10);
		}
		
		for(int i = 0; i < a.length; i++) {
			c[i] = a[i] + b[i];
		}
		
		printArray(a);
		printArray(b);
		printArray(c);
		
	}
	
	/**
	 * �־��� �迭�� ���ʷ� �����.
	 * @param array ����� �迭�� ����Ű�� ��������.
	 */
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println("");
	}

}
