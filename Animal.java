abstract class Animal {
protected String name;
private static int quantityAnimals;

abstract void swim(int distance);
abstract void run(int distance);

protected static int getQuantityAnimals(){
    return quantityAnimals;
}

public Animal(String name){
    this.name = name;
    quantityAnimals++;
}

}
