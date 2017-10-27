import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Player p = new Player();
        Room r = new Room();
        Monster m = new Monster();
        Battle b = new Battle();

        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to play?: [y/n]");
        String wantsToPlay = sc.nextLine();
        if (wantsToPlay.equals("y")) {
            System.out.println("Enter your name: ");
            p.setName(sc.nextLine());
            r.setPlayer(p);
        } else if (wantsToPlay.equals("n")) {
            System.out.print("Game over");
            System.exit(0);
        }

        System.out.println("Hi " + p.getName() + " " + r.getDescription());

        System.out.println("Which door do you want to open?: [1,2,3]");
        int doorChose = sc.nextInt();
        sc.nextLine();
        int doorOpened = r.whichDoor(doorChose);
        String monsterDecision;
        if (doorOpened < 3) {
            System.out.println("Do you want to attack or run back to the room?: [attack/run]");
            monsterDecision = sc.nextLine();
            if (monsterDecision.equals("attack")) {
                b.setPlayer(p);
                b.setMonster(m);
                b.battle();
                if (m.getMonsterLife() == 0) {
                    System.out.println("Well done! you defeated the monster");
                }

            } else if (monsterDecision.equals("run")) {
                while (monsterDecision.equals("run")) {
                    System.out.println("You are back in the room.! Which door you want to open?:");
                    doorChose = sc.nextInt();
                    sc.nextLine();
                    if (r.whichDoor(doorChose) != 3) {
                        r.whichDoor(doorChose);
                        System.out.println("Do you want to attack or run back to the room?: [attack/run]");
                        monsterDecision = sc.nextLine();
                        b.setPlayer(p);
                        b.setMonster(m);
                        b.battle();
                        if (m.getMonsterLife() == 0) {
                            System.out.println("Well done! you defeated the monster");
                        }

                    } else if (r.whichDoor(doorChose) == 3) {
                        r.whichDoor(doorChose);
                    }


                }
            } else if (doorOpened == 3) {
                r.whichDoor(doorChose);

            } else {
                System.exit(0);
            }

        }
    }
}
