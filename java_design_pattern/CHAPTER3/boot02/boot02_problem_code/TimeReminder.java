/* [p.115] 다음 코드는 오후 10시가 되면 MP3를 작동시켜 음악을 연주한다.
 * 그러나 이 코드가 제대로 작동하는지 테스트하려면 저녁 10시까지 기다려야 한다.
 * OCP를 적용해 이 문제를 해결하는 코드를 작성하라. */

package java_design_pattern;

import java.util.Calendar;

public class TimeReminder {

	private MP3 m;
	
	public void reminder() {
		Calendar cal = Calendar.getInstance();
		m = new MP3();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		
		if(hour >= 22)
		{
			m.playSong();
		}
	}
}
