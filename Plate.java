class Plate {
    private int food;

    Plate(int food){
        this.food = food;
    }

    void addFood(int food){
        this.food = food;
    }

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
