

public class Java_01_ {

	public static void main(String[] args) {
		
		//문자열 연결시키기
		String st1 = "Coffee";
		String st2 = "Bread";
		
		String st3 = st1.concat(st2);
		System.out.println(st3);//결과값 : CoffeeBread
		
		String st4 = "Fresh".concat(st3);
		System.out.println(st4); //결과값 : FreshCoffeeBread
				//int m = 5+7 <-리터럴이라고 함
		
		//문자열 일부 추출
		String str = "abcdefg";
		str.substring(2); //2가 출력 * a=0임
		
		str.substring(2,4); //2~3이 출력  *종료인덱스 4번은 포함 하지 않음.
		
		//문자열의 내용 비교
		
		String st5= "Lexicontrabhically";
		String st6= "Lexicontrabhically";
		int cmp;
		
		if(st5.equals(st6))
			System.out.println("두문자열은 같습니다.");
		else
			System.out.println("두문자열은 다릅니다.");
		
		cmp= st1.compareTo(st2);
		if(cmp==0)
			System.out.println("두 문자열은 일치합니다.");
		else if(cmp<0)
			System.out.println("사전의 앞에 위치하는 문자: " + st5);
		else
			System.out.println("사전의 앞에 위치하는 문자: " + st6);

		if(st1.compareToIgnoreCase(st6) ==0)
			System.out.println("두문자열은 같습니다.");
		else
			System.out.println("두문자열은 다릅니다.");		
		
		//기본 자료형의 값을 문자열로 바꾸기
		double se= 3.131517;
		String e = String.valueOf(se); // se 더블형을 string으로 바꾸는것
		
		String hello = "1234";
		int num1 = Integer.valueOf(hello);
		
		// 문자열 "123"이 저장된 인스턴스의 생성
		   StringBuilder stbuf = new StringBuilder("123");
		   
		   stbuf.append(45678);   // 문자열 덧붙이기
		   System.out.println(stbuf.toString());
		   
		   stbuf.delete(0, 2);    // 문자열 일부 삭제
		   System.out.println(stbuf.toString());
		   
		   stbuf.replace(0, 3, "AB");    // 문자열 일부 교체
		   System.out.println(stbuf.toString());

		   stbuf.reverse();    // 문자열 내용 뒤집기
		   System.out.println(stbuf.toString());

		   String sub = stbuf.substring(2, 4);  // 일부만 문자열로 반환
		   System.out.println(sub);


	}

}
