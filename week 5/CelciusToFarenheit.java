package week5;

/**
 * ���� �µ��� ȭ�� �µ��� �ٲپ� ������ִ� ���α׷��Դϴ�.
 * ���� -40������ 100������ ȭ���� �ٲپ� ����մϴ�.
 * @author ����ȣ
 */
public class CelciusToFarenheit {
	
	public static void main(String[] args) {
		
		double c = -40;
		for(double i = c; i <= 100; i++) {
			convertAndPrint(i);
		}

	}
	

/**
 * ���� �µ��� ȭ�� �µ��� ��ȯ�ϰ� ��� ���
 * @param c �����µ�
 */
	public static void convertAndPrint(double c) {
		double f = c * 9.0 / 5.0 + 32.0;
		System.out.printf("C = %f --> %f\n", c, f);
	}

}
