import java.util.Random;

class Cat {
    private final String name;
    private boolean satiety;
    private final int appetit;

  /*
  3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
   Если коту удалось покушать (хватило еды), сытость = true.
   */

  /*
  3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
   Если коту удалось покушать (хватило еды), сытость = true.
   */

    Cat(String name){
        this.name = name;
        satiety = false;
        Random rnd = new Random();
        appetit = rnd.nextInt(21) + 1;
    }

/*
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
 (например, в миске 10 еды, а кот пытается покушать 15-20).
 */
    void eat(Plate p){
    if(p.decreaseFood(appetit)) { satiety = true; }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                ", appetit=" + appetit +
                '}';
    }
}
