package lecture07.monster;

public class HP {
    private int hp;
    private int dead = 0;

    public boolean isAlive(){
        return true;
    }

    public int getHP() {
        return this.hp;
    }

    public void setHP(int hp){
        this.hp = hp;
    }

}


