import ClassWork2.Zoo;

public class Main {
    public static void main(String[] args) {
        // Создать интерфейс, скорость плаванья
        // Добавить новое животное, способное плавать
        // Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

        Zoo zoo = new Zoo();
        zoo.talk();
        System.out.println("run");
        zoo.run();
        System.out.println("fly");
        zoo.fly();
        System.out.println("swim");
        zoo.swim();


    }
}