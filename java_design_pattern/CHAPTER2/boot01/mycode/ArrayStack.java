/* [p.64] 코드 2-4 */
/* [p.89] 66쪽, 코드 2-4를 ArrayList 클래스를 이용하도록 변경하라. */

package java_design_pattern;
import java.util.ArrayList;
public class ArrayStack{
	
	// 첫 번째 방법
	// public int top;
	// public int[] itemArray;
	// public int stackSize;
	
	// 두 번째 방법
	// ArrayStack 클래스는 배열을 사용해 스택을 구현했다.
	// public 키워드를 붙여 StackClient 클래스에서 push 메서드나 pop 메서드를 사용하지 않고 직접 배열에 값을 저장할 수 있다.
	// 클래스간에 강한 결합이 발생한다.
	// 스택의 자료구조가 배열에서 ArrayList클래스로 인해 변경된다면, main 메서드 또한 변경해주어야 한다. 
	// public int top;
	// public ArrayList<Integer> itemArray;
	// public int stackSize;
	
	// 세 번째 방법
	// 스택의 예에서는 자료구조가 변경될 가능성이 크므로 자료구조의 형태와 관련이 있는
	// top, itemArray, stackSize 클래스를 다음과 같이 외부에서 접근하지 못하도록
	// private 키워드를 붙여 은닉한다.
	private int top;
	private ArrayList<Integer> itemArray;
	private int stackSize;
	
	public ArrayStack(int stackSize) {
		// itemArray = new int[stackSize];
		itemArray = new ArrayList<Integer>(stackSize);
		top = -1;
		this.stackSize = stackSize;
	}
	
	public boolean isEmpty() { // 스택이 비어 있는지 검사
		return (top == -1);
	}
	
	public boolean isFull() { // 스택이 꽉 차 있는지 검사
		return(top == this.stackSize - 1);
	}
	
	public void push(int item) { // 스택에 아이템 추가
		if(isFull())
		{
			System.out.println("Inserting fail! Array Stack is full!!");
		}
		else
		{
			// itemArray[++top] = item;
			top++;
			itemArray.add(item);
			System.out.println("Inserted Item : " + item);
		}
	}
	
	public int pop() // 스택의 톱에 있는 아이템 반환
	{
		if(isEmpty())
		{
			System.out.println("Deleting fail! Array Stack is empty!");
			return -1;
		}
		else
		{
			// itemArray[top--];
			top--;
			return itemArray.remove(top+1);
		}
	}
	
	public int peek()
	{
		if(isEmpty()) {
			System.out.println("Peeking fail! Array Stack is empty!");
			return -1;
		}
		else {
			// itemArray[top];
			return itemArray.get(top);
		}
	}
}
