/* [p.114] 128쪽, 다음의 FuelTankMonitoring 클래스는 로켓의 연료 탱크를 검사해 특정 조건에 맞지 않으ㅕㄴ 관리자에게 경고 신호를 보내는 기능이 있다.
 * 연료 탱크를 검사하는 방식과 경고를 보내는 방식이 변경될 가능성이 큰 경우에 대비해 다음 코드를 수정하라. */

package java_design_pattern;

public class FuelTankMonitoring{
	public void checkAndWarn() {
		if(checkFuelTank())
		{
			giveWarningSignal();
		}
	}
	private boolean checkFuelTank() {}
	private void giveWarningSignal() {}
}
