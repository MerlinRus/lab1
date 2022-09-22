package src.main.java.task;

public class Dog extends Animals {
public static  int count;
    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        count++;
    }
}
