/* 137쪽,다음 코드는 정상 작업 시간(workHours 속성)과 잔업 시간(overTimeHours 속성)을 기반으로 임금을 계산하고 이를 출력하는 기능(calculatePay 메서드)을 제공한다.
 * 현재 설계의 문제점을 진단하고 설계를 개선하라.
 */

/* CalculatePayMachine 클래스의 변경 사유는 크게 2가지이다.
 * 하나는 GUI가 변경되는 경우이고 다른 하나는 임금을 계산하는 로직이 변경되는 경우이다.
 * 따라서 하나의 클래스는 하나의 변경사유만 있어야 한다는 SRP를 위반한다. SRP를 따르려면 우선 2가지 변경사유를 각기 다른 클래스에서 담당하도록 해야 한다.
 * 
 * 또한 위와 같이 변경한 설계는 SRP는 만족하지만 OCP를 만족하지 않는다. 만약 임금 로직이 변경되는 경우에는 GUI 클래스도 영향을 받는다.
 * GUI 클래스가 임금을 계산하는 구체적인 구체 클래스와 직접적인 연관을 맺었기 때문이다. 이 문제를 해결하려면 GUI 클래스가 인터페이스와 연관을 갖는 것이 더 나은 설계가 된다.
 */

package java_design_pattern;

public interface PayCalculationStrategy{
	public int getPay(int workHours, int overtimeHours);
}
