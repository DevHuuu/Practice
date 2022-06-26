package chap8._interface.defaultmethods.extend;

//디폴트 메소드를 재정의하여 실행내용을 변경
public interface ChildInterface2 extends ParentInterface{
	@Override
	default void method2() { 	//재정의
		System.out.println("Child2-method2() 실행");
	}	
	
	public void method3();
}
