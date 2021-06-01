public class Cat extends Animal{
    private int maxRunDistance = 200;
    @Override
    void run(int distance) {
        if(distance > maxRunDistance) {
            System.out.printf("%s - очень старался, но пробежал только %dм \n", name, maxRunDistance);
        } else {
            System.out.printf("%s - пробежал %dм \n", name, distance);
        }
    }

    @Override
    void swim(int distance) {
        System.out.printf("Кот %s утонул :( - кошки не умеют плавать...", name);
    }
}
