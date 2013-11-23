import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

/*
 * 创建日期 2009-9-12
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
public class MyPanel extends JPanel implements ActionListener{
	
	Action a;//
	Expression e;
	Timer t;
	Context context;
	public MyPanel()
	{
		JButton b=new JButton("dance");
		b.addActionListener(this);
		add(b);
		a=new RaiseHandL();
	    context=new Context();
		context.add('a',new RaiseHandR());
		context.add('b',new RaiseHandL());
		context.add('c',new RaiseLegR());
		context.add('d',new RaiseLegL());
		e=new Expressions(this);
		
		Expression e2=new Expression_word('b',this);Expression e1=new Expression_word('a',this);
		Expression e3=new Expression_word('b',this);Expression e4=new Expression_word('a',this);
		e.add(e1);e.add(e2);e.add(e3);e.add(e4);
		Expression e5=new Expression_word('b',this);Expression e6=new Expression_word('a',this);
		Expression e7=new Expression_word('b',this);Expression e8=new Expression_word('a',this);
		e.add(e5);e.add(e6);e.add(e7);e.add(e8);
		Expression e10=new Expression_word('d',this);Expression e9=new Expression_word('c',this);
		Expression e11=new Expression_word('d',this);Expression e12=new Expression_word('c',this);
		e.add(e9);e.add(e10);e.add(e11);e.add(e12);
		Expression e13=new Expression_word('d',this);Expression e14=new Expression_word('c',this);
		Expression e15=new Expression_word('d',this);Expression e16=new Expression_word('c',this);
		e.add(e13);e.add(e14);e.add(e15);e.add(e16);

		
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);		
		a.action(g);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO 自动生成方法存根
		t=new Timer();
		t.setP(this,e,context);
		t.start();
	}
	
}
