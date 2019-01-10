/* 99쪽, 다음 코드는 음원을 구매하는 웹 사이트의 장바구니 할인율을 고려해 장바구니에 담긴 음원의 총 가격을 계산하는 기능을 구현한 것이다.
 * 각 음원은 할인 모드에 따라 할인율이 다르게 적용된다.
 * 현재 OnSale 모드와 TodayEvent라는 2가지 할인 모드가 있다.
 * OnSale 모드에서는 음원 가격에 10%의 할인율이 적용되고 TodayEvent모드는 30%의 할인율이 적용된다.
 * 다음 코드의 문제점을 지적하고 개선하라. */

/* 현재 프로그램 주고는 새로운 요구사항이 있을 때마다 매번 수정되어야 한다.
 * 이를 개선하려면 일반화 관계를 통해 할인율 모드를 외부에 은닉할 필요가 있으며 다형성과 동적 바인딩을 통해 적합한 할인율이 적용되도록 해야 한다.
 */

package java_design_pattern;

public class Song {
	private DiscountMode mode;
	
	public void setMode(DiscountMode mode)
	{
		this.mode = mode;
	}
	
	public double getPrice()
	{
		return 10.0 - (10.0 * this.mode.getDiscountRate());
	}
}
