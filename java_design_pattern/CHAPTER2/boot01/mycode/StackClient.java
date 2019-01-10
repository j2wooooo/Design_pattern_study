/* [p.64] 코드 2-4 */
/* [p.66] 89쪽, 코드 2-4를 ArrayList 클래스를 이용하도록 변경하라. */

package java_design_pattern;

public class StackClient{
	public static void main(String[] args) {
		
		// 첫 번째 방법
		// ArrayStack st = new ArrayStack(10);
		// st.itemArray[++st.top] = 20;
		// System.out.print(st.itemArray[st.top]);
		
		// 두 번째 방법
		// 스택의 자료구조가 달라짐에 따라 main도 코드를 바꿔줘야 한다.
		// ArrayStack st = new ArrayStack(10);
		// st.itemArray.add(new Integer(20));
		// System.out.print(st.itemArray.get(st.itemArray.size()-1));
		
		// 세 번째 방법
		// ArrayStack 클래스의 public 키워드를 붙인 변수를 외부에서 접근하지 못하도록 private 키워드로 바꿔 은닉한다.
		// push, pop, peek 메서드의 연산으로만 스택을 사용할 수 있다.
		// 그러나 어떤 자료구조를 사용해 작업을 실행하는지는 알 수가 없다.
		// 스택과 이를 사용하는 코드의 결합이 낮아진다.
		
		ArrayStack st = new ArrayStack(10);
		st.push(20);
		System.out.print(st.peek());
	}
}
