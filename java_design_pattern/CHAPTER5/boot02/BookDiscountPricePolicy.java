package java_design_pattern;

public class BookDiscountPricePolicy implements PricePolicy{ // 책 자체 가격 할인 정책
	public int calcPrice(int price, int n) {
		return (int)(price*n*0.95);
	}
}
