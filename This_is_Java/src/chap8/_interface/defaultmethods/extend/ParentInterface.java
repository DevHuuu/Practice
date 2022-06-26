package chap8._interface.defaultmethods.extend;

public interface ParentInterface {
	public void method1();
	public default void method2() {
		System.out.println("Parent-method2() 실행");
	}
}
