/* 101쪽, 괄호 안을 채워 LinkedList 클래스를 이용하는 Queue 클래스를 작성하라. */

package java_design_pattern;

public class Main{
	public static void main(String[] args) {
	Queue<String> q = new Queue<String>();
	q.addQueue("insang1");
	q.addQueue("insang2");
	q.addQueue("insang3");
	System.out.println(q);
	}
}
