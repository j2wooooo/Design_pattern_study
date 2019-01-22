/* 175쪽, 다음 코드는 Sale 객체의 구매 목록이나 가격 같은 정보를 영수증 프린터(HD108Receipt Printer 클래스)에 전달해 출력하도록 한 프로그램이다.
 * 이 프로그램의 문제는 테스트할 때 실제 영수증 프린터 기기를 연결해 제대로 출력되는지를 살펴봐야 한다는 것이다.
 * 이는 매우 번거로운 작업이다. 이를 해결할 수 있는 방법을 제안하라.
 */

package java_design_pattern;

import java.util.ArrayList;
import java.util.Iterator;

public class Sale {
	private ArrayList<Item> items = ArrayList<Item>();
	private HD108ReceiptPrinter printer = new HD108ReceiptPrinter();
	
	public void printReceipt()
	{
		Iterator<Item> itr = items.iterator();
		StringBuffer buf = new StringBuffer();
		while(itr.hasNext())
		{
			Item item = itr.next();
			buf.append(item.getName());
			buf.append(item.getPrice());
		}
		printer.print(buf.toString());
	}
	
	public void add(Item item)
	{
		items.add(item);
	}
}
