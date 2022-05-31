package chap6.constructor;

//생성자의 오버로딩
public class Car2 {
	//필드
	public String company = "현대자동차";
	public String model;
	public String color;
	public int maxSpeed;
	
	//생성자
	Car2() {
		
	}
	
	Car2(String model) {
		this.model = model;
	}
	
	Car2(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	Car2(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
