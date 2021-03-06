/* 99쪽, 다음 코드는 음원을 구매하는 웹 사이트의 장바구니 할인율을 고려해 장바구니에 담긴 음원의 총 가격을 계산하는 기능을 구현한 것이다.
 * 각 음원은 할인 모드에 따라 할인율이 다르게 적용된다.
 * 현재 OnSale 모드와 TodayEvent라는 2가지 할인 모드가 있다.
 * OnSale 모드에서는 음원 가격에 10%의 할인율이 적용되고 TodayEvent모드는 30%의 할인율이 적용된다.
 * 다음 코드의 문제점을 지적하고 개선하라. */

package java_design_pattern;

public class Song {
	private String mode;
	
	public void setMode(String mode)
	{
		this.mode = mode;
	}
	
	public double getPrice()
	{
		return 10.0;
	}
	
	public String getDiscountMode()
	{
		return this.mode;
	}
}
