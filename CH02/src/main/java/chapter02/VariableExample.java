package chapter02;

public class VariableExample {
    public static void main(String[] args) {
        int hour = 3;
        int minutes = 5;

        System.out.println(hour + "시간 " + minutes + "분");
        int totalMinutes = (hour * 60) + minutes;
        System.out.println("total : " + totalMinutes);

        int v1 = 0;
        int v2 = 0;
        if(true) {
            // int v2 = 0; // v2는 if문 조건문 안에만 선언 되어서 빠져 나올 수 없다
            v1 = 1;
            v2 = 2;
        }
        System.out.println(v1 + v2);
    }
}
