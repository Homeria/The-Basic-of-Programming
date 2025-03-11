package week11;

/**
 * ������ ä���� �� ���� �迭�� �����԰� �������� ���ϴ� ���α׷�
 * @author ����ȣ
 *
 */
public class UnionIntersection {

	public static void main(String[] args) {
		
		final int ALENGTH = 10;
		final int BLENGTH = 10;
		final int MAX = 20;
		
		int[] a = new int[ALENGTH];
		int[] b = new int [BLENGTH];
		
		int[] union = new int[ALENGTH + BLENGTH];
		int unionSize;
		
		int[] intersection;
		
		intersection = new int[ALENGTH];
		int intersectionSize;
		
		ArrayUtil.fillRandomDistinct(a,  MAX);
		System.out.print("�迭 1 : ");
		ArrayUtil.printArray(a, a.length);
		if(!ArrayUtil.distinct(a,  a.length)) {
			System.out.println("��? �迭�� �ߺ��� ���Ұ� �ֳ�!");
		}
		
		ArrayUtil.fillRandomDistinct(b,  MAX);
		System.out.print("�迭 2 : ");
		ArrayUtil.printArray(b, b.length);
		if(!ArrayUtil.distinct(a,  a.length)) {
			System.out.println("��? �迭�� �ߺ��� ���Ұ� �ֳ�!");
		}
		
		unionSize = unionArrays(a, b, union);
		System.out.print("Union : ");
		ArrayUtil.printArray(union, unionSize);
		if(!ArrayUtil.distinct(union,  unionSize)) {
			System.out.println("��? �迭�� �ߺ��� ���Ұ� �ֳ�!");
		}
		
		intersectionSize = intersectionArrays(a, b, intersection);
		System.out.print("Intersection : ");
		ArrayUtil.printArray(intersection, intersectionSize);
		if(!ArrayUtil.distinct(intersection, intersectionSize)) {
			System.out.println("��? �迭�� �ߺ��� ���Ұ� �ֳ�!");
		}
			
		
		
	}
	
	
	/**
	 * �迭 a�� ��ʼҵ�� �迭 b�� ���ҵ��� �������� �迭 union�� �ְ� �������� ������ ���� ��ȯ
	 * �������� : union.length >= a.length + b.length
	 * @param a �迭
	 * @param b �迭
	 * @param union a, b�� ������
	 * @return �������� ������ ����
	 */
	public static int unionArrays(int[] a, int[] b, int[] union) {
		int unionSize = 0;
		// a �迭�� ���Ҹ� ��� union �迭�� �ֱ�
		for(int i = 0; i < a.length; i++) {
			union[i] = a[i];
			unionSize += 1;
		}
		// b �迭�� ���� �� a �迭�� ���� �����̰�, union �迭�� ���� ���Ҹ��� union �迭�� �ֱ�
		for(int i = a.length; i < a.length + b.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if ((Search.linearSearch(a, a.length, b[j]) == -1) && (Search.linearSearch(union, i, b[j]) == -1)) {
					union[i] = b[j];
					unionSize += 1;
					break;
				}
			}
		}
		return unionSize;
	}
	
	
	/**
	 * �迭 a�� ���ҵ�� �迭 b�� ���ҵ��� �������� �迭 intersection�� �ְ� �������� ������ ���� ��ȯ
	 * �������� : intersection.length >= min(a.length, b.length)
	 * @param a �迭
	 * @param b �迭
	 * @param union a, b�� ������
	 * @return �������� ������ ����
	 */
	public static int intersectionArrays(int[] a, int[] b, int[] intersection) {
		int intersectionSize = 0;
		// b �迭�� ���� �� a �迭�� �ִ� �����̰�, intersection �迭�� ���� ���Ҹ��� intersection �迭�� �ֱ�
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if((Search.linearSearch(a, a.length, b[j]) != -1) && (Search.linearSearch(intersection, i, b[j]) == -1)) {
					intersection[i] = b[j];
					intersectionSize += 1;
					break;
				}
			}
		}
		return intersectionSize;
	}
	
	

}
