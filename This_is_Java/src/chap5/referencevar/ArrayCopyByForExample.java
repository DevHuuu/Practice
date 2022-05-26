package chap5.referencevar;
/*
 *  깊은 복사(deep copy)
 *  참조타입의 배열인 경우 아래와 같이 배열을 복사하면 참조하는 객체도 별도로 생성되어 이전과 참조객체의 번지수가 다르다.
 */
public class ArrayCopyByForExample {
	public static void main(String[] args) {
		int[] oldIntArray = { 1, 2, 3 };
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		for(int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}
}
