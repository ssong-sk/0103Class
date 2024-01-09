package day0105;

public class SwitchTest_19 {

	public static void main(String[] args) {
		// switch문 예제 _ #1\


		int a = 3;


		//break가 없을경우 끝까지 실행

		switch(a) {
		case 1 : 
			System.out.println("a is 1");
			break;
		case 2 :
			System.out.println("a is 2");
			break;
		case 3 :
			System.out.println("a is 3");
			break;
		default :
			System.out.println("a is 입력값 없음"); //마지막은 break를 붙이거나 안붙여도 됨.
		}



		char ch = 'c';

		switch(ch) {
		case 'A' :
			System.out.println("apple");
			break;
		case 'B' :
			System.out.println("banana");
			break;
		default :
			System.out.println("사과 바나나가 아니다!");
		}



		String msg = "Happy";
		//switch 문자열이 jdk8부터 사용가능

		switch(msg) {
		case "Hello" :
			System.out.println("msg는 Hello다");
			break;
		case "Happy" :
			System.out.println("msg는 Happy다");
			break;
		case "Hi" :
			System.out.println("msg는 Hi다");
			break;
		default :
			System.out.println("인사안함 ^^");

		}


	}

}
