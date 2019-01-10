/* 코드 2-10 */
/* [p.72] 코드 2-10을 이용해 만든 스택이 스택의 무결성 조건에 위배되도록 main 메서드를 작성하라. */

package java_design_pattern;

import java.util.ArrayList;

class MyStack<String> extends ArrayList<String>{
	public void push(String element)
	{
		add(element);
	}
	
	public String pop()
	{
		return remove(size() - 1);
	}
}
