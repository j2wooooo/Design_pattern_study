/* [p.115] 다음 코드는 오후 10시가 되면 MP3를 작동시켜 음악을 연주한다.
 * 그러나 이 코드가 제대로 작동하는지 테스트하려면 저녁 10시까지 기다려야 한다.
 * OCP를 적용해 이 문제를 해결하는 코드를 작성하라. */

/* 실제 시간을 사용해서 테스트하는 방법은 매우 번거롭고 시간도 오래 걸리므로 시간을 원하는 대로 설정해 이용할 수 있는 방법을 찾아야 한다.
 * 다음 클래스 다이어그램처럼 인터페이스를 만들고 이 인터페이스에서 파생한 2개의 클래스를 만든다.
 * 한 클래스는 진짜 시간을 제공하는 클래스고 다른 한 클래스는 테스트에 사용할 수 있게 임의의 시간을 원하는 대로 설정할 수 있는 클래스다.
 * 이러한 설계는 TimeReminder 클래스를 전혀 수정하지 않고 주변이 환경을 바꿀 수 있다.
 */

/* 여전히 문제가 있음을 알 수 있다. 실제 MP3 기기를 사용해 테스트를 실행하면 테스트할 때마다 원하지 않은 음악 소리가 작업실에 메아리칠 것이다.
 * 그리고 테스트를 위해 실제 MP3 기기를 이용하는 것도 바람직하지 않을 뿐만 아니라 테스트의 실행 속도를 현저하게 느리게 하는 원인이 될 수도 있다.
 * 이를 해결하는 방법도 시간 문제를 해결하는 방법과 유사하다.
 */

package java_design_pattern; 

public class Main
{
	public static void main(String[] args)
	{
		TimeReminder sut = new TimeReminder();
		FakeTimeProvider tProvStub = new FakeTimeProvider();
		tProvStub.setHours(18);
		sut.setTimeProvider(tProvStub);
		sut.reminder();
	}
}
