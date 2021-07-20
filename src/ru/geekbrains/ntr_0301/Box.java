package ru.geekbrains.ntr_0301;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> boxContent = new ArrayList<>();

    public Box() {

    }

    public Box(T... items) {
        boxContent.addAll(Arrays.asList(items));
    }

    public Box(List<T> boxContent) {
        boxContent.addAll(boxContent);
    }

    public List<T> getBoxContent() {
        return boxContent;
    }

    public void add(T item) {
        boxContent.add(item);
    }

    public void addAll(List<T> items) {
        boxContent.addAll(items);
    }

    public void addAll(T ... items) {
        boxContent.addAll(Arrays.asList(items));
    }

    public void remove(T item) {
        boxContent.remove(item);
    }

    public void remove(T[] items) {
        boxContent.removeAll(Arrays.asList(items));
    }

    public void remove(List<T> items) {
        boxContent.removeAll(items);
    }

    public float getWeight() {
        float boxWeight = 0;
        for (T item : boxContent) {
            boxWeight += item.getWeight();
        }
        return boxWeight;
    }

    public int getAmount() {
        return boxContent.size();
    }

    public void pour (Box<T> box) {
        addAll(box.getBoxContent());
        box.release();
    }

    public void release () {
        boxContent.clear();
    }

    public boolean compare(Box box) {
        return getWeight() == box.getWeight();
    }


}
