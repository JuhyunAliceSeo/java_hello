import java.util.Scanner;

public class Java_06_string_practice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("영어 단어를 입력하세요:");
        String word = scanner.nextLine();
        
        int length = word.length(); // 글자 수 계산
        int vowelCount = 0; // 모음 개수
        int consonantCount = 0; // 자음 개수

        for (int i = 0; i < length; i++) {
            char c = word.charAt(i);
            if (isVowel(c)) {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
        
        System.out.println("총 글자 수는: " + length + "개 입니다.");
        System.out.println("모음은: " + vowelCount + "개 입니다.");
        System.out.println("자음은: " + consonantCount + "개 입니다.");
    }
    
    // 주어진 문자가 모음인지 확인하는 함수
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
