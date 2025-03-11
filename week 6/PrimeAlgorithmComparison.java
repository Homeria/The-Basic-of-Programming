package week6;

/**
 * �Ҽ��� ���ϴ� �� ���� ����� ���� �������� ���� �ɸ��� �ð��� �����ִ� ���α׷�
 * @author ����ȣ
 *
 */
public class PrimeAlgorithmComparison {

	public static void main(String[] args) {
		
		long n = 3033333343L;
		boolean isPrime1, isPrime2;
		
		long startTime, endTime;
		
		startTime = System.currentTimeMillis();
		isPrime1 = isPrime1(n);
		endTime = System.currentTimeMillis();
		System.out.println("ù ��° ���, ��� �ð� : " + (endTime - startTime) + "ms");
		System.out.println(n + "�� �Ҽ��̴� : " + isPrime1);
		
		startTime = System.currentTimeMillis();
		isPrime2 = isPrime2(n);
		endTime = System.currentTimeMillis();
		System.out.println("�� ��° ���, ��� �ð� : " + (endTime - startTime) + "ms");
		System.out.println(n + "�� �Ҽ��̴� : " + isPrime2);
		
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
