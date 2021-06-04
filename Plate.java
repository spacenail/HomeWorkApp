class Plate {
    private int food;

    Plate(int food){
        this.food = food;
    }

    /*
    5. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
     */

    void addFood(int food){
        this.food +=food;
    }

    /*
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
 (например, в миске 10 еды, а кот пытается покушать 15-20).
 */

    boolean decreaseFood(int food) {
        if (this.food >= food) {
            this.food -= food;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
