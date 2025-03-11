package week11;

import java.util.Scanner;


/**
 * ���³��� ���α׷�
 * ���� ������ �Է��ϰ�, �Է��� ������ŭ ���� ������ ����ϰ� 1�� �Է��Ͽ� �������� ������ ��
 * @author ����ȣ
 *
 */
public class MemoryGame {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[]  list;
		int listLength;
		
		
		System.out.print("�� ���� �������� ���ðڽ��ϱ�? ");
		listLength = input.nextInt();
		list = new int[listLength];
		ArrayUtil.fillRandomDistinct(list, 100);
		
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
		System.out.print("1�� �Է��ϸ� ���ڸ� ����ϴ�.");
		input.nextInt();
		for(int i = 0; i < 100; i++) {
			System.out.println();
		}
		
		System.out.println("� ���ڵ��� �־����� ���纸����.");
		System.out.println("�Է��� �������� ������ �Է��ϼ���.");
		
		int[] answerList = new int[listLength];
		for(int i = 0; i < listLength; i++) {
			answerList[i] = input.nextInt();
		}
		input.close();
		
		int correctNum = checkAnswers(list, answerList, listLength);
		System.out.println(correctNum + "�� ������ϴ�.");
		
		
		
	}
	
	
	/**
	 * ����ڰ� �Է��� �������� list�� �� ���� ��� �ִ��� �˾Ƴ�
	 * list���� �������� �� �� �ִ�.
	 * answer �迭���� ���� �Ϻκп��� ����ڰ� �Է��� ���� ��� ���� �� �ִ�.
	 * @param list ���� �ٸ� ������ ��� �ִ� �迭
	 * @param answer ����ڰ� �Է��� �������� ��� �ִ� �迭
	 * @param answerNumber answer�� ��� �ִ� ���� ����
	 * @return ����ڰ� �Է��� �������� list�� �� ���� ��� �ִ���
	 */
	public static int checkAnswers(int[] list, int[] answer, int answerNumber) {
		int correctAnswer = 0;
		for(int i = 0; i < answerNumber; i++) {
			if (Search.linearSearch(list, list.length, answer[i]) != -1) {
				correctAnswer += 1;
			}
		}
		
		return correctAnswer;
	}

}
