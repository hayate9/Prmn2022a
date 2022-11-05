package lecture03;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> msg = new ArrayList<>();

        System.out.print("何行分入力しますか？:");
        int n = input.nextInt();
        input.nextLine();

        for (int i = 0;i < n;i++){
            System.out.print(i+1+"行目:");
            msg.add(input.nextLine());
        }

        for (int i = 0;i < n;i++){
            System.out.println("["+i+"] "+msg.get(i));
        }
    }
}
