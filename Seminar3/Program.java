package Seminar3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User[]{new User("Василий", "Иванов", 50), 
        new User("Петр", "Петров", 22),
        new User("Герман", "Сидоров", 45),
        new User("Петр", "Георгиев", 56),
        new User("Петр", "Георгиев", 80)});
        Personal personal = new Personal(users);
        // for (User user : personal) {
        //     System.out.println(user);
        // }
        Collections.sort(users);
        System.out.println(users);
        

    }
}
