public class HomeWorkApp {
    public static void main(String[] args) {
        Animal[] animalsArray = {
                new Cat("Ship"),
                new Cat("Psh"),
                new Dog("Hey")
        };

        animalsArray[0].run(100);
        animalsArray[0].swim(100);
        animalsArray[1].run(500);
        animalsArray[2].run(350);
        animalsArray[2].swim(15);

        System.out.printf("Всего животных - %s шт. \n", Animal.getQuantityAnimals());

    }
}
