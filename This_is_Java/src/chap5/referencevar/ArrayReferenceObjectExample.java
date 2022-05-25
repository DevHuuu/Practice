package chap5.referencevar;
/*
 * 배열도 String과 마찬가지로 인덱스가 다르더라도 같은 문자열리터럴이라면 같은 객체를 참조한다.
 * 때문에 new 연산자를 이용하여 객체를 생성하여 참조하였다면 equals()메서드를 이용하여 비교해야 한다.
 */
public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
	}
}
