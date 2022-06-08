package chap6.annotation;

public class Service {
	@PrintAnnotation
	public void main1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")
	public void main2() {
		System.out.println("실행 내용2");
	}
	
	@PrintAnnotation(value="#", number=20)
	public void main3() {
		System.out.println("실행 내용3");
	}
}
