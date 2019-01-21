/* [p.153] 160쪽, 다음 순차 다이어그램에 해당하는 코드를 작성하라. */

package java_design_pattern;

public class A2{

	public void doA2(A1 a1)
	{
		A3 a3 = new A3();
		a1.doIt(a3);
	}
}
