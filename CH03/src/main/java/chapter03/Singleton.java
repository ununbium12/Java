package chapter03;

public class Singleton {

    private static Singleton singleton = new Singleton();

    // 생성자
    private Singleton() {}

    // 정적 메소드
    static Singleton getSingleton() {
        return singleton;
    }
}
