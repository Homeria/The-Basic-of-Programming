package week13;

import java.util.Scanner;

/**
 * �Էµ� ���ڿ����� "/"�� ���е� �ܾ �и��Ͽ� �ε����� �Բ� ����ϴ� ���α׷�
 * @author ����ȣ
 *
 */
public class Tokens {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String s = input.nextLine();
		String[] array = s.split("/");
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("[" + i + "] " + array[i]);
		}
		
		
		input.close();
		
	}

}
