package week3;

import java.util.Scanner;

public class Decrease {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ������ �ϳ� �Է��Ͻÿ� : ");
		int number = input.nextInt();
		input.close();
		
		for(int i = number; i >= 0; i--) {
			System.out.print(i + " ");
			
		}
		
		
		
	}

}
