package chapter03;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car("쉐보레", "red", 400);

        System.out.println("제작회사 : "+ car.company);
        System.out.println("모델명 : "+ car.model);
        System.out.println("색상 : "+ car.color);
        System.out.println("최고속도 : "+ car.maxSpeed);
        System.out.println("현재속도 : "+ car.speed);

        car.speed = 60;
        System.out.println("수정된 속도 : "+ car.speed);
    }
}
