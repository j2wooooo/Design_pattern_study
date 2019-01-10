/* [p.88] 회사에 도착했을 때 운전자에서 종업원으로 역할이 변경되어 회사에서 업무를 수행하는 상황을 코드로 작성하라. */

package java_design_pattern;

public class Driver extends Role{
	public void doIt()
	{
		System.out.println("Driving");
	}
}
