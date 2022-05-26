package chap5.referencevar;
/*
 * 얕은 복사 (shallow copy)
 * arraycopy()메서드로인한 배열의 복사는 객체의 번지를 복사하는 것이므로 원본의 배열의 참조하는 객체의 값이 바뀌면
 * 이미 복사한 배열도 영향을 받는다.
 */
public class ArrayCopyExample {
	public static void main(String[] args) {
		String[] oldStrArray = { "java", "array", "copy" };
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		
		for(int i=0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + ", ");
		}
		
	}
}
