// Задание 1.
// Создать список целых чисел (заполнить случайными числами), удалить из списка четные числа.

import java.util.ArrayList;
import java.util.Random;
public class task1 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(20);
        Random rand = new Random();
        for(Integer i = 0; i < 20; i++) {
            list.add(rand.nextInt(100));
        }
        System.out.println("Стартовый список: ");
        System.out.println(list);
        int i = 0;
        while(i < list.size()) {
            if(list.get(i) % 2 == 0) {
                list.remove(i);
            }
            else i++;
        }
        System.out.println("Список без четных значений: ");
        System.out.println(list);
    }
  }
