public class Cat extends Animal{

    public Cat(String name){
        super(name,200,-1);
        System.out.println("Родился кот " + name);
    }

    @Override
    void run(int distance) {
        if(distance > this.getMaxRunDistance()) {
            System.out.printf("Кот %s - очень старался, но из %dм пробежал только %dм \n", name,distance, getMaxRunDistance());
        } else {
            System.out.printf("Кот %s - пробежал %dм \n", name, distance);
        }
    }

    @Override
    void swim(int distance) {
        System.out.printf("Кот %s не умеет плавать(как и все кошки)\n", name);
    }
}
