import java.util.HashMap;

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
