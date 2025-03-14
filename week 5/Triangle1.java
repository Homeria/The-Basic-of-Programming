package week5;

import java.util.Scanner;


/**
 * 본 프로그램은 자신이 원하는 크기로 직삼각형을 그려주는 프로그램입니다.
 * 직사각형에서 90도가 왼쪽 위에 위치해 있으며, 아래로 갈수록 좁아집니다.
 * @author 차경호
 *
 */
public class Triangle1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("삼각형을 그리는 프로그램입니다.");
		System.out.print("삼각형의 크기를 얼마로 할까요? ");
		int howMuch = input.nextInt();
		
		for (int i = howMuch; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print('*');
			}
			System.out.print("\n");
		}
		input.close();
	}

}
