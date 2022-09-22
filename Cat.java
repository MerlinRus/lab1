package src.main.java.task;

public class Cat extends Animals {
    public static int count;

    public Cat(String name, int maxRun) {
        super(name, maxRun, 0);
        count++;
    }
}

