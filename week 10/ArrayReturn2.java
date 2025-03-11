package week10;

/**
 * ��������(�����ε�)�� ���ø� �����ִ� ���α׷�
 * makeArray �޼ҵ�� �����ε� �Ǿ� ����
 * @author ����ȣ
 *
 */
public class ArrayReturn2 {

	public static void main(String[] args) {
		
		int[] array;
		
		//���� �迭�� ����Ű�� ���� ��ȯ
		array = makeArray();
		
		//�迭 ���
		ArrayUtil.printArray(array, 10);
		
		
		//�־��� ����ŭ ���� �迭�� ����� ���
		for(int i = 0; i <= 10; i++) {
			array = makeArray(i);
			ArrayUtil.printArray(array, i);
		}
		
	}
	
	
	/**
	 * ũ�Ⱑ 10�� int �迭�� ������ ��
	 * 0�� �濡�� 0 * 0��
	 * 1�� �濡�� 1 * 1��
	 * ...
	 * 9�� �濡�� 9 * 9�� �����ϰ�
	 * �迭�� ��ȯ�Ѵ�.
	 * �迭�� ��ȯ�Ѵٴ� ���� �迭�� ����Ű�� ������ ��ȯ�Ѵٴ� ���̴�.
	 * @return �迭�� ����Ű�� ����
	 */
	public static int[] makeArray() {
		final int SIZE = 10;
		int[] array = new int[SIZE];
		for(int i = 0; i < SIZE; i++) {
			array[i] = i * i;
		}
		return array;
	}
	
	
	/**
	 * ũ�Ⱑ 10�� int �迭�� ������ ��
	 * 0�� �濡�� 0 * 0��
	 * 1�� �濡�� 1 * 1��
	 * ...
	 * n-1���濡�� (n-1)*(n-1)�� �����ϰ�
	 * �迭�� ��ȯ�Ѵ�.
	 * �迭�� ��ȯ�Ѵٴ� ���� �迭�� ����Ű�� ������ ��ȯ�Ѵٴ� ���̴�.
	 * @param n ���� �迭�� ũ��
	 * @return �迭�� ����Ű�� ����
	 */
	public static int[] makeArray(int n) {
		final int SIZE = n;
		int[] array = new int[SIZE];
		for(int i = 0; i < SIZE; i++) {
			array[i] = i * i;
		}
		return array;
	}

}
