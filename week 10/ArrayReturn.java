package week10;

/**
 * �迭�� return�� ���õ� ���α׷�
 * ũ�Ⱑ 10�� int �迭�� �����ϰ�, ArrayUtil�� �ִ� printArray �޼ҵ带 ����Ͽ� �迭�� �����
 * @author ����ȣ
 */
public class ArrayReturn {

	public static void main(String[] args) {
		
		int[] array;
		
		//���� �迭�� ����Ű�� ���� ��ȯ
		array = makeArray();
		
		//�迭 ���
		ArrayUtil.printArray(array, 10);
		
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

}
