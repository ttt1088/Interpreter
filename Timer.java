import javax.swing.JPanel;

/*
 * 创建日期 2009-9-15
 *
 * TODO 要更改此生成的文件的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
 */

/**
 * @author xxzxxz
 *
 * TODO 要更改此生成的类型注释的模板，请转至
 * 窗口 － 首选项 － Java － 代码样式 － 代码模板
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
