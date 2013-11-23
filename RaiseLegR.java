import java.awt.Graphics;

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
public class RaiseLegR extends Action {

	public void action(Graphics g)
	{
		g.drawOval(150,50,20,20);//head
		g.drawLine(160,70,160,110);//body
		g.drawLine(155,75,165,75);//shouder
		g.drawLine(155,75,150,115);//lh
		//g.drawLine(165,75,170,115);//rh
		g.drawLine(165,75,178,115);//rh
		g.drawLine(155,110,165,110);//
		g.drawLine(155,110,155,160);//ll
		g.drawLine(165,110,165,80);//rl
	}
}
