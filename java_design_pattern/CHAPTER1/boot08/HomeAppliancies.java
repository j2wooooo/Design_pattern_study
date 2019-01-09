/* [p.51] 35쪽, 다음 클래스 다이어그램을 코드로 작성하라. */
package java_design_pattern;

public abstract class HomeAppliancies {
	private int seriaNo;
	private String manufacturer;
	private int year;
	
	public abstract void turnOn();
	public abstract void turnOff();	
}
