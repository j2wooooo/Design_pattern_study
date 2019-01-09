/* [p.53] 39쪽, 그림 1-22를 코드로 작성하라. */

package java_design_pattern;

// Person 클래스
public class Person {
	private Car owns; // 이 속성으로 연관 관계가 설정된다.
	
	public void setCar(Car car) {
		this.owns = car;
	}
	
	public Car getCar() {
		return this.owns;
	}
}
