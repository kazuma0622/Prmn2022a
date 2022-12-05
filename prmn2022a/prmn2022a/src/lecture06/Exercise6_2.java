package lecture06;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();
        Scanner input = new Scanner(System.in);

        list.add(random.nextInt(6)+1);
        list.add(random.nextInt(6)+1);
        list.add(random.nextInt(6)+1);
        list.add(random.nextInt(6)+1);
        list.add(random.nextInt(6)+1);

        System.out.println("さいころを5つ振りました。");
        System.out.println("何番目のサイコロの値を確認しますか？");

        try{
            int index = input.nextInt();
            System.out.println(list.get(index-1));
        }catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました。");
            System.out.println("プログラムを終了します。");
        }catch (IllegalArgumentException e){
            System.out.println("整数以外の値が入力されました。");
            System.out.println("プログラムを終了します。");
        }
    }
}
