package week6;

import java.util.Scanner;

/**
 * 10������ 2������ ��ȯ�Ѵ�.
 * 10������ 1 �̻� �ڿ����̾�� �Ѵ�.
 */
public class Dec2Bin { 
    public static void main(String[] args) { 

    	System.out.print("�ڿ��� �ϳ��� �������� �Է��Ͻÿ�: ");
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();

    	// power <-- 2�� �ŵ�������.
    	// n���� �۰ų� ���� 2�� �ŵ��������� �� ���� ū ���� ���Ͽ� power�� �����Ѵ�.
    	// n�� 10�̸� power�� 2^3=8 (2^3�� 2�� �������̶�� �ǹ�)
    	// n�� 8�̸� power�� 2^3=8
    	// n�� 22�̸� power�� 2^4=16
    	// n�� 1�̸� power�� 2^0=1
        int power = 1;
        while (power <= n/2) {
            power *= 2;
        }
  
        // 2�� �ŵ����������� n�� ��� �ִ��� �˻��Ѵ�.
        // ���� ū �ŵ����������� �����Ͽ� ���� ���� �ŵ��������� ���ʷ� �˻��Ѵ�.
        while (power > 0) {

            // power�� n�� ��� ���� ������ 0�� ����Ѵ�. 
            if (n < power) 
                System.out.print(0);

            // power�� n�� ��� ������ 1�� ����ϰ� n���� power�� ����.
            else {
                System.out.print(1);
                n -= power;
            }

            // �������� ���� 2�� �ŵ�������
            power /= 2;
        }

        System.out.println();
        input.close();
    }

}
