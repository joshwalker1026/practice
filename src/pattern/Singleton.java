package pattern;

import java.util.concurrent.atomic.AtomicInteger;

public enum Singleton {

    INSTANCE;
    AtomicInteger counter=new AtomicInteger(0);
    public Singleton getInstance(){
            return INSTANCE;
    }

    public int increaseInt(){
        return counter.getAndIncrement();
    }

    public static void main(String[] args){
        Singleton s = Singleton.INSTANCE;
        System.out.println(s.increaseInt());
    }

}
