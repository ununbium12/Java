package chapter03.practice;

public class Tire {

    public int maxRotation; // 최대 회전 수
    public int accumulatedRotation; // 타이어 회전 수
    public String location;

    public Tire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        ++accumulatedRotation;
        if(accumulatedRotation < maxRotation) {
            System.out.println(location + "Tire 수명 : " + (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("--- " + location + " Tire 펑크 ---");
            return false;
        }
    }

}
