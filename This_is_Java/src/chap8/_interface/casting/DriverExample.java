package chap8._interface.casting;

public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Texi texi = new Texi();
		
		driver.drive(bus);
		driver.drive(texi);
	}
}
