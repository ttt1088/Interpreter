import java.util.HashMap;

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
public class Context {
	HashMap actions=new HashMap();
	public void add(char a,Action action)
	{
		actions.put(new Character(a),action);
	}
	public Action lookup(char a)
	{
		return (Action)actions.get(new Character(a));
	}

}
