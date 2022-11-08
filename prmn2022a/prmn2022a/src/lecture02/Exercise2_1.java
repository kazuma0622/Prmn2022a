package lecture02;

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("name");
        String name = input.next();
        System.out.println("age");
        int age = input.nextInt();
        Human human = new Human(name,age);
        human.print();
    }
}
