package week3;

public class ThreeMultiples {

	public static void main(String[] args) {
		System.out.println("i�� 1�� ������Ű�鼭 i�� 3�� ����� ���� ���ϴ� ������� ���");
		int sum  = 0;
		
		for(int i = 1; i <= 100; i++) {
			if ((i % 3) == 0) {
				sum += i;
			}
		}
		System.out.println("1�̻� 100 ���� 3�� ������� �� = " + sum);
		
		sum = 0;
		
		System.out.println("i�� 3�� ������Ű�鼭 i�� ���ϴ� ������� ���");
		
		for(int i = 3; i <= 100; i += 3) {
			sum += i;
		}
		System.out.println("1 �̻� 100 ���� 3�� ������� �� = " + sum);
		
	}

}
