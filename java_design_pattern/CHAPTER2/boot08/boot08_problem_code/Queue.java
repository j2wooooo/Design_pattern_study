/* 102쪽, 이와 같은 설계는 어떤 문제점이 있는가? 개선된 설계로 구현하라. */

package java_design_pattern;

import java.util.LinkedList;

public class Queue<String> extends LinkedList<String>
{
	public boolean addQueue(String element)
	{
		return this.offer(element); // 큐에 element를 추가함
	}
	
	public String removeQueue()
	{
		return this.poll(); // 큐에서 가장 먼저 추가된 element를 삭제함
	}
	
	public String peekQueue()
	{
		return this.peek(); // 큐에서 가장 먼저 추가된 element를 반환하지만 큐에서 삭제하지는 않음
	}
}
