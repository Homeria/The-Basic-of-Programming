public class SphereVolume {
	public static void main(String[] args) {
		double pi = 3.14;						//������
		double radius = 5.0;						//������
		double volume = 4.0 / 3.0 * pi * radius * radius * radius;		//����
		System.out.println("���� ���Ǵ� " + volume + "�Դϴ�.");
		System.out.printf("���� ���Ǵ� %.2f�Դϴ�.", volume); //���������ڸ� �̿��Ͽ� �Ҽ��� �Ʒ� ���ڸ����� ���
	}

}