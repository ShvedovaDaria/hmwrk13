package homework13;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        // Завдання 1: Використовуючи ListIterator, збільшимо значення на 1 та виведемо список.
        List<Integer> numbers1 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);

        ListIterator<Integer> listIterator = numbers1.listIterator();
        while (listIterator.hasNext()) {
            int currentValue = listIterator.next();
            listIterator.set(currentValue + 1);
        }

        System.out.println("Завдання 1: Використовуючи ListIterator:");
        for (int number : numbers1) {
            System.out.println(number);
        }

        // Завдання 2: Використовуючи Iterator, збільшимо значення на 1 та виведемо список.
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);

        Iterator<Integer> iterator = numbers2.iterator();
        int count = 0;
        while (iterator.hasNext()) {
           numbers2.set(count++, iterator.next()+1);
        }

        System.out.println("Завдання 2: Використовуючи Iterator:");
        for (int number : numbers2) {
            System.out.println(number);
        }
    }
}