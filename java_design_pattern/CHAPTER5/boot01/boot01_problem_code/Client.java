/* 167쪽, 로봇만들기 코드 5-1 */

package java_design_pattern; 

public class Client
{
	public static void main(String[] args)
	{
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		
		System.out.println("My name is "+ taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();
		
		System.out.println("My name is "+ atom.getName());
		atom.move();
		atom.attack();
	}
}
