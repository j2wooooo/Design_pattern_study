/* 올바르게 수정된 코드 2-10 */
/* [p.72] 코드 2-10을 이용해 만든 스택이 스택의 무결성 조건에 위배되도록 main 메서드를 작성하라. */

package java_design_pattern;

import java.util.ArrayList;

class MyStack<String>{
	private ArrayList<String> arList = new ArrayList<String>();
	
	public void push(String element)
	{
		arList.add(element);
	}
	
	public String pop()
	{
		return arList.remove(arList.size() - 1);
	}
	
	public boolean isEmpty()
	{
		return arList.isEmpty();
	}
	
	public int size()
	{
		return arList.size();
	}
}
