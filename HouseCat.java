package src.main.java.task;

public class HouseCat extends Animals {
public static int count;
    public HouseCat(String name, int maxRun) {
        super(name, maxRun, 0);
        count++;
    }
}
