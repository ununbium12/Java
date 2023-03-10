package chapter02;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("[필수 정보 입력]");
            System.out.print("1. 이름 : ");
            String inputData = scanner.nextLine();
            System.out.print("2. 생년월일 : ");
            String dfbData = scanner.nextLine();
            System.out.print("3. 전화번호 : ");
            String PhoneData = scanner.nextLine();

            System.out.println("[입력한 내용]");
            System.out.println("1. 이름 : " + inputData);
            System.out.println("2. 생년월일 : " + dfbData);
            System.out.println("3. 전화번호 : " + PhoneData);

            if (inputData.equals("q")) {
                break;
            }
        }
        System.out.println("종료");
    }
}
