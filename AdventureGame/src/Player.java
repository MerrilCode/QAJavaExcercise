public class Player {
    private String name;
    private int maxLife = 20;
    private int minLife = 0;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public int getMinLife() {
        return minLife;
    }
}
