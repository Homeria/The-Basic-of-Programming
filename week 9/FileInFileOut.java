package week9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

/**
 * integers.txt ���Ͽ��� �����͸� �迭���·� �Է¹ް�, �Է¹��� ������ ������ ����� reversedIntegers.txt ���Ͽ� �����ϴ� ���α׷�.
 * ���� �� reversedIntegers.txt ������ ������ �ʴ´ٸ� ������Ʈ Ŭ�� �� F5���̳� ������Ʈ�� ������ Ŭ���Ͽ� Refresh�� Ŭ��.
 * @author ����ȣ
 */
public class FileInFileOut {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(new File("integers.txt"));
		PrintWriter output = new PrintWriter("reversedIntegrs.txt");
		int[] numbers = new int[10];
		
		for(int i = 0; i < 10; i++) {
			numbers[i] = input.nextInt();
		}
		
		for(int i = 9; i >= 0; i--) {
			output.print(numbers[i] + " ");
		}
		
		input.close();
		output.close();
		
		
	}

}
