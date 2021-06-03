abstract class Animal {
protected String name;
private static int quantityAnimals;
private final int maxRunDistance;
private final int maxSwimDistance;

abstract void swim(int distance);
abstract void run(int distance);

protected static int getQuantityAnimals(){
    return quantityAnimals;
}

protected int getMaxRunDistance(){
    return maxRunDistance;
}
protected int getMaxSwimDistance() {
    return maxSwimDistance;
}

public Animal(String name, int maxRunDistance,int maxSwimDistance){
    this.name = name;
    quantityAnimals++;
    this.maxRunDistance = maxRunDistance;
    this.maxSwimDistance = maxSwimDistance;
}

}
