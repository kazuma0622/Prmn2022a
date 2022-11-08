package lecture02;

public class Human {
    String name;
    int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.println(name + age + "歳です");
        if (age <= 18) {
            System.out.println("生徒");
        }
        if(age > 18 && age <= 22){
            System.out.println("学生");
        }
    }

}