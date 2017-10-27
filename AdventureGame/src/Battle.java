public class Battle {
    public boolean monsterAlive;
    public  Player player;
    public Monster monster;

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void battle(){
        monster.setMonsterLife(0);
    }
}
