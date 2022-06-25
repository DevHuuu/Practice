package chap8._interface.casting;

public class VehicleExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();		//프로모션 된 변수는 인터페이스의 메소드만 접근 가능
		
		Bus bus = (Bus) vehicle;
	
		bus.run();
		bus.checkFare();
	}
}
