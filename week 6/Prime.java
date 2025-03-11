package week6;

/**
 * �Ҽ��� ���ϴ� �� ���� ���
 * �� ������ 2���� �־��� �� �̸����� ��� �������� 0�ΰ��� ����� ����� ����
 * �Ǵٸ� �� ������ 2���� �־��� ���� �����ٱ��� �������� 0�ΰ��� ����� ����� ����
 * @author ����ȣ
 *
 */
public class Prime {

	public static void main(String[] args) {
		
		long n = 20;
		boolean isPrime1, isPrime2;
		
		for(int i = 2; i <= n; i++) {
			isPrime1 = isPrime1(i);
			isPrime2 = isPrime2(i);
			System.out.println("ù ��° ��� : " + i + "��(��) �Ҽ��̴� : " + isPrime1);
			System.out.println("�� ��° ��� : " + i + "��(��) �Ҽ��̴� : " + isPrime2);
		}
		
	}
	
	/**
	 * �־��� 2 �̻��� �ڿ����� �Ҽ��ΰ�?
	 * ù ��° ���.
	 * @param n �־��� �ڿ���(2 �̻��� �����̾�� �Ѵ�.)
	 * @return �Ҽ��̸� true, �׷��� ������ false.
	 */
	public static boolean isPrime1(long n) {
		boolean isPrime = true;
		for (long i = 2; i < n; i++) {
			if (n % i == 0) {
				isPrime  = false;
				break;
			}
		}
		return isPrime;
	}
	
	
	/**
	 * �־��� 2 �̻��� �ڿ����� �Ҽ��ΰ�?
	 * �� ��° ���.
	 * @param n �־��� �ڿ���(2 �̻��� �����̾�� �Ѵ�.)
	 * @return �Ҽ��̸� true, �׷��� ������ false.
	 */
	public static boolean isPrime2(long n) {
		boolean isPrime = true;;
		for (long i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				isPrime  = false;
				break;
			}
		}
		return isPrime;
	}

}
