package Criacionais.singleton;

public class Single {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Singleton s1 = Singleton.getInstance(1);
        Singleton s2 = Singleton.getInstance(2);

        System.out.println("Singleton 1: "+s1.value);
        System.out.println("Singleton 2: "+s2.value);
    }
}
