package lecture06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Exercise6_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> dice = new ArrayList<>();
        for (int i = 0;i < 5;i++){
            dice.add(random.nextInt(1, 6));
        }
        try{
            System.out.println("さいころを5つ振りました.");
            System.out.println("何番目のさいころの値を確認しますか？");
            int n = input.nextInt();
            System.out.println(n+"番目: "+ dice.get(n));
        }catch (IndexOutOfBoundsException e){
            System.out.println("ArrayListの範囲外アクセスを確認しました.");
            System.out.println("プログラムを終了します.");
        }
    }
}
