/* 181쪽, 4번 다음 코드는 아래에 설명하는 요구사항을 만족하는 프로그램을 작성한 것이다. 질문에 답하라. */

/* 필드 안에 2개 이상의 공이 존재한다.
 * 각 공은 첫째, 좌우로 움직이거나 둘째, 상하로 움직이거나 셋째, 대각선으로 움직일 수 있다.
 * 각 공은 빨간색이나 파란색으로 칠해진다.
 */

package java_design_pattern;

import java.awt.Color;

public class Ball extends Thread{
	public static final int SIZE = 20;
	public static final int INTERVAL = 10;
	private int x, y;
	private int xInterval, yInterval;
	private DirectionStrategy directionStrategy;
	private DrawStrategy drawStrategy;
	private Color color;
	
	public Ball(int x, int y)
	{
		this.x = x;
		this.y = y;
		this.xInterval = this.yInterval = 0;
	}
	
	public int getX()
	{
		return x;
	}
	
	public int getY()
	{
		return y;
	}
	
	public int getXinterval()
	{
		return this.xInterval;
	}
	
	public int getYinterval()
	{
		return this.yInterval;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setIntervals(int xInterval, int yInterval) {
		this.xInterval = xInterval;
		this.yInterval = yInterval;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public void setDirectionStrategy(DirectionStrategy directionStrategy) {
		this.directionStrategy = directionStrategy;
	}
	
	public void setDrawStrategy(DrawStrategy drawStrategy) {
		this.drawStrategy = drawStrategy;
	}
	
	public void draw()
	{
		drawStrategy.draw(this);
	}
	
	public void move()
	{
		directionStrategy.move(this);
	}
	
	public void run()
	{
		draw();
		move();
	}
}
