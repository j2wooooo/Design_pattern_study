/* [p.43] 27쪽, 다음 클래스 다이어그램을 코드로 작성하라. */

package java_design_pattern;

// Person 클래스
public class Person {
	
	private Phone homePhone;
	private Phone officePhone;
	
	// 집 전화번호 설정
	public void setHomePhone(Phone phone) {
		this.homePhone = phone;
	}
	
	// 사무실 전화번호 설정
	public void setOfficePhone(Phone phone) {
		this.officePhone = phone;
	}
	
	// 집 전화번호 가져오기
	public Phone getHomePhone() {
		return homePhone;
	}
	
	// 사무실 전화번호 가져오기
	public Phone getOfficePhone() {
		return officePhone;
	}
	
}
/* 이 코드는 집 전화와 사무실 전화 각각에 참조가 이루어지므로
 * setter와 getter 메서드로 상황에 맞게 원하는 해당 전화기를 사용할 수 있다. */
 */
