package chap6.exercise;
/*
 * ShopService 객체를 싱글톤으로 만들고 싶습니다. ShopServiceExample 클래스에서 
 * ShopService의 getInstance() 메소드로 싱글톤을 얻을 수 있도록 ShopService 클래스를 작성해보세요.
 */
public class ShopService {
	//필드 - 다른 클래스에서 필드에 접근하지 못하게 private 접근 제한
	//    - 정적메소드인 getInstance()에 사용되므로 static
	private static ShopService shopService = new ShopService();
	
	//생성자 - 외부 클래스에서 접근하지 못하게 private 접근 제한
	//      - 사용될 일이 없으므로 매개변수와 초기화블록내용이 없다.
	private ShopService() {}
	
	//메소드 - 외부 클래스에서 객체생성없이 호출되야하므로 static
	//     - 내부클래스의 객체를 리턴해야하므로 ShopService를 리턴값으로 가짐
	static ShopService getInstance() {
		return shopService;
	}
}
