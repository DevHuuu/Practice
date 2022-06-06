package chap6.exercise;

//Q1.다음 객체에 대한 설명에 맞는 클래스를 만들고 값을 출력해 보세요.
//나이가30살, 이름이 James라는 남자가 있습니다. 이 남자는 결혼을 했고 자식이 셋 있습니다.
/* <출력결과>
나이 : 30

이름 : James

결혼여부 : ture

자녀 수 : 3
*/

public class people {

	public int age;
	public String name;
	public boolean isMarried;
	public int children;
	
	public void peopleinfo() {
		
		System.out.println("나이 :"+age);
		System.out.println("이름 :"+name);
		System.out.println("결혼 여부 :"+isMarried);
		System.out.println("자녀 수 :"+children);
	}
}
