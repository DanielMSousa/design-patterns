package Criacionais.singleton;

public final class Singleton {
    private static volatile Singleton instance;
    public int value;

    public Singleton(int value){
        this.value = value;
    }

    public static Singleton getInstance(int value){
        //Unsynchronized part, makes the code faster if many threads try to access the method
        //and the Singleton already exists

        Singleton result = instance;

        if(result != null){
            return result;
        }

        //this synchronized might be slower, so you'll only access it once.
        synchronized(Singleton.class){
            if(instance == null){
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}