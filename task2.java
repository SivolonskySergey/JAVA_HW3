
// Задание 2:
// Создать список целых чисел (заполнить случайными числами).
// Найти минимальное, максимальное и среднее из этого списка.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task2 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(35, 47, 40, 25, 56, 16, 17, 89, 71, 10));
        Collections.sort(list);
        System.out.println(list);
        System.out.printf("Наименьшее значение - %s", list.get(0));
        System.out.println();
        System.out.printf("Наибольшее значение - %s", list.get(list.size() - 1));
        System.out.println();

        int count = 0;
        for (Integer i = 0; i <= list.size() - 1; i++) {
            count += list.get(i);
        }
        int midVal = count / list.size();
        System.out.println("Среднее значение - " + midVal);
    }
    
  }
