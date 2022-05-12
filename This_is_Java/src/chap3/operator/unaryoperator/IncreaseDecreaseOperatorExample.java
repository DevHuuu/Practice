package chap3.operator.unaryoperator;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println("------------------");
		x++;	// x = 11
		++x;	// x = 12
		System.out.println("x=" + x);
		
		System.out.println("------------------");
		y--;	// y = 9 
		--y;	// y = 8
		System.out.println("y=" + y);
		
		System.out.println("------------------");
		z = x++;	// z에 기존의 x값을 대입하고 x가 1증가 z = 12, x = 13
		System.out.println("z=" + z);
		System.out.println("x=" + x);

		System.out.println("------------------");
		z = ++x;	// x가 1증가하고 z에 x값을 대입 z = 14, x = 14
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------------");
		/*
		 *  연산 순서
		 *  1. ++x => x가 1 증가 x = 15
		 *  2. x + y => 여기서 y는 증가하기전 기존의 값 8임 => x + y = 23
		 *  3. y++ => y가 1증가 y = 9
		 *  4. x + y의 갑이 z에 대입 => z =23
		 */
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}
