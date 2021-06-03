public class Dog extends Animal {

    public Dog(String name) {
        super(name, 500, 10);
        System.out.println("Родился пёс " + name);
    }

    @Override
    void run(int distance) {
        if (distance > getMaxRunDistance()) {
            System.out.printf("Пёс %s - очень старался, но из %dм пробежал только %dм \n", name, distance, getMaxRunDistance());
        } else {
            System.out.printf("Пёс %s - пробежал %dм \n", name, distance);
        }
    }

    @Override
    void swim(int distance) {
        if (distance > getMaxSwimDistance()) {
            System.out.printf("Пёс %s - очень старался, но проплыл только %dм \n", name, getMaxRunDistance());
        } else {
            System.out.printf("Пёс %s - проплыл %dм \n", name, distance);
        }
    }
}
