package chapter03;

public class SingletonExample {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        Singleton s2 = Singleton.getSingleton();

        if (s1 == s2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
