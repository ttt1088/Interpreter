import javax.swing.JPanel;

/*
 * �������� 2009-9-15
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
public class Timer extends Thread {

	//public static Timer t=new Timer();
	JPanel p;
	Expression e;
	Context c;
	public void setP(MyPanel p,Expression e,Context c)
	{
		this.e=e;
		this.p=p;this.c=c;
	}
	public void run()
	{
		e.toDo(c);
		
	}
}
