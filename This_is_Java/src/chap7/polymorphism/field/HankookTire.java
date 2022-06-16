package chap7.polymorphism.field;

//Tire의 자식 클래스
public class HankookTire extends Tire{
	//필드
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//메소드
	@Override
	public boolean roll() {
		++accumulaterRotation;			//메소드 실행시 마다 누적회전수 증가
		if(accumulaterRotation<maxRotation) {
			System.out.println(location + "HankookTire 수명: " +
				(maxRotation-accumulaterRotation) + "회");
			return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}	
	}	
}
