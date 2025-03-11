package week7;

/**
 * �簢���� �� �� �׸��� �޼ҵ带 �����Ͽ�, �ʿ��� ������ �� �޼ҵ带 �ҷ��� �� �簢�� 4���� �׸��� ���α׷�
 * @author ����ȣ
 *
 */
public class TurtleDrive4 {

    public static void main(String[] args) {
    	
        // �����ڸ� �����Ͽ� �ź��� �ν��Ͻ��� �ϳ� �����Ѵ�.
        // (x, y)�� �ź����� �ʱ� ��ġ�̸� theta�� �ź��̰� �ʱ⿡ ���ϰ� �ִ� �����̴�.
        // ������ ���� �����̸� ��������0���̰� ���� 90���̴�.
        // ����� ���� �Ʒ� �𼭸� ��ǥ�� (0.0, 0.0), ������ �� �𼭸� ��ǥ�� (1.0, 1.0)�̴�.
        Turtle turtle  = new Turtle(0.1, 0.4, 0);	// (x, y, theta)
        
        for (int i = 1; i <= 4; i++ ) {
        	drawSquare(turtle);
        }

    }
    
    /**
     * �־��� Turtle�� �̿��Ͽ� �簢���� �׸�
     * @param turtle �簢���� �׸��� �̿��� �ź���
     */
    public static void drawSquare(Turtle turtle) {
    	
    	final double STEP = 0.2;	// �̵� �Ÿ�
        final int ANGLE = 90;		// ȸ�� ����
        final int PAUSE = 1000;		// �Ͻ� ���� �ð�. milisecond ����
    	
    	for (int i = 1; i <= 4; i++) {
    		turtle.pause(PAUSE);
            turtle.goForward(STEP);
            turtle.turnLeft(ANGLE);
    	}
    	turtle.pause(PAUSE);
    	turtle.goForward(STEP);
    	
    }


}
