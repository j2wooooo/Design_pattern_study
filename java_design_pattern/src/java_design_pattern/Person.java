/* [p.43] 26쪽, 다음 클래스 다이어그램을 코드로 작성하라. */

package java_design_pattern;

// Person 클래스
public class Person {
	// -phones 이므로 가시성은 private
	private Phone[] phones;
	
	// 2
	// constructor
	// class Phone형의 배열을 만든다. 배열의 size = 2
	public Person() {
		phones = new Phone[2];
	}
	
	// 만든 두개의 클래스를 구분하여 해당하는 전화번호를 출력한다.
	public Phone getPhone(int i) {
		if(i==0 || i == 1)
			return phones[i]; // i = 0이면 집 전화, i = 1이면 사무실 전화
		
		return null;
	}
}

/* 이 코드는 집 전화와 사무실 전화를 배열의 인덱스를 통해 구분해야 하므로 매우 불편하다.
이런 경우는 전화기의 역할을 구분해서 사용하면 해결할 수 있다.*/
