/* 102쪽, 이와 같은 설계는 어떤 문제점이 있는가? 개선된 설계로 구현하라. */

/* 큐가 만족해야 하는 기본 특성은 FIFO이다. 그러나 LinkedList 클래스는 이와 같은 큐의 불변성을 해칠 수 있는 많은 연산을 제공한다.
 * 가령 add(int index, E element) 연산은 리스트의 특정 위치에 element 인자를 삽입할 수 있는데, 이는 아주 쉽게 큐의 FIFO 특성을 만족하지 못하게 할 수 있다.
 * 이 문제를 해결하려면 위임을 이용해 LinkedList 클래스에서 큐에 필요한 연산만 재사용해야한다.
 */

package java_design_pattern;

import java.util.LinkedList;

public class Queue<String>
{
	private LinkedList<String> q = new LinkedList<String>();
	public boolean addQueue(String element)
	{
		return q.offer(element); // 큐에 element를 추가함
	}
	
	public String removeQueue()
	{
		return q.poll(); // 큐에서 가장 먼저 추가된 element를 삭제함
	}
	
	public String peekQueue()
	{
		return q.peek(); // 큐에서 가장 먼저 추가된 element를 반환하지만 큐에서 삭제하지는 않음
	}
}
