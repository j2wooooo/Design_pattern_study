/* [p.153] 160쪽, 다음 순차 다이어그램에 해당하는 코드를 작성하라. */

package java_design_pattern;

public class A1{

	public void doA1()
	{
		A2 a2 = new A2();
		a2.doA2(this);
	}
	
	public void doIt(A3 a3)
	{
		a3.doIt();
	}
}
