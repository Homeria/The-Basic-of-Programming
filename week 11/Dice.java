package week11;


/**
 * �ֻ����� �� �� Ȥ�� ���� �� ���� ���� ���� ���� ������ ����ϴ� ���α׷�
 * �ֻ��� ����(NUM_DICE)�� ���� Ƚ��(TRIALS)�� ���� ���� �޶����� ��.
 * @author ����ȣ
 */
public class Dice {

	public static void main(String[] args) {
		
		final int NUM_DICE = 2;
		final int TRIALS = 10000;
		
		int[] occurence = new int[(NUM_DICE * 6) + 1];
		
		for(int i = NUM_DICE; i < TRIALS; i++) {
			occurence[castDice(NUM_DICE)] += 1;
		}
		
		for(int i = NUM_DICE; i < occurence.length; i++) {
			System.out.println(i + "��(��) ���� Ƚ�� : " + occurence[i]);
		}
	}
	
	
	/**
	 * �ֻ����� ������ŭ �ֻ����� ������, �ֻ������� ���� ������ ���� ���� ��ȯ��
	 * @param numDice �ֻ��� ����
	 * @return �ֻ������� ���� ������ �� ��
	 */
	public static int castDice(int numDice) {
		int sum = 0;
		for(int i = 0; i < numDice; i++) {
			sum += (int)(Math.random() * 6) + 1;
		}
		return sum;
	}

}
