package p20250317;

public class p20250317class {

	public static void main(String[] args) {

//		// 2025.3.17. 나의 첫번째 코드?
//		int a = 3; // 정수형 변수 a의 값에 3을 저장한다. a는 4bytes를 차지한다.
//		int A = 2;
//		System.out.println(a+A); // () 안의 값을 출력해준다. ()안의 값은 유일한 값이어야 한다.
//		
//		// 컴파일 하는 방법 → 시작 버튼(Ctrl + F11) 누르고 OK 누르면 콘솔창에 결과값을 출력한다.
		// 코드 범위를 지정하고 Ctrl + 슬래시 입력하면 그 범위가 주석처리된다.
		
//		float a = 3.2f;
//		double b = 3.2;
//		final double d = 3.141592; // d가 변수에서 상수로 변경됨.
//		System.out.println(d*d*d);
//		System.out.println( Math.pow(d, 3) );
		
		System.out.println(Math.pow(2, 0.5) );
		System.out.println(Math.pow(2, 1/2) );
		System.out.println(Math.pow(2, 1.0/2) );
		System.out.println(Math.pow(2, (double) 1 / 2));
		int a = 5;
		int b = ++a;  // a를 먼저 1 증가시키고, 그 값을 b에 대입
		System.out.println(a);  // 출력: 6
		System.out.println(b);  // 출력: 6
	}

	
}
