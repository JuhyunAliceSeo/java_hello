
import java.util.Arrays;
import java.util.Scanner;

public class homework_rock {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] scp = {"가위","바위","보"};
		System.out.println(Arrays.deepToString(scp));//scp 내용을 문자열 형태로 출력하는 코드
		
		for(int i=0; i<10; i++) {
			int num = (int)(Math.random()*3); //0부터 2까지 난수를 생성하며 변수 num에 할당하는 코드
			System.out.println("가위, 바위, 보 중 하나를 입력하세요.");
			String b = sc.next(); //사용자로부터 입력을 받아 문자열로 반환
			System.out.println();
			
			System.out.println("나: " + b);
			System.out.println("상대편: " + scp[num]);//scp에서 변수num을 가져와서 출력
			
			if(b.equals("가위")) {
				if(num==0) {
					System.out.println("비겼습니다");
				}
				if(num==1) {
					System.out.println("졌습니다");
				}
				if(num==2) {
					System.out.println("이겼습니다");
				}
				System.out.println();
			}
			if(b.equals("바위")) {
				if(num==0) {
					System.out.println("이겼습니다");
				}
				if(num==1) {
					System.out.println("비겼습니다");
				}
				if(num==2) {
					System.out.println("졌습니다");
				}
				System.out.println();
			}
			if(b.equals("보")) {
				if(num==0) {
					System.out.println("졌습니다");
				}
				if(num==1) {
					System.out.println("이겼습니다");
				}
				if(num==2) {
					System.out.println("비겼습니다");
				}
				System.out.println();
			}
		}
	}
}
