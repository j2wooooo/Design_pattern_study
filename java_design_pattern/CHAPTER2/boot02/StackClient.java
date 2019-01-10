/* [p.66] 90쪽, 코드 2-4가 다음과 같이 ArrayList 클래스를 이용할 경우 main 메서드를 작성하라. */

package java_design_pattern;

public class StackClient{
	public static void main(String[] args) {
		
		// StackClient 클래스는 스택의 구현 방식이 리스트로 변경되더라도 전혀 영향을 받지 않으며 변경할 필요가 없다.
		
		ArrayListStack st = new ArrayListStack(10);
		st.push(20);
		System.out.print(st.peek());
	}
}
