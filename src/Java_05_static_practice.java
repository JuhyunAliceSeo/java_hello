class Accumulator{
	private static int sum = 0;
	
	static void add(int i) {
		sum += i;
	}
	public static void showResult() {
		System.out.println("sum : " + sum);
	
	}
	
	
}


public class Java_05_static_practice {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++)
            Accumulator.add(i); // 전달되는 값을 모두 누적

    Accumulator.showResult(); // 최종 누적 결과를 출력

	}
	String str1 = "dakjfivnlwe";
	

}
