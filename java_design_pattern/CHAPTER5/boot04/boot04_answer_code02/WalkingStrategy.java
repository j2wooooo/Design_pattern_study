/* 185쪽, 5번 다음 코드와 실행 결과를 참고해 물음에 답하라. */

/* 만약 프로그램이 새로운 달리기 이미지를 처리해야 한다면 이때 어떤 문제가 발생하는가? */

/* 추가적인 개선사항
 * drawImage 메서드의 실행 흐름이 RunningStrategy나 WalkingStrategy 클래스와 거의 같다.
 * 이 점을 이용해 다음과 같이 MovingStrategy라는 추상 클래스에 공통적인 실행 흐름을 가진 drawImage 메서드를 정의해 코드의 중복을 없앤다.
 * 
 * 중요한 점은 이미지 처리에서 다른 부분은 모두 protected 접근 제어자로 선언한 메서드로 대치해 자식 클래스에서 재정의할 수 있게 했다는 점이다.
 * 이와 같이 실행 흐름은 동일하지만 어느 특정 실행 단계의 구현을 자식 클래스에서 결정하도록 함으로써 서로 다른 자식 클래스가 서로 다른 구현을 실행해 다른 기능이 실행되도록 한다.
 * 이와 같이 동일한 흐름을 지닌 메서드의 중복을 없애고 자식 클래스에서 각 실행 흐름의 내용을 결정하도록 하는 디자인 패턴을 템플릿 메서드 패턴이라고 한다.
  */  

package java_design_pattern;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WalkingStrategy extends MovingStrategy{
	private String[] walkingImage = {"walk1.gif", "walk2.gif"};
	
	@Override
	protected ImageIcon getImageIcon(String name) {
		return new ImageIcon("./src/" + name);
	}
	
	@Override
	protected String[] getImageNames() {
		return walkingImage;
	}
}
