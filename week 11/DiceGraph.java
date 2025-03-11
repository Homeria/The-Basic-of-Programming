package week11;

/**
 * Dice ���α׷����� ���� �� ���� ���� ����� �׷����� �����ִ� ���α׷�.
 * �ֻ��� ����(NUM_DICE)�� ���� Ƚ��(TRIALS)�� ���� �� ���� �޶�����,
 * �׷����� ������ ��ü�� ����ϸ� ���� Ƚ���� ���� ���� �� �Ƿ��� ����� ������.
 * @author ����ȣ
 *
 */
public class DiceGraph {

	public static void main(String[] args) {
		
		final int NUM_DICE = 5;
		final int TRIALS = 10000;
		final int HEIGHT = 50;
		
		int[] occurence = new int[(NUM_DICE * 6) + 1];
		
		//castDice�Ͽ� ���� ������ ���ϱ�
		for(int i = NUM_DICE; i < TRIALS; i++) {
			occurence[Dice.castDice(NUM_DICE)] += 1;
		}
		
		// ���� �������� ���ڷ� ���
		for(int i = NUM_DICE; i < occurence.length; i++) {
			System.out.println(i + "��(��) ���� Ƚ�� : " + occurence[i]);
		}
		
		System.out.println("");
		
		// ���� �������� �׷����� ��Ÿ��.
		graph(occurence, HEIGHT, NUM_DICE);
	}
	
	
	/**
	 * �迭 occurence�� �׷����� �׸���
	 * �׷����� �� ���� '*'�� �μ��� �׸���.
	 * �� ���� �ϳ��� 1�� �ǹ��Ѵ�.
	 * ���� ��ȣ�� �濡�� ��� 0�� ��� �����Ƿ� �� ����� ���ڴ� �׸��� �ʴ´�.
	 * n���� ������ �� ��ȣ �̻��� �濡 �ִ� ���ڵ鸸 �׷����� �׸���.
	 * 
	 * @param occurence �迭
	 * @param n occurence�� ��� ����� �׸� ���ΰ�?
	 */
	public static void graph(int[] occurence, int n) {
		StringBuilder sb = new StringBuilder();
		String result;
		for(int i = n; i < occurence.length; i++) {
			for(int j = 0; j < occurence[i]; j++) {
				sb.append('*');
			}
			result = sb.toString();
			System.out.print(i + ":" + occurence[i] + "\t");
			System.out.println(result);
			sb.delete(0, sb.length());
		}
	}
	
	
	/**
	 * �迭 occurence�� �׷����� �׸���
	 * �׷����� �� ���� '*'�� �μ��� �׸���.
	 * �� ���� �ϳ��� �ܼ��� 1�� �ǹ��ϵ��� �ϸ�
	 * �迭�� ��� �ִ� ���ڵ��� ū ���� ��
	 * �� ���ڸ� �ʹ� ���� �׷��� �ϹǷ� (�׷����� �ʹ� Ŀ���Ƿ�)
	 * �迭�� ��� �ִ� ���ڰ� �󸶳� ū �������� ����
	 * �� ���� �ϳ��� �ǹ��ϴ� ũ�Ⱑ �����ǵ��� �Ѵ�.
	 * 
	 * height�� �迭�� ��� �ִ� ���ڵ� �� ���� ū ���� 
	 * �� ���� �� ���� ǥ�� �� �������� �������ش�.
	 * �迭�� ��� �ִ� �� �� ���� ū ���� 910�̰�
	 * height�� 50�̶��
	 * �� ���� �ϳ��� 910/50 = 18.2�� �ǹ��ϰ� �ȴ�.
	 * 
	 * ���� ��ȣ�� �濡�� ��� 0�� ��� �����Ƿ� �� ����� ���ڴ� �׸��� �ʴ´�.
	 * from���� ������ �� ��ȣ �̻��� �濡 �ִ� ���ڵ鸸 �׷����� �׸���.
	 * 
	 * @param occurence �迭
	 * @param height �׷����� �ִ� ����
	 * 					���� ū ���� �� ���� �� ���� �׸� ���ΰ��� ��Ÿ��
	 * @param from occurence�� ��� ����� �׸� ���ΰ�?
	 */
	public static void graph(int[] occurence, int height, int from) {
		StringBuilder sb = new StringBuilder();
		String result;
		double value;
		int max = 0;
		for(int i = 0; i < occurence.length; i++) {
			if (occurence[i] > max) {
				max = occurence[i];
			}
		}
		value = (double)max / height;
		
		for(int i = from; i < occurence.length; i++) {
			for(int j = 0; j < (int)(occurence[i] / value); j++) {
				sb.append('*');
			}
			result = sb.toString();
			System.out.print(i + ":" + occurence[i] + "\t");
			System.out.println(result  + "(" + sb.length() + ")");
			sb.delete(0, sb.length());
		}
	}
	
	
}