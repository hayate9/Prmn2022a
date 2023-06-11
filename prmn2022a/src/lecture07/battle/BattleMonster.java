package lecture07.battle;

import lecture07.monster.IMonster;
import lecture07.monster.Monster;

public abstract class BattleMonster extends Monster implements IBattleMonster {
    protected BattleMonster(IMonster monster){
        super(monster);
    }
    @Override
    public final void attack(int skillIndex, IMonster opponent){}
    protected void receiveDamage(int damage, IMonster opponet){}
}
