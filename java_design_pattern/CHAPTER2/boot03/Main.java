/* [p.72] 코드 2-10을 이용해 만든 스택이 스택의 무결성 조건에 위배되도록 main 메서드를 작성하라. */

package java_design_pattern;

public class Main {

	public static void main(String[] args) {
	
		MyStack<String> st = new MyStack<String>();
		
		st.push("insang1");
		st.push("insang2");
		// 먼저 들어간 스택의 값을 바꾼다.
		st.set(0, "insang3"); // 허용되어서는 안됨
		System.out.println(st.pop());
		System.out.println(st.pop());
	}
}

/* 허용하지 않기 위해 MyStack 클래스를 바꿔주어야 한다 */
