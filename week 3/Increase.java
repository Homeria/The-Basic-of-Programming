package week3;

import java.util.Scanner;

public class Increase {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ���� �ϳ� �Է��Ͻÿ� : ");
		int number = input.nextInt();
		input.close();
		int count = 0;
		
		System.out.println("ù��° ���");
		for(int i = 0; i <= number; i++) {
			System.out.print(i + "\t");
			if ((i % 10) == 9) {
				System.out.println("");
			}
		}
		
		System.out.println("");
		
		System.out.println("�ι�° ���");
		for(int i = 0; i <= number; i++) {
			System.out.print(i + "\t");
			count += 1;
			if (count == 10) {
				System.out.println("");
				count = 0;
			}
		}
	}

}
