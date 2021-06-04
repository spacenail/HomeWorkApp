import java.util.Random;

class Cat {
    private String name;
    private boolean satiety;
    private int appetit;

    Cat(String name){
        this.name = name;
        satiety = false;
        Random rnd = new Random();
        appetit = rnd.nextInt(21);
    }


    void eat(Plate p){
    if(p.decreaseFood(appetit)) { satiety = true; }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }
}
