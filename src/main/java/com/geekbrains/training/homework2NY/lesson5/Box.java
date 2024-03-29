package com.geekbrains.training.homework2NY.lesson5;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> boxFruit;

    public Box() {
        prepareBox();
    }

    private void prepareBox() {
        boxFruit = new ArrayList<>();
    }

    public boolean addFruitToBox(T addFruit) {
        boxFruit.add(addFruit);
        return true;
    }

    public float getWeight() {
        if (boxFruit.size() > 0) {
            return boxFruit.size() * boxFruit.get(0).weightFruit;
        }
        return 0.0f;
    }

    public boolean compare(Box<? extends Fruit> anyBox) {
        return Math.abs(this.getWeight() - anyBox.getWeight()) < 0.0001f;
    }

    // пересыпать коробку саму в себя равносильно отсутствию действия
    public boolean BoxToBox(Box<T> inBox) {
        if (!(this == inBox)) {
            for (T fruit : boxFruit) {
                inBox.addFruitToBox(fruit);
            }
            boxFruit.clear();
        }
        return true;
    }

}
