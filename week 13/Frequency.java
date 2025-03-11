package week13;

import java.util.Scanner;

/**
 * �־��� ���ڿ��� ������ ������ �� ���� �󵵰� ���� �����ڸ� ����ϴ� ���α׷�
 * �빮�ڿ� �ҹ��ڴ� ���� �ٸ� ���ڷ� ����
 * �󵵰� ���� ���� ���ڰ� ���� ���� ��� �� �� �ƽ�Ű�ڵ� ��ȣ�� ���� ���� ���� ���
 * �ڵ� ��ȣ : �ҹ��� > �빮��
 * @author ����ȣ
 *
 */
public class Frequency {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		String string = input.next();
		int[] counter = new int[256];

		
		for(int i = 0; i < string.length(); i++) {
			counter[string.charAt(i)]++;
		}
		
		int index = 0;
		int max = 0;
		for(int i = 0; i < counter.length; i++) {
			if (counter[i] > max) {
				max = counter[i];
				index = i;
			}
		}
		
		System.out.print("��� : ");
		System.out.println((char)index);
		input.close();
		
	}

}
