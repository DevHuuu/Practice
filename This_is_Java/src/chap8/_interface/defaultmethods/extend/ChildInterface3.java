package chap8._interface.defaultmethods.extend;

//디폴트 메소드를 추상메소드로 재선언
public interface ChildInterface3 extends ParentInterface{
	@Override
	public void method2();	//추상메소드로 재선언
	public void method3();
}
