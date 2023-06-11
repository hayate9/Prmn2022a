package lecture07.monster;

import lecture07.skill.Skill;

import java.util.List;

public abstract class Monster implements IMonster {
    private String name;
    private HP hp = new HP();
    private int power;
    private int defence;
    private int speed;
    private List<Skill> skills;

    protected Monster(){} //デフォルトコンストラクタ

    protected Monster(String name, int hp, int power, int defence, int speed, List<Skill> skills){
        this.name = name;
        this.hp.setHP(hp);
        this.power = power;
        this.defence = defence;
        this.speed = speed;
        this.skills = skills;
    }

    protected Monster(IMonster monster){
    }

    public String getName(){
        return this.name;
    }

    public int getHP(){
        return this.hp.getHP();
    }

    public void setHP(int hp){
        this.hp.setHP(hp);
    }

    public int getPower(){
        return this.power;
    }

    public int getDefence(){
        return this.defence;
    }

    public boolean isAlive(){
        return true;
    }

    public abstract void attack(int skillIndex, IMonster opponent);
}
