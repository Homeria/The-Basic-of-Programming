package week13;

import java.util.Scanner;

/**
 * �Է¹��� ���ڵ��� ���� ������ �׾� ����ϴ� ���α׷�
 * "*"�� �ִ� ��� ���� ���� ��("*"�� ���� �� ���ÿ� �� ���� �ִ� ��)�� �����ϰ� "*"�� ���� �ܾ ���� ������ ����.
 * �ִ� 1000���� ���ڸ� �Է��� �� ����.
 * @author ����ȣ
 *
 */
public class MyStack {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("�Է� : ");
		String s = input.nextLine();
		input.close();
		String[] array = s.split(" ");
		String[] myStack = new String[1000];
		int top = -1;

		for(int i = 0; i < array.length; i++) {
			
			if(array[i].equals("*")) {
				if(i != 0) {
					top--;
				}
			} else {
				myStack[++top] = array[i];
			}
		}
		
		System.out.print("��� : ");
		while(top >= 0) {
			System.out.print(myStack[top--] + " ");
		}
		
	}

}
