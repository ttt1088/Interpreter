import java.awt.Graphics;

import javax.swing.JPanel;

/*
 * �������� 2009-9-22
 *
 * TODO Ҫ���Ĵ����ɵ��ļ���ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */

/**
 * @author xxzxxz
 *
 * TODO Ҫ���Ĵ����ɵ�����ע�͵�ģ�壬��ת��
 * ���� �� ��ѡ�� �� Java �� ������ʽ �� ����ģ��
 */
public class Expression_word extends Expression {

	char a;
	public Expression_word(char a1,MyPanel p)
    {
		super(p);
		a=a1;
	}
	public void toDo(Context c)
    {
		p.a=c.lookup(a);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO �Զ����� catch ��
			e.printStackTrace();
		}
		
		p.repaint();
		
		
    
    }
	
}
