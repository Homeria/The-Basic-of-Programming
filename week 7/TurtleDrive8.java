package week7;

/**
 * ����ڰ� �� ���� ����� �׸� ������ ���Ƿ� �����Ͽ� �׸��� �׸��� ���α׷�
 * @author ����ȣ
 */
public class TurtleDrive8 {

    public static void main(String[] args) {
    	
        // �����ڸ� �����Ͽ� �ź��� �ν��Ͻ��� �ϳ� �����Ѵ�.
        // (x, y)�� �ź����� �ʱ� ��ġ�̸� theta�� �ź��̰� �ʱ⿡ ���ϰ� �ִ� �����̴�.
        // ������ ���� �����̸� ��������0���̰� ���� 90���̴�.
        // ����� ���� �Ʒ� �𼭸� ��ǥ�� (0.0, 0.0), ������ �� �𼭸� ��ǥ�� (1.0, 1.0)�̴�.
        Turtle turtle  = new Turtle(0.5, 0.5, 0);	// (x, y, theta)
        
        final double SIZE = 0.2;		// �ٰ����� ���� ����
        final int N = 5;				// ���
        final int HOW_MANY = 30;		// �ٰ��� ����
        
        for (int i = 1; i <= HOW_MANY; i++ ) {
        	drawNgon(turtle, N, SIZE);
        	turtle.turnLeft(360 / HOW_MANY);
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
    	
    	final double STEP = size;	// �̵� �Ÿ�
        final int ANGLE = 360 / n;		// ȸ�� ����
        final int PAUSE = 100;		// �Ͻ� ���� �ð�. milisecond ����
    	
    	for (int i = 1; i <= n; i++) {
    		turtle.pause(PAUSE);
            turtle.goForward(STEP);
            turtle.turnLeft(ANGLE);
    	}
    	turtle.pause(PAUSE);
    	
    	
    	
    }


}
