/* [p.92] Vector 클래스를 사용(위임)해 Stack 클래스를 구현하라. */

package java_design_pattern;

import java.util.Vector;

public class VectorStack{
	private Vector<String> v = new Vector<String>();
	
	public void push(String element)
	{
		v.add(element);
	}
	
	public String pop()
	{
		return v.remove(v.size() - 1);
	}
	
	public boolean isEmpty()
	{
		return v.isEmpty();
	}
	
	public int size()
	{
		return v.size();
	}
}
