package week5;

/**
 * �־��� ������ �ڿ����� ���� ���ϴ� �����׷��Դϴ�.
 * ���� ���� �޼ҵ带 ���Ͽ� ����մϴ� 
 * @author ����ȣ
 *
 */

public class Summations2 {

	public static void main(String[] args) {
		int upto = 100;
		int sumResult;
		
		for(int i = 10; i <= upto - 10; i += 10) { 
			sumResult = sum(i, i + 10);
			System.out.printf("%d���� %d������ �ڿ����� �� : %d\n", i, i + 10, sumResult);
		}
	}

	
/**
 * �־��� ������ �ڿ����� ���� ���Ͽ� ��ȯ�մϴ�.
 * @param from ������ ���� ��
 * @param to ������ �� ��
 * @return �־��� ������ �ڿ����� ��
 */
	public static int sum(int from, int to) {
		int sumResult = 0;
		for(int i = from; i <= to; i++) {
			sumResult += i;
		}
		return sumResult;
		
	}

}
