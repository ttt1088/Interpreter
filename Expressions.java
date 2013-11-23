import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

/*
 * 创建日期 2009-9-18
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
