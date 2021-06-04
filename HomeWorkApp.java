class HomeWorkApp {
    public static void main(String[] args) {
        Plate plate = new Plate(20);
        System.out.println(plate.toString());
        Cat[] cat = {
                new Cat("Basil"),
                new Cat("Kis"),
                new Cat("Us"),
                new Cat("Sh")
        };
        for (int i = 0; i < cat.length; i++) {
            cat[i].eat(plate);
            System.out.println(cat[i].toString());
        }
    }
}
