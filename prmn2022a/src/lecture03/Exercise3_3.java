package lecture03;

import java.util.Scanner;

public class Exercise3_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1つめの整数を入力してください:");
        String str1 = input.nextLine();
        System.out.print("2つ目の整数を入力してください:");
        String str2 = input.nextLine();
        int a = Integer.parseInt(str1);
        int b = Integer.parseInt(str2);

        System.out.println(a+" + "+b+" = "+(a+b));
    }
}
