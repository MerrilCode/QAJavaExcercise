public class Room {

private String description ="You entered the room and there are three more doors you can open.";
private Player player;
private Monster monster;


    public void setPlayer(Player player) {
        this.player = player;
    }


    public int whichDoor(int doorNumber){
        int number;
        if(doorNumber == 1){
            System.out.println("You have encountered a monster");
            monster = new Monster();
            number = 1;
            return number;
        } else if(doorNumber == 2){
            System.out.println("You have encountered a monster");
            monster = new Monster();
            number = 2;
            return number;

        }else if (doorNumber == 3) {
            System.out.println("Well Done!!! You have avoided the monsters");
             number =3;
             return number;
        } else {
            number = 0;
            return number;
        }
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Player getPlayer() {
        return player;
    }

    public String getDescription() {
        return description;
    }

}
