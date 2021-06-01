public class Cat extends Animal{
    private int maxRunDistance = 200;

    public Cat(String name){
        super(name);
    }

    @Override
    void run(int distance) {
        if(distance > maxRunDistance) {
            System.out.printf("Кот %s - очень старался, но пробежал только %dм \n", name, maxRunDistance);
        } else {
            System.out.printf("Кот %s - пробежал %dм \n", name, distance);
        }
    }

    @Override
    void swim(int distance) {
        System.out.printf("Кот %s не умеет плавать(как и все кошки)\n", name);
    }
}
