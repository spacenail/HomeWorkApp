abstract class Animal {
protected String name;
private int quantityAnimals = 0;

abstract void swim(int distance);
abstract void run(int distance);

protected int getQuantityAnimals(){
    return quantityAnimals;
}

Animal(String name){
    this.name = name;
    quantityAnimals++;
}

}
