package chap7.super_call_method;

// super 변수
public class SupersonicAriplaneExample {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeoff();
		sa.fly();
		sa.flymode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}
}
