package week7;

/**
 * ���ڿ��� ���õ� �޼ҵ带 ����ϴ� ���α׷�
 * length(���ڿ��� ����), concat(�ٸ� ���ڿ��� ����), substring(���� �κ� ���ڿ� ����)
 * indexOf(���ڿ��� ��ġ), charAt(���� ��ġ�� ���ڿ� ����), replace(���ڿ� ��ü)�� ����Ѵ�.
 * @author ����ȣ
 *
 */
public class StringTest {

	public static void main(String[] args) {
		
		String p = new String("�츮 ���� ���� �ʾƿ�!");
		int s1, s4;
		String s2, s3, s6;
		char s5;
		
		s1 = p.length();
		s2 = p.concat(" ���ϴ�ϴ�!");
		s3 = s2.substring(0, 8);
		s4 = s2.indexOf('��');
		s5 = s2.charAt(7);
		s6 = s2.replace("���� �ʾ�", "����");
		
		System.out.println("���� ���ڿ� : " + p);
		System.out.println("���ڿ��� ���� = " + s1);
		System.out.println("�ٸ� ���ڿ��� ����� �� ���ڿ�(concat) : " + s2);
		System.out.println("0�� ��ġ �̻�, 8�� ��ġ �̸� �κ� ���ڿ�(substring) : " + s3);
		System.out.println("\"��\"�� " + s4 + "��° ��ġ�� �ֽ��ϴ�.(indexOf)");
		System.out.println("7�� ��ġ ���� : " + s5);
		System.out.println("\"���� �ʾ�\"�� \"����\"�� ��ü�� �� ���ڿ�(replace) : " + s6);
		
		
		
		
	}

}
