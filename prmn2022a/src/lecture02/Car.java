package lecture02;

public class Car {
    int fuel;

    Car(){
        this.fuel = 0;
    }

    void run(){
        if (fuel <= 0){
            System.out.println("走れませんでした。");
        }else {
            fuel -= 1;
            System.out.println("燃料を1消費して走りました。");
        }
    }
}
