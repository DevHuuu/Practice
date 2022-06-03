package chap6.finalfieldandconstant;

//final 필드 테스트
public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("123456-1234567", "계백");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.nation = "usa";			//final값은 변경 불가
		//p1.ssn = "654321-7654321";	//final값은 변경 불가
		p1.name = "을지문덕";
	}
}
