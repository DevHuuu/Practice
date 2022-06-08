package chap6.exercise;
/*
 * 현실 세계의 회원을 Member 클래스로 모델링하려고 합니다. 회원의 데이터로는 이름, 아이디, 패스워드, 나이가 있습니다.
 * 이 데이터들을 가지는 Member클래스를 선언해보세요.
 * 
 * 데이터이름	필드이름		타입
	이름		name		문자열
	아이디	id			문자열
	패스워드	password	문자열
	나이		age			정수
 */
public class Member {
	public String name;
	public String id;
	public String password;
	public int age;
	
/*
 * 작성한 Member클래스에 생성자를 추가하려고합니다. 다음과 같이 Member 객체를 생성할 때 name 필드와 id필드를 
 * 외부에서 받은 값으로 초기화하려면 생성자를 어떻게 선언해야 합니까?
 * 
 * Member user1 = new Member("홍길동", "hong");
 * Member user2 = new Member("강자바", "java");
 */
	
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
}