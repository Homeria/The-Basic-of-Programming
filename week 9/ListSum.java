package week9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * integers.txt ���Ϸκ��� ���� 10���� �о� �迭�� ä�� �� ���� ������ ���� ���� ����ϴ� ���α׷�.
 * @author ����ȣ
 */
public class ListSum {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("integers.txt"));
		int[] numbers = new int[10];
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
			sum += numbers[i];
			System.out.println("�迭�� ù " + (i + 1) + "�� ������ �� : " + sum);
		}
		input.close();
		
		
	}

}
