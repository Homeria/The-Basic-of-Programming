package week9;

/**
 * 10���� ������ ���ʷ� �о� �迭�� ������ �� �Է��� ������ �������� ����ϴ� ���α׷�
 * @author ����ȣ
 */
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[10];
		
		System.out.println("���� 10���� ���ʷ� �Է��Ͻÿ� : ");
		
		for (int i = 0; i < 10; i++) {
			num[i] = input.nextInt();
		}
		
		System.out.println("�迭�� �������� ��� : ");
		for (int i = 9; i >= 0; i--) {
			System.out.print(num[i] + " ");
		}
		
		input.close();
	
		
		
	}

}
