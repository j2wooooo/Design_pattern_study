/* [p.66] 89쪽, 코드 2-4를 ArrayList 클래스를 이용하도록 변경하라.  */

package java_design_pattern;
import java.util.ArrayList;

public class ArrayListStack{

	public int stackSize;
	public ArrayList<Integer> items; // 자료구조가 배열에서 ArrayList로 변경됨
	
	public ArrayListStack(int stackSize) {
		items = new ArrayList<Integer>(stackSize);
		this.stackSize = stackSize;
	}
	
	public boolean isEmpty() { // 스택이 비어 있는지 검사
		return items.isEmpty();
	}
	
	public boolean isFull() { // 스택이 꽉 차 있는지 검사
		return(items.size() >= this.stackSize);
	}
	
	public void push(int item) { // 스택에 아이템 추가
		if(isFull())
		{
			System.out.println("Inserting fail!");
		}
		else
		{
			items.add(new Integer(item));
			System.out.println("Inserted Item : " + item);
		}
	}
	
	public int pop() // 스택의 톱에 있는 아이템 반환
	{
		if(isEmpty())
		{
			System.out.println("Deleting fail!");
			return -1;
		}
		else
		{
			return items.remove(items.size()-1);
		}
	}
	
	public int peek()
	{
		if(isEmpty()) {
			System.out.println("Peeking fail! Array Stack is empty!");
			return -1;
		}
		else {
			return items.get(items.size()-1);
		}
	}
}
