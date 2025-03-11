package week11;

/**
 * ���� ���ø����̼ǿ��� ���� ���̴� �迭 ���� �޼ҵ带 ��Ƴ��� ���α׷�
 * �� ���� �ִ� �޼ҵ� ���
 * fillRandom(�ߺ� ����Ͽ� �迭�� ������ ä����), distinct(�迭�� ���ҵ��� �ߺ� ���� �˻�),
 * fillRandomDistinct(�ߺ� ���� �迭�� ������ ä����), makeRandomArray(�ߺ� ����Ͽ� �迭�� ���� ä�� �� ä�� �迭 ��ȯ)
 * @author ����ȣ
 *
 */
public class ArrayUtil {

	public static void main(String[] args) {
		
		System.out.println("printArray �޼ҵ� �׽�Ʈ ----------");
		
		int[] a = new int[10];
		for(int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		 
		System.out.print("printArray(a, 0) : ");
		printArray(a, 0);
		
		System.out.print("printArray(a, 1) : ");
		printArray(a, 1);
		
		System.out.print("printArray(a, a.length) : ");
		printArray(a, a.length);
		
		System.out.print("printArray(a, a.length + 1) : ");
		printArray(a, a.length + 1);
		
		System.out.print("printArray(a, -1) : ");
		printArray(a, -1);
		
		System.out.println("");
		
		
		System.out.println("fillRandom �޼ҵ� �׽�Ʈ ----------");
		
		System.out.print("fillRandom(a, 10) : ");
		fillRandom(a, 10);
		printArray(a, 10);
		
		System.out.print("fillRandom(a, 100) : ");
		fillRandom(a, 100);
		printArray(a, 10);
		
		System.out.print("fillRandom(a, 2) : ");
		fillRandom(a, 2);
		printArray(a, 10);
		
		System.out.print("fillRandom(a, 1) : ");
		fillRandom(a, 1);
		printArray(a, 10);
		
		System.out.println("");
		
		
		System.out.println("distinct �޼ҵ� �׽�Ʈ ----------");
		
		int[] a2 = {1, 1, 2};
		System.out.println("a2 = {1, 1, 2}");
		System.out.println("distinct(a2, 1) : " + distinct(a2, 1));
		System.out.println("distinct(a2, 2) : " + distinct(a2, 2));
		System.out.println("distinct(a2, a2.length) : " + distinct(a2, a2.length));
		System.out.println("distinct(a2, a2.length + 1) : " + distinct(a2, a2.length + 1));
		System.out.println("distinct(a2, 0) : " + distinct(a2, 0));
		System.out.println("distinct(a2, -1) : " + distinct(a2, -1));
		
		int[] a3 = {1, 2, 3};
		System.out.println("a3 = {1, 2, 3}");
		System.out.println("distinct(a3, a3.length) : " + distinct(a3, a3.length));
		System.out.println("distinct(a3, a3.length + 1) : " + distinct(a3, a3.length + 1));
		
		int[] a4 = {1};
		System.out.println("a4 = {1}");
		System.out.println("distinct(a4, a4.length) : " + distinct(a4, a4.length));
		System.out.println("distinct(a4, a4.length + 1) : " + distinct(a4, a4.length + 1));
		
		int[] a5 = {};
		System.out.println("a5 = {}");
		System.out.println("distinct(a5, a5.length) : " + distinct(a5, a5.length));
		System.out.println("distinct(a5, a5.length + 1) : " + distinct(a5, a5.length + 1));
		
		System.out.println("");
		
		
		System.out.println("fillRandomDistinct �޼ҵ� �׽�Ʈ ----------");
		
		System.out.println("ũ�Ⱑ 10�� �迭 a");
		System.out.print("fillRandomDistinct(a, 10) : ");
		fillRandomDistinct(a, 10);
		printArray(a, a.length);
		System.out.println("distinct? : " + distinct(a, a.length));
		
		System.out.print("fillRandomDistinct(a, 100) : ");
		fillRandomDistinct(a, 100);
		printArray(a, a.length);
		System.out.println("distinct? : " + distinct(a, a.length));
		
		System.out.print("fillRandomDistinct(a, 1) : ");
		fillRandomDistinct(a, 1);
		printArray(a, a.length);
		System.out.println("distinct? : " + distinct(a, a.length));
		
		System.out.print("fillRandomDistinct(a, 0) : ");
		fillRandomDistinct(a, 0);
		printArray(a, a.length);
		System.out.println("distinct? : " + distinct(a, a.length));
		
		System.out.print("fillRandomDistinct(a, -1) : ");
		fillRandomDistinct(a, -1);
		printArray(a, a.length);
		System.out.println("distinct? : " + distinct(a, a.length));
		
		int[] a6 = new int[1];
		System.out.println("ũ�Ⱑ 1�� �迭 a6");
		System.out.print("fillRandomDistinct(a6, 1) : ");
		fillRandomDistinct(a6, 1);
		printArray(a6, a6.length);
		System.out.println("distinct? : " + distinct(a6, a6.length));
		
		int[] a7 = new int[0];
		System.out.println("ũ�Ⱑ 0�� �迭 a7");
		System.out.print("fillRandomDistinct(a7, 7) : ");
		fillRandomDistinct(a7, 7);
		printArray(a7, a7.length);
		System.out.println("distinct? : " + distinct(a7, a7.length));
		
		System.out.println("");
		
		
		System.out.println("makeRandomArray �޼ҵ� �׽�Ʈ ----------");
		
		System.out.print("makeRandomArray(10, 10) : ");
		printArray(makeRandomArray(10, 10), 10);
		
		System.out.print("makeRandomArray(10, 1) : ");
		printArray(makeRandomArray(10, 1), 10);
		
		System.out.print("makeRandomArray(1, 10) : ");
		printArray(makeRandomArray(1, 10), 1);
		
		System.out.print("makeRandomArray(1, 0) : ");
		printArray(makeRandomArray(1, 0), 1);
		
		System.out.print("makeRandomArray(0, 0) : ");
		printArray(makeRandomArray(0, 0), 1);
		
		System.out.print("makeRandomArray(-1, 0) : ");
		printArray(makeRandomArray(-1, 0), 1);
		
		
		
	}
	
	
	/**
	 * �迭�� �տ� �ִ� n���� ���ҵ��� ����ϰ� �������� new line�� ����Ѵ�.
	 * n > a.length �� ��쿡�� a.length ���� ���Ҹ� ����Ѵ�.
	 * n�� 0 ������ ��쿡�� �ƹ� �͵� ������� �ʴ´�.
	 * @param a �迭
	 * @param n ����� ������ ����
	 */
	public static void printArray(int[] a, int n) {
		if (n > a.length) {
			n = a.length;
		}
		for(int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}
	
	
	/**
	 * �迭 list�� 0 �̻� uBound (Upper Bound) �̸� ���� ������ ä���ش�. ������ �ߺ��� �� �ִ�.
	 * uBound�� 1 ������ ��쿡�� 0�� ä���.
	 * @param list ������ ä�� �迭
	 * @param uBound ������ �ִ밪 + 1
	 */
	public static void fillRandom(int[] list, int uBound) {
		for(int i = 0; i < list.length; i++) {
			if(uBound > 1) {
				list[i] = (int)(Math.random() * uBound);
			} else {
				list[i] = 0;
			}
			
		}
	}
	
	
	/**
	 * �迭�� �� n�� ��(0������ n-1��)�� ���ҵ��� ���� �ٸ��� �˻��Ѵ�.
	 * ���ҵ��� ���� �ٸ���?
	 * n > a.length �� ���� n == a.length �� ���� �Ȱ��� �۵��Ѵ�.
	 * @param a �迭
	 * @param n �迭�� �� � �濡 �ߺ� ���� �˻縦 �� ���ΰ�?
	 * @return true, �迭�� �� n�� ���ҵ��� ��� �ٸ� ���
	 * 			false, �迭�� �� n�� �濡 �ߺ��� ���Ұ� �ִ� ���
	 */
	public static boolean distinct(int[] a, int n) {
		if (n > a.length) {
			n = a.length;
		}
		int count = n - 1;
		while(count > 0) {
			if(Search.linearSearch(a, count, a[count]) != -1) {
				return false;
			} else {
				count -= 1;
			}
		}
		return true;
	}
	
	
	/**
	 * �迭 list�� 0 �̻� uBound �̸� "���� �ٸ�" ���� ������ ä���ش�.
	 * �� �޼ҵ带 ȣ���ϴ� �ڴ� �Ʒ� ���������� ���Ѿ� �Ѵ�.
	 * �������� : uBound >= list.length
	 * �� �޼ҵ带 ȣ���ϴ� �ڰ� �� ���������� ��Ű�� ������ �迭�� ������ ä���� �ʰ� ���� �޼����� ����ϰ� �����Ѵ�.
	 * @param list ������ ä�� �迭
	 * @param uBound ������ �ִ밪 + 1
	 */
	public static void fillRandomDistinct(int[] list, int uBound) {
		int n;
		int count = 0;
		if(uBound >= list.length) {
			while (count < list.length) {
				n = (int)(Math.random() * uBound);
				if(Search.linearSearch(list, count, n) == -1) {
					list[count] = n;
					count += 1;
				}
			}
		} else {
			System.out.println("uBound >= list.length�̾�� �մϴ�. �迭�� ������ ������ �ʾҽ��ϴ�.");
		}
	}
	
	
	
	/**
	 * 0 �̻� uBound �̸� ���� ������ n�� �߻����� �̵��� �迭�� ������ ��
	 * �迭�� ����Ű�� ���������� ��ȯ�Ѵ�.
	 * �迭���� ���� ���ڰ� �ߺ��� �� �ִ�.
	 * @param n ���� ����, �迭�� ũ�� (n�� �����̸� ���� �޼����� ����ϰ� null�� ��ȯ�Ѵ�.)
	 * @param uBound ������ �ִ밪 + 1
	 * @return
	 */
	public static int[] makeRandomArray(int n, int uBound) {
		if (n >= 0) {
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = (int)(Math.random() * uBound);
			}
			return a;
		} else {
			System.out.println("�迭�� ũ��� ������ �� �����ϴ�.");
			return null;
		}
	}

	
	
	
	
	
	

}
