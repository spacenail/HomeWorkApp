import java.util.Random;

class Cat {
    private boolean satiety;
    private int appetit;

    public Cat(){
        satiety = false;
        Random rnd = new Random();
        appetit = rnd.nextInt(21);
    }

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

}
