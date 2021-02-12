package ru.geekbrains.ntr_0301;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    // Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
    public static <T> void swap(T[] array, int a, int b) throws ArrayIndexOutOfBoundsException {
        if (a < 0 || a >= array.length || b < 0 || b >= array.length) {
            throw new ArrayIndexOutOfBoundsException(
                    String.format("Index must be in range [0..%d]", array.length - 1)
            );
        }
        if (a == b || array[a] == array[b]) return;
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    // Написать метод, который преобразует массив в ArrayList;
    public static <T> List<T> toArrayList(T[] array) {
        if (array == null) return new ArrayList<>();
        List<T> arrayList = new ArrayList((int) ((array.length + 1) * 1.5f));
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }
}
