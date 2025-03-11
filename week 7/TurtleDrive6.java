package week7;

/**
 * �� ���� �簢���� �׸��� ���α׷�
 * @author ����ȣ
 */
public class TurtleDrive6 {

    public static void main(String[] args) {
    	
        // �����ڸ� �����Ͽ� �ź��� �ν��Ͻ��� �ϳ� �����Ѵ�.
        // (x, y)�� �ź����� �ʱ� ��ġ�̸� theta�� �ź��̰� �ʱ⿡ ���ϰ� �ִ� �����̴�.
        // ������ ���� �����̸� ��������0���̰� ���� 90���̴�.
        // ����� ���� �Ʒ� �𼭸� ��ǥ�� (0.0, 0.0), ������ �� �𼭸� ��ǥ�� (1.0, 1.0)�̴�.
        Turtle turtle  = new Turtle(0.5, 0.5, 0);	// (x, y, theta)
        
        for (int i = 1; i <= 3; i++ ) {
        	drawNgon(turtle, 4, 0.2);
        	turtle.turnLeft(360 / 3);
        }

    }
    
    
    /**
     * �ź����� ���� ��ġ�� ���ٰ����� �׸�
     * �ź��̰� ���� �ٶ󺸰� �ִ� �������� �켱 �����Ͽ� �� ���� �׸���
     * �������� ���鼭 ������ ������ �׸�
     * @param turtle �ź���
     * @param n ����� �׸� ���ΰ�?
     * @param size �ٰ����� �� ����
     */
    public static void drawNgon(Turtle turtle, int n, double size) {
    	
        final int ANGLE = 360 / n;		// ȸ�� ����
        final int PAUSE = 1000;			// �Ͻ� ���� �ð�. milisecond ����
    	
    	for (int i = 1; i <= 4; i++) {
    		turtle.pause(PAUSE);
            turtle.goForward(size);
            turtle.turnLeft(ANGLE);
    	}
    	turtle.pause(PAUSE);
    	
    	
    }


}
