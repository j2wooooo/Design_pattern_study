/* 185쪽, 5번 다음 코드와 실행 결과를 참고해 물음에 답하라. */

/* 만약 프로그램이 새로운 달리기 이미지를 처리해야 한다면 이때 어떤 문제가 발생하는가? */

/* 1. 스트래티지 패턴을 사용한 코드
 * MovingSrategy라는 추상 클래스를 만들고 하위클래스로 개별적인 이미지를 처리하는 클래스(WalkingStrategy)를 둔다.
 * Field 클래스는 스트래티지 패턴에서 Context 클래스 역할을 하므로 스트래티지 패턴을 설정하는 메서드 setMovingStrategy를 정의했다.
 * Running 클래스는 스트래티지 패턴이 설정된 Field 스레드 객체를 인자로 받아 이를 실행시키는 역할을 한다.
 * Field 객체는 현재 설정된 스트래티지 패턴 객체(strategy)에 인자로 전달한 판넬 객체에 적절한 이미지를 그리는 작업을 위임한다.
 * 
 * OCP를 따르는 설계인지 이미지를 처리하는 기능을 추가하였다.
 * 이전 설계에서처럼 기존의 코드를 전혀 수정할 필요 없이 RunningStrategy 클래스를 MovingStrategy 추상 클래스의 하위 클래스로 두면 된다.
  */ 

package java_design_pattern;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RunningStrategy extends MovingStrategy{
	private String[] runningImage = {"run1.gif", "run2.gif", "run3.gif"};
	
	@Override
	public void drawImages(JLabel lbl)
	{
		lbl.setIcon(new ImageIcon("./src/run1.gif"));
		while(true)
		{
			String[] path = runningImage;
			for(int i = 0; i < path.length; i++)
			{
				lbl.setIcon(new ImageIcon("./src/" + path[i]));
				try {
					Thread.sleep(300);
				}catch(InterruptedException e) {}
			}
		}
	}
}
