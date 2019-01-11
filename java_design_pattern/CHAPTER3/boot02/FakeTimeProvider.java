/* [p.115] 다음 코드는 오후 10시가 되면 MP3를 작동시켜 음악을 연주한다.
 * 그러나 이 코드가 제대로 작동하는지 테스트하려면 저녁 10시까지 기다려야 한다.
 * OCP를 적용해 이 문제를 해결하는 코드를 작성하라. */

/* 실제 시간을 사용해서 테스트하는 방법은 매우 번거롭고 시간도 오래 걸리므로 시간을 원하는 대로 설정해 이용할 수 있는 방법을 찾아야 한다.
 * 다음 클래스 다이어그램처럼 인터페이스를 만들고 이 인터페이스에서 파생한 2개의 클래스를 만든다.
 * 한 클래스는 진짜 시간을 제공하는 클래스고 다른 한 클래스는 테스트에 사용할 수 있게 임의의 시간을 원하는 대로 설정할 수 있는 클래스다.
 * 이러한 설계는 TimeReminder 클래스를 전혀 수정하지 않고 주변이 환경을 바꿀 수 있다.
 */

package java_design_pattern;

import java.util.Calendar;

public class FakeTimeProvider implements TimeProvider { // TimeProvier 테스트 스텁
	private Calendar cal;
	
	public FakeTimeProvider()
	{
		cal = Calendar.getInstance();
	}
	public FakeTimeProvider(int hours)
	{
		cal = Calendar.getInstance();
		setHours(hours);
	}
	
	public void setHours(int hours)
	{
		cal.set(Calendar.HOUR_OF_DAY, hours); // 주어진 시간으로 시간 설정
	}
	
	public int getTime()
	{
		return cal.get(Calendar.HOUR_OF_DAY); // 현재 시간 반환 
	}
}
