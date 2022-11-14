package lecture03;

import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("何行分入力しますか？");
        int a = input.nextInt();
        String[] ArrayList = new String[a];
        for (int i = 0; i < a; i++) {
            System.out.println(i+1+"行目：");
            ArrayList[i] = input.next();
        }
        for (int i = 0; i < a; i++) {
            System.out.println("["+i+"]"+ArrayList[i]);
        }
    }
}
