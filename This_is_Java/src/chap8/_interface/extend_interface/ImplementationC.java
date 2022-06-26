package chap8._interface.extend_interface;

public class ImplementationC implements InterfaceC{

	@Override
	public void methodA() {
		System.out.println("ImplementaionC-methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementaionC-methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementaionC-methodC() 실행");
	}

}
