package src.main.java.task;

public class Main {
    public static void main(String[] args) {

        Animals[] animals = {
                new Cat("Кот", 200),
                new HouseCat("Вася", 100),
                new Dog("Бобих", 500, 15),
                new Tiger("Майк", 1000, 5)
        };
        for (Animals a:animals) {
            a.run(150);
            a.swim(6);

        }
        System.out.println(System.lineSeparator());
        System.out.println("Котов: " + Cat.count);
        System.out.println("Домашних котов: " + HouseCat.count);
        System.out.println("Собак: " + Dog.count);
        System.out.println("Тигров: " + Tiger.count);
        System.out.println("Животных: " + Animals.count);
        System.out.println(System.lineSeparator());
    }
}

