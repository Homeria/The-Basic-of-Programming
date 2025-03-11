package week9;

/**
 * StringBuilder�� �̿��� �ð��� String�� ���ϴ� ����� �ð��� ���ϴ� ���α׷�.
 * StringBuilder�� �̿��ϴ� ���� String�� ���ϴ� ��ĺ��� �ð��� ���� �ɸ���.
 * @author ����ȣ
 *
 */
public class StringBuilderTest {

	public static void main(String[] args) {
		
		long startTime, endTime;
		
		StringBuilder sb = new StringBuilder();
		String string = "";
		
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			sb.append("���� ");
		}
		String result = sb.toString();
		endTime = System.currentTimeMillis();
		System.out.println("stringBuilder �ð� = " + (endTime - startTime) + "ms");
		
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			string += "���� ";
		}
		endTime = System.currentTimeMillis();
		System.out.println("String ���ϱ� �ð� = " + (endTime - startTime) + "ms");
		
	}

	

}
