package lecture01;

public class Kadai5 {
    public static void main(String[] args) {
        int[] score = {41,85,72,38,80};
        int min = min(score);
        int max = max(score);
        double average = average(score);

        for (int i = 0;i < score.length;i++){
            if (score[i] >= 90){
                System.out.println(i+"番　"+score[i]+"点　秀");
            } else if (score[i] >= 80) {
                System.out.println(i+"番　"+score[i]+"点　優");
            } else if (score[i] >= 70) {
                System.out.println(i+"番　"+score[i]+"点　良");
            } else if (score[i] >=60) {
                System.out.println(i+"番　"+score[i]+"点　可");
            } else {
                System.out.println(i+"番　"+score[i]+"点　不可");
            }
        }
        System.out.println("最高点:"+max+"点");
        System.out.println("最低点:"+min+"点");
        System.out.println("平均点:"+average+"点");
    }

    static int min(int a[]){
        int min = a[0];

        for(int i = 0;i < a.length;i++){
            if (min > a[i]){
                min = a[i];
            }
        }
        return min;
    }

    static int max(int a[]){
        int max = a[0];

        for (int i = 0;i < a.length;i++){
            if (max < a[i]){
                max = a[i];
            }
        }
        return max;
    }

    static double average(int a[]){
        double ave = 0;

        for (int i = 0;i < a.length;i++){
            ave += (double)a[i] / a.length;
        }
        return ave;
    }
}
