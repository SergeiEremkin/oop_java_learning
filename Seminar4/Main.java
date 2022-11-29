package Seminar4;

public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero("Володя",new Staff(), 150);
        Team<Archer> red = new Team<>(hero1);
        red.add(new Archer("Леголас", new LongBow(), 100, 10));
        red.add(new Archer("Робин Гуд", new Bow(), 100, 10));
        red.add(new Archer("Василий Зайцев", new Bow(), 100, 10));
        Hero hero2 = new Hero("Гимли",new Bow(), 150);
        Team<Mage> white = new Team<>(hero2);
        white.add(new Mage("Гендольф", new Staff(), 80, 15, 100));
        white.add(new Mage("Хоттабыч", new Staff(), 80, 15, 100));
        white.add(new Mage("Супермаг", new Staff(), 80, 15, 100));
        Hero hero3 = new Hero("Мастер",new Bow(), 150);
        Team<Warrior> multi = new Team<>(hero3);
        multi.add(new Mage("Гендольф", new Staff(), 80, 15, 100));
        multi.add(new Archer("Леголас", new Bow(), 100, 10));
        multi.add(new Archer("Василий Зайцев", new Bow(), 100, 10));
        System.out.println(red);
        System.out.println(white);
        System.out.println(multi);
        System.out.println(red.getTeamHealthPoint());
        System.out.println(white.getTeamHealthPoint());
        System.out.println(multi.getTeamHealthPoint());
        
    }
}
