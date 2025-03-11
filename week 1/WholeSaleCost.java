public class WholeSaleCost {
	public static void main(String[] args) {
		double coverPrice = 24.95;				//å ����
		double discountRate = 0.4;				//������ 40%
		double initialShippingCost = 3.0;			//ó�� �� �� ��۷�
		double additionalShippingCost = 0.75;			//�߰� ��۷�
		int quantity = 60;					//�ֹ��� ��
		
		//å��
		double bookCost = coverPrice * (1.0 - discountRate) * quantity;

		//��۷�
		double shippingCost = initialShippingCost + (quantity - 1) * additionalShippingCost;

		//�� ����
		double totalCost = bookCost + shippingCost;

		//���
		System.out.println("�� ���� ������ " + totalCost + "�Դϴ�.");
		System.out.printf("�� ���� ������ %.2f�Դϴ�." , totalCost);	//���������ڸ� �̿��Ͽ� �Ҽ��� �Ʒ� �� �ڸ����� ���
	}

}