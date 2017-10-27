public class Monster {

    private int monsterLife = 10;

    private Player player;
    private boolean monsterAlive = true;


    public int getMonsterLife() {
        return monsterLife;
    }

    public boolean getMonsterAlive(){
        return monsterAlive;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setMonsterLife(int monsterLife) {
        this.monsterLife = monsterLife;
    }
}
