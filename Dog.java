public class Dog extends Animal {
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;

    public Dog(String name) {
        super(name);
        System.out.println("Родился пёс " + name);;
    }

    @Override
    void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.printf("Пёс %s - очень старался, но из %dм пробежал только %dм \n", name, distance, maxRunDistance);
        } else {
            System.out.printf("Пёс %s - пробежал %dм \n", name, distance);
        }
    }

    @Override
    void swim(int distance) {
        if (distance > maxSwimDistance) {
            System.out.printf("Пёс %s - очень старался, но проплыл только %dм \n", name, maxRunDistance);
        } else {
            System.out.printf("Пёс %s - проплыл %dм \n", name, distance);
        }
    }
}
