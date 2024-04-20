package src.state_pattern;

public class Teste {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Context c1 = new Context();
        System.err.println("State 1: "+c1.returnName());
        c1.nextState();
        System.err.println("State 2: "+c1.returnName());
        c1.nextState();
        System.err.println("State 3: "+c1.returnName());
        c1.nextState();
        System.err.println("State 4: "+c1.returnName());
    }
}
