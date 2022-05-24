package chap5.referencevar;
/*
 * 데이터 타입 별 배열의 초기값
 * ---------------------------------
 * 			byte				0
 * 			short				0
 * 정수형		int					0
 * 			long				0L
 * ----------------------------------
 * 실수형		float				0.0F
 * 			double				0.0
 * ----------------------------------
 * 논리형		boolean				false
 * -----------------------------------
 * 문자형		char				'\u0000'
 * ------------------------------------
 * 참조타입	String...			null
 * ------------------------------------
 */
public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		int[] arr1 = new int[3];	//길이가 3인 배열을 생성
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
	}
}
