import java.awt.Graphics;

import javax.swing.JPanel;

/*
 * 创建日期 2009-9-22
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
			// TODO 自动生成 catch 块
			e.printStackTrace();
		}
		
		p.repaint();
		
		
    
    }
	
}
