package chap6.getter_setter;

//Getter와 Setter 메소드 선언
public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	//생성자
	
	//메소드
	public int getSpeed() {				//차의 현재 속도를 리턴
		return speed;
	}
	public void setSpeed(int speed) {	//차의 속도를 변경
		if(speed < 0) {			//잘못된 값이 들어가는 것을 막는 검증코드
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {		//차의 현재 동작 상태를 리턴(주행 or 멈춤)
		return stop;
	}
	
	public void setStop(boolean stop) {		//차의 동작 상태를 변경
		this.stop = stop;
		this.speed = 0;
	}
}
