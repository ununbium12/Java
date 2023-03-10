package chapter02;

import java.io.Serializable;
import java.util.Scanner;

public class ConditionExample {
    public static void main(String[] args) {
        int score = 85;
        // 3항 조건 연산자
        char grade = score >= 90 ? 'A' : (score >= 80) ? 'B' : 'C';
        System.out.println("grade : " + grade);

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("아이디 : ");
        String Id = scanner.nextLine();
        System.out.print("비밀번호 : ");
        int Pwd = Integer.parseInt(scanner.nextLine());
        
        if (Id.equals("java") && Pwd == 1234) {
            System.out.println("로그인 성공");
        } else {
            System.out.println("로그인 실패");
        }
    }
}
