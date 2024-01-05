package sub1;

public class Car {

	// 속성(필드) - 이름은 뭔지? 색은 뭔지? 속도는 얼마나 나오는지?
	String name;
	String color;
	int speed;
	
	// 기능(메서드)
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed += speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
}
