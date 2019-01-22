/* 187쪽, 다음 코드는 Sale 객체의 구매 목록이나 가격 같은 정보를 영수증 프린터(HD108Receipt Printer 클래스)에 전달해 출력하도록 한 프로그램이다.
 * 이 프로그램의 문제는 테스트할 때 실제 영수증 프린터 기기를 연결해 제대로 출력되는지를 살펴봐야 한다는 것이다.
 * 이는 매우 번거로운 작업이다. 이를 해결할 수 있는 방법을 제안하라.
 */

/* Sale 클래스에는 영수증 프린터를 외부에서 주입할 수 있도록 setReceiptPrinter(ReceiptPrinter) 메서드가 정의되어 있다.
 * 이 메서드를 이용해 테스트할 때는 가짜 프린터(FakePrinter 클래스)의 객체를, 실제 운용할 때는 실제 기기(HD108ReceiptPrinter 클래스)의 객체를 주입한다.
 * FakePrinter 클래스에서는 Sale 클래스에서 전달한 여러 정보를 확인할 수 있도록 getReceiptContents 메서드를 정의했다.
 */

package java_design_pattern;

public class FakePrinter implements ReceiptPrinter{
	private String s;
	
	@Override
	public void print(String s) {
		this.s = s;
	}
	
	public String getReceiptContents()
	{
		return s;
	}
}
