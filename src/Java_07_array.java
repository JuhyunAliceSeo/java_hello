
public class Java_07_array {

	public static void main(String[] args) {
		//변수선언
		int[] arrLotto = new int[6];//6개 나오라는것
		
		//입력
		for(int i=0; i< arrLotto.length; i++) {
			arrLotto[i] = (int)(Math.random() * 45 + 1);//1부터 45가 변환되서 들어간다
			
			for(int j = 0;j<i/*=을 안하면 -1과 같다*/;j++) {
				if(arrLotto[i] == arrLotto[j]) {
					i--;
					break;
				}
			}
			
		}
		//출력
		for(int i=0; i< arrLotto.length; i++) {
			System.out.print(arrLotto[i] + "    ");
			//-> 중복되어 나올수 있음
		}

	}

}
