/* [p.114] 128쪽, 다음의 FuelTankMonitoring 클래스는 로켓의 연료 탱크를 검사해 특정 조건에 맞지 않으면 관리자에게 경고 신호를 보내는 기능이 있다.
 * 연료 탱크를 검사하는 방식과 경고를 보내는 방식이 변경될 가능성이 큰 경우에 대비해 다음 코드를 수정하라. */

/* 우선 무엇이 변하는지를 파악할 필요가 있다. 이 경우에는 checkFuelTank 메서드와 giveWarningSignal 메서드의 구체적 행위 방식이 변한다.
 * 따라서 새로운 행위 방식을 기존의 코드에 영향을 주지 않고 추가하려면 이 두 메서드를 개별 클래스에서 정의하도록 해야 한다.
 * 이를 위해 checkFuelTank 메서드와 giveWarningSignal 메서드를 protected 라는 접근 제어자를 사용해 변경하고
 * 상속 관계를 이용해 자식 클래스에 새로운 방식의 메서드를 정의한다.
 * 
 * 다음 코드는 두 메서드를 X 방식을 사용하도록 변경하기 위해 기존의 코드는 그대로 두고 새로운 클래스만 자식 클래스로 추가하는 것이다.
 */

package java_design_pattern;

public class FuelTankMonitoring{
	public void checkAndWarn() {
		if(checkFuelTank())
		{
			giveWarningSignal();
		}
	}
	protected boolean checkFuelTank() {} // default 방식
	protected void giveWarningSignal() {} // default 방식
}
