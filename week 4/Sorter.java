package week4;

import java.util.Scanner;

/**
 * �� ���α׷��� �� ���� ������ �Է¹޾� ������������ �����Ͽ� ����ϴ� ���α׷��Դϴ�.
 * �� ���� ������ 3�� ���Ͽ� ������������ �����Ѵٴ� Ư¡�� �ֽ��ϴ�.
 * @author ����ȣ
 */

public class Sorter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("�� ���� ������ �Է��ϼ��� : ");
		int i = input.nextInt();
		int j = input.nextInt();
		int k = input.nextInt();
		int temp;
		input.close();
		
		if (i > j) {
			temp = i;
			i = j;
			j = temp;
		}
		
		if(i > k) {
			temp = i;
			i = k;
			k = temp;
		}
		
		if(j > k) {
			temp = j;
			j = k;
			k = temp;
		}
		
		System.out.printf("%d %d %d", i, j, k);
		
		
		
	}

}
