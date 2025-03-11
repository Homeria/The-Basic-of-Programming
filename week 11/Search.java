package week11;

/**
 * ����Ž��(Linear Search)�� ����Ž��(Binary Search) �޼ҵ尡 �ְ�, �� �޼ҵ���� �׽�Ʈ�ϴ� ���α׷�
 * @author ����ȣ
 *
 */
public class Search {

	public static void main(String[] args) {
		int[] a = {1, 2, 3, 2, 5};
		
		//linearSearch �׽�Ʈ
		
		System.out.println("linearSearch �׽�Ʈ ----------");
		
		System.out.print("�迭 a : ");
		ArrayUtil.printArray(a, a.length);
		
		
		System.out.println("linearSearch(a, a.length, 5) : " + linearSearch(a, a.length, 5));
		System.out.println("linearSearch(a, 1, 1) : " + linearSearch(a, 1, 1));
		System.out.println("linearSearch(a, 4, 5) : " + linearSearch(a, 4, 5));
		System.out.println("linearSearch(a, 1, 2) : " + linearSearch(a, 1, 2));
		System.out.println("linearSearch(a, a.length, 2) : " + linearSearch(a, a.length, 2));
		System.out.println("linearSearch(a, 0, 5) : " + linearSearch(a, 0, 5));
		System.out.println("linearSearch(a, a.length, 4) : " + linearSearch(a, a.length, 4));
		
		System.out.println("");
		System.out.println("binarySearch �׽�Ʈ ----------");
		System.out.print("InsertionSort.sort(a, a.length) : ");
		InsertionSort.sort(a, a.length);
		ArrayUtil.printArray(a, a.length);
		System.out.println("");
		System.out.println("binarySearch(a, a.length, 5) : " + binarySearch(a, a.length, 5));
		System.out.println("binarySearch(a, 1, 1) : " + binarySearch(a, 1, 1));
		System.out.println("binarySearch(a, 4, 5) : " + binarySearch(a, 4, 5));
		System.out.println("binarySearch(a, 1, 2) : " + binarySearch(a, 1, 2));
		System.out.println("binarySearch(a, a.length, 2) : " + binarySearch(a, a.length, 2));
		System.out.println("binarySearch(a, 0, 5) : " + binarySearch(a, 0, 5));
		System.out.println("binarySearch(a, a.length, 4) : " + binarySearch(a, a.length, 4));
		
	}
	
	
	/**
	 * ����Ž��(Linear Search) - �迭 x�� �� n���� �濡 key�� ��� �ִ°�?
	 * @param x �迭
	 * @param n x�� �� �� �� �濡�� key�� ã�� ���ΰ�?
	 * @param key ã�� ������
	 * @return key�� x�� �ִ� ���, key�� ��ġ (�ε���)�� ��ȯ.
	 * 			(key�� x���� ���� �� �ִ� ��쿡�� �� �� ���� ���� �ε����� ��ȯ.)
	 * 			key�� x�� ���� ���, -1�� ��ȯ.
	 */
	public static int linearSearch(int[] x, int n, int key) {
		for(int i = 0; i < n; i++) {
			if (x[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	
	/**
	 * ����Ž�� (binary search)
	 * �������� : �迭 x�� �̹� ������������ ���ĵǾ� �ִ�.
	 * �迭���� �����Ͱ� �� �� ���� ���� �� �ִ�.
	 * @param x ���ĵ� ���� �迭
	 * @param n x�� ��� �ִ� ������ ����
	 * @param key ã�� ������
	 * @return
	 * 		x ������ key�� ��ġ (�ε���), key�� x�� �ִ� ���
	 * 		(key�� x���� ���� �� �ִ� ��쿡�� �� �� ��� �ϳ��� �ε���)
	 * 		-1, key�� x�� ���� ���
	 */
	public static int binarySearch(int[] x, int n, int key) {
		int lo = 0;
		int hi = n - 1;
		int mid;
		
		while(hi >= lo) {
			mid = (hi + lo) / 2;
			if(key == x[mid]) {
				return mid;
			}
			if(key < x[mid]) {
				hi = mid - 1;
			} else {
				lo = mid + 1;
			}
		}
		return -1;
	}
	
}
