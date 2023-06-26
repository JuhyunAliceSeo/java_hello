import java.util.Scanner; //scanner 포함시킴

public class Java_02_scanner { //유저가 입력받는것

	public static void main(String[] args) {
		
//		String source = "1 3 5";
//		Scanner sc = new Scanner(source);
// 		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
//		int num3 = sc.nextInt();
//		
//		int sum = num1 + num2 + num3;
//		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum); //1 + 3 + 5 = 9 
		
		
		Scanner sc = new Scanner(System.in); //키보드 적용 in = static
		
		System.out.print("국어: ");
		int kor = sc.nextInt(); //제어권이 키보드로 넘어가면서 키보드가 치길 기다리는 문구
		System.out.print("영어: ");
		int eng = sc.nextInt();
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		System.out.println("총점: "+ (kor + eng + math));
		
 		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int sum = num1 + num2 + num3;
		System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, sum);

	}

}
