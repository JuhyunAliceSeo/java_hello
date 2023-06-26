import java.util.Scanner;

class Grade2 {
	   private String name;
	   private int kor, eng, math; // 인스턴트 변수

	   public Grade2(String name,int kor, int eng, int math) { //매개변수로 받아 객체를 초기화하는 생성자
	      this.name = name;
	      this.kor = kor;
	      this.eng = eng;
	      this.math = math;
	   }

	   public double getAvg() {//메서드
	 return (kor + eng + math) / 3.0;
	   }

	   public void showInfo() {//메서드 
	      System.out.println(name + "님의 평균은" + getAvg() + "성적은" + getGrade() + "입니다.");
	   }
	   
	   public char getGrade() {
	      char ch = '가';
	      double avg = getAvg();

	      if (avg >= 90) {
	         ch = '수';
	      } else if (avg >= 80) {
	         ch = '우';
	      } else if (avg >= 70) {
	         ch = '미';
	      } else if (avg >= 60) {
	         ch = '양';
	      }else {
	         ch ='가';
	      }

	      return ch;
	   }
	}

public class Java_04_scanner_practice2 {

    public static void main(String[] args) { //사용자로부터 이름과 점수를 입력받아 grade2객체를 생성하고 showinfo메서드를 호출하여 결과를 출력합니다.
        Scanner sc;
        Grade2 grade;
        int kor, eng, math;
        String name; //변수를 한번 쫙  선언함
        
        

        while (true) {
        	sc = new Scanner(System.in);
        	
        	
        	System.out.print("이름: ");
        	name = sc.nextLine();
        			
            System.out.print("국어: ");
            kor = sc.nextInt();
            
            System.out.print("영어: ");
            eng = sc.nextInt();
            
            System.out.print("수학: ");
            math = sc.nextInt();

            grade = new Grade2(name, kor, eng, math);
            
            grade.showInfo();
            


            System.out.print("계속하시겠습니까? (Yes/No): ");
            String continueChoice = sc.next();

                if(continueChoice.compareToIgnoreCase("yes")==0)
                	continue;
                else
                	break; 
            }
        }
}