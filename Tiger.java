package src.main.java.task;

public class Tiger extends Animals {
    public static  int count;
    public Tiger(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        count++;
    }
}
