package day0103;

public class EscapeSeq_04 {

	public static void main(String[] args) {
		// 문자열 내에서 특별한 의미로 해석되는 문자들을 가르켜 이스케이프 시퀀스라고 한다.
		// 이스케이프 시퀀스는 모두 \로 시작함
		// \t : 다음 탭위치로 이동 
		// \n : 다음 줄로 이동 (하나의 문자열내에서 이동할 때)
		// \' : 따옴표
		// \" : 쌍따옴표
		// \\ : 백슬래시
		
		
		System.out.println("Apple\tOrange\tBanana");
		System.out.println("Apple\'");
		System.out.println("Apple\"");
		System.out.println("c:\\");
		System.out.println("\"Hello\"");
		System.out.println("\"pizza\", \"spagetti\", \"hamburger\"");

		
	}

}
