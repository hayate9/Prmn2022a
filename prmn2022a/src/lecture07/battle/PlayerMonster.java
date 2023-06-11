package lecture07.battle;

import lecture07.monster.IMonster;

public class PlayerMonster extends BattleMonster {

    public PlayerMonster(IMonster monster){
        super(monster);
    }



    @Override
    public void attackOutput() {
    }

    @Override
    public void remainHpOutput() {
        getHP();
    }

    @Override
    public void skillListOutput() {

    }

    @Override
    public void winOutput() {

    }

    @Override
    public void loseOutput() {

    }

    @Override
    public int skillSelect(){
        return 0;
    }


}
