package week5;

/**
 * 1���� �־��� �ڿ��� ������ �ڿ������� ��� ���Ͽ� ����ϴ� ���α׷��Դϴ�.
 * ���� ���� �޼ҵ带 ���Ͽ� ����մϴ� 
 * @author ����ȣ
 *
 */

public class Summations {

	public static void main(String[] args) {
		int upto = 20;
		int sumResult;
		
		for(int i = 1; i <= upto; i++) { 
			sumResult = sum(i);
			System.out.printf("1���� %d������ �ڿ����� �� : %d\n", i, sumResult);
		}
	}

	
/**
 * �־��� �ڿ��� ������ �ڿ����� ���� ���Ͽ� ��ȯ�մϴ�.
 * @param upto � ������ ���� ���ΰ�?
 * @return upto ������ �ڿ����� ��
 */
	public static int sum(int upto) {
		int sum = 0;
		for (int i = 1; i <= upto; i++) {
			sum += i;
		}
		return sum;
		
	}

}
