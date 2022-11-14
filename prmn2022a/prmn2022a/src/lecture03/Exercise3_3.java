package lecture03;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String b;
        int[] a = new int[2];
        for (int i = 0; i < 2; i++) {
            System.out.println(i+1+"つ目の整数を入力してください:");
            b = input.next();
            a[i] = parseInt(b,10);
        }
        int c = a[0] + a[1];
        System.out.println(a[0]+" + "+a[1]+" = "+c);

    }
}
