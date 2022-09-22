package src.main.java.task;

public abstract class Animals {
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    public static int count;

    public Animals(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        count++;
    }
    public void run(int distance) {
        if (maxRun >= distance) {
            this.maxRun = maxRun;
            System.out.println(name + " Пробежал " + distance);
        } else {
            System.out.println(name  +" Не может пробежать такую дистанцию: " + distance);}
        }
    public void swim(int distance) {
        if (maxSwim >= distance) {
            this.maxSwim = maxSwim;
            System.out.println(name + " Проплыл " + distance);
        } else {
            System.out.println(name +" Не может проплыть такую дистанцию: " + distance );}
        }
}
