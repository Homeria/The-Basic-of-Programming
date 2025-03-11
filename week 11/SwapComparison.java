package week11;


/**
 * �迭�� ������ �ٲ��ִ� �޼ҵ尡 �����ε� �Ǿ� �ְ�,
 * �����ε��� �޼ҵ带 ���� ������� ���� ���̸� �����ִ� ���α׷�.
 */
public class SwapComparison {
	
	/**
	 * x, y ���� ���� �ٲ��ش�.
	 * @param x ���� �Լ��� ���Ҹ� ���� ����
	 * @param y ���� �Լ��� ���Ҹ� ���� ����
	 */
	public static void swap(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
	}

	/**
	 * �迭�� �� ���� ���� ���� �ٲ۴�.
	 * a[i] <-- > a[j]
	 * @param a �迭.
	 * @param i ���� �ٲ� �� ��ȣ.
	 * @param j ���� �ٲ� �� ��ȣ.
	 */
	public static void swap(int[] a, int i, int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		
		int[] anArray = {10, 20};
		
		// swap(int x, int y) �޼ҵ带 �����.
		// ���⿡���� �־��� �迭�� ���Ҹ� �Ķ���ͷ� �����Ͽ� �־��� ������ ���� �Լ��� �迭�� ������ ��ȭ ����
		swap(anArray[0], anArray[1]);
		System.out.println("anArray[0]="+anArray[0]+",anArray[1]="+anArray[1]);
		
		// swamp(int[] a, int i, int j) �޼ҵ带 �����.
		// ���⿡���� �־��� �迭�� ������ ��ġ�� ����Ű�� �迭�� �ּҸ� �־��� ������ �迭�� ������ �ٲ�� ��.
		swap(anArray, 0, 1);
		System.out.println("anArray[0]="+anArray[0]+",anArray[1]="+anArray[1]);
		
	}
}



