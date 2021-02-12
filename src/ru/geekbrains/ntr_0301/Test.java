package ru.geekbrains.ntr_0301;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        // Task 1

        Test[] array = new Test[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Test();
        }

        try {
            Arrays.swap(array, 3, 4);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---------------------------------------------");

        //Task 2

        List<Test> arrayList = Arrays.toArrayList(array);
        System.out.println(arrayList);
        System.out.println("---------------------------------------------");

        //Task 3

        Box<Apple> appleBox = new Box<>(new Apple(1.1f), new Apple(), new Apple(1.3f));
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange(2.0f), new Orange());
        if (appleBox.compare(orangeBox)) {
            System.out.println("Boxes have the same weight.");
        } else {
            System.out.println("Boxes have the different weight.");
        }

        Box<Apple> newAppleBox = new Box();
        newAppleBox.pour(appleBox);
        orangeBox.add(new Orange(1.35f));
        appleBox.addAll(new Apple() , new Apple());
        System.out.printf("Apple box: amount - %d, weight - %.3f\n", appleBox.getAmount(), appleBox.getWeight() );
        System.out.printf("New apple box: amount - %d, weight - %.3f\n" , newAppleBox.getAmount(), newAppleBox.getWeight());
        System.out.printf("Orange box: amount - %d, weight - %.3f\n" ,orangeBox.getAmount(), orangeBox.getWeight());


    }

    @Override
    public String toString() {
        return Integer.toHexString(hashCode());
    }
}
