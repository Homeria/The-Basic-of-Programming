package week9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * integers.txt ���Ͽ��� �����͸� �迭�� �Է¹ް�, �Է¹��� ������ �������� ����ϴ� ���α׷�
 * @author ����ȣ
 */
public class FileInput {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("integers.txt"));
		int[] numbers = new int[10];
		
		for(int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
		}
		
		System.out.println("�迭�� �������� ��� : ");
		for(int i = 9; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		
		input.close();
		
	}

}
