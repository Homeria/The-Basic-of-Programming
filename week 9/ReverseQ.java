package week9;

import java.util.Scanner;


/**
 * Ű����κ��� �������� ���ʷ� �Է¹޾� �迭�� ������ �� �������� ����ϴ� ���α׷�
 * 'q' Ȥ�� 'Q'�� �Է½�, �Է��� ����Ǹ�, �迭�� �������� ����ϰ� �Է��� �������� ��հ��� �˷���.
 * ������ �ִ� 100������ �Է��� �� ������, �ʰ��� ������ �߻���.
 * @author ����ȣ
 */
public class ReverseQ {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		boolean done = false;
		int value[] = new int[100];
		String stringValue;
		int sum = 0;
		int num = 0;
		
		System.out.println("�Է��� ��ġ���� \'q\', Ȥ�� \'Q\'�� �Է��Ͻÿ� : ");
		
		while(!done) {
			stringValue = input.next();
			
			if ((stringValue.equals("q")) || (stringValue.equals("Q"))) {
				done = true;
			} else {
				value[num] = Integer.parseInt(stringValue);
				sum += Integer.parseInt(stringValue);
				num++;
			}
		}
		
		System.out.println("�迭�� �������� ��� : ");
		for(int i = num-1; i >= 0; i--) {
			System.out.print(value[i] + "\t");
		}
		System.out.println("\n��հ� : " + ((double)sum / (double)num));
		
		input.close();
	}

}
