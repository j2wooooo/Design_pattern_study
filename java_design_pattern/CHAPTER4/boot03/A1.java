/* 162쪽, 다음 코드의 순차 다이어그램을 작성하라. */

package java_design_pattern;

public class A1{

	public void doA1()
	{
		A2 a2 = new A2();
		a2.doA2(this);
		A3 a3 = new A3();
		a3.doA3(a2);
	}
	
	public void doIt(){
	}
}
