package chapter02;

import java.util.Scanner;

public class BanksExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean run = false;

        System.out.println("-----------------------------");
        System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
        System.out.println("-----------------------------");

        System.out.print("선택> ");

        int totel = 0;
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());

            switch (num) {
                case 1:
                    System.out.print("예금액> ");
                    totel += Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("출금액> ");
                    int withdrawal = Integer.parseInt(scanner.nextLine());
                    if(totel < 0) {
                        System.out.println("잔액이 부족합니다.");
                    } else if (totel < withdrawal) {
                        System.out.println("출금액이 부족합니다.");
                    } else {
                        totel -= withdrawal;
                    }
                    break;
                case 3:
                    System.out.println("잔고> " + totel);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("Invalid input");
                    break;
            }
            System.out.println("-----------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-----------------------------");
            System.out.print("선택> ");
        }
    }
}
