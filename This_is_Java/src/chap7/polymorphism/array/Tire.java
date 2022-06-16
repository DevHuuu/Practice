package chap7.polymorphism.array;

//타이어 클래스
public class Tire {
	//필드
	public int maxRotation;				//최대 회전수(타이어 수명)
	public int accumulaterRotation;		//누적 회전수
	public String location;				//타이어의 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메소드
	public boolean roll() {
		++accumulaterRotation;			//메소드 실행시 마다 누적회전수 증가
		if(accumulaterRotation<maxRotation) {
			System.out.println(location + "Tire 수명: " +
				(maxRotation-accumulaterRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "Tire 펑크 ***");
			return false;
		}	
	}
}
