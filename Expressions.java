import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

/*
 * �������� 2009-9-18
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
public class Expressions extends Expression {

	
	
	public Expressions(MyPanel p1) {
		super(p1);
		
	}
	public ArrayList expressions=new ArrayList();
	
	public void add(Expression c)
	{
		expressions.add(c);
	}
	public void toDo(Context c)
	{
		
		Iterator i=expressions.iterator();
		while(i.hasNext())
		{
			((Expression)(i.next())).toDo(c);
			
			
		}
		
	}
	
	
}
