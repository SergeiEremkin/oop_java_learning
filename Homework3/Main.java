package Homework3;

public class Main {
    public static void main(String[] args) {
        CustomList<User> cl = new CustomList<>();
        cl.add(new User("Валерий", "Иванов", 23));
        cl.add(new User("Лев", "Толстой", 100));
        cl.add(new User("Александр", "Пушкин", 23));
        for (Node node : cl) {
            System.out.println(node.getData());
        }
    }
}
