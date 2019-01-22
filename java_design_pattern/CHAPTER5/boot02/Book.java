package java_design_pattern;

public class Book {
	// 책은 서명, 출판년도, 가격을 갖음
	private String name; // 서명
	private int publishYear; // 출판년도
	private int price; // 가격
	
	public Book(String name, int publishYear, int price)
	{
		this.name = name;
		this.publishYear = publishYear;
		this.price = price;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getPublishYear()
	{
		return this.publishYear;
	}
	
	public int getPrice()
	{
		return this.price;
	}

}
