package week5;

/**
 * ���� �µ��� ȭ�� �µ��� �ٲپ� ������ִ� ���α׷��Դϴ�.
 * ���� -40������ 100������ ȭ���� �ٲپ� ����մϴ�.
 * @author ����ȣ
 */
public class CelciusToFarenheit2 {
	
	public static void main(String[] args) {
		
		double c = -40;
		double farenheit;
		for(double i = c; i <= 100; i++) {
			farenheit = convert(i);
			System.out.printf("C = %f --> %f\n", i, farenheit);
		}

	}
	

/**
 * ���� �µ��� ȭ�� �µ��� ��ȯ�ϰ� ��� ���
 * @param c �����µ�
 * @return f ȭ���µ�
 */
	public static double convert(double c) {
		double f;
		f = c * 9.0 / 5.0 + 32.0;
		return f;
	}

}
