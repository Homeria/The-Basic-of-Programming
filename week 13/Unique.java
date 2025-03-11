package week13;

import java.util.Scanner;

/**
 * �ܾ �Է� �޾� �ߺ��� �����ϰ� ������ �ܾ���� �� �ٿ� �� �ܾ ����ϴ� ���α׷�
 * @author ����ȣ
 *
 */
public class Unique {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("�Է� : ");
		String[] array = input.nextLine().split(" ");
		String[] distinctArray = new String[array.length];
		
		int num = 0;
		for(int i = 0; i < array.length; i++) {
			if (linearSearch(distinctArray, (num + 1), array[i]) == -1) {
				distinctArray[num] = array[i];
				num++;
			}
		}
		
		System.out.println("��� : ");
		for(int i = 0; i < distinctArray.length; i++) {
			if(distinctArray[i] != null) {
				System.out.print(distinctArray[i] + "\n");
			}
		}
		input.close();
	}
	
	
	/**
	 * ���ڿ� �迭 ���� �ڽ��� ã���� �ϴ� �ܾ �ִ����� �˻��ϴ� �޼ҵ�
	 * �� �޼ҵ�� ����Ž�� �����.
	 * @param �迭
	 * @param ������ �˻縦 �� �������� ���� ����
	 * @param key ã���� �ϴ� �ܾ�
	 * @return key�� ������ �ܾ �ִٸ� 0 ��ȯ,
	 * 			key�� ������ �ܾ ���ٸ� -1 ��ȯ
	 */
	public static int linearSearch(String[] s, int n, String key) {
		for(int i = 0; i < n; i++) {
			if(s[i] != null) {
				if (s[i].equalsIgnoreCase(key)) {
					return 0;
				}
			}
		}
		return -1;
	}
	
}
