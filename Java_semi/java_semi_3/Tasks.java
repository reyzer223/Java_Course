
// Создать два целочисленных списка, заполнить случайными числами. 
// В первый список добавить все чётные числа из второго

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;


public class Tasks {
    public static void main(String[] args) {
//------------------------------------------------------------------------------------
        // Создать два целочисленных списка, заполнить случайными числами. 
        // В первый список добавить все чётные числа из второго

        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<Integer> list2 = new ArrayList<>();

        // for (int i = 0; i < 10; i++) {
        //     list1.add(new Random().nextInt(100));
        //     list2.add(new Random().nextInt(100));
        // }

        // System.out.println(list1);
        // System.out.println(list2);
        // System.out.println("-".repeat(10));

        // for (int i = 0; i < list2.size(); i++) {

        //     if(list2.get(i)%2 == 0) list1.add(list2.get(i));
        // }    
        
        // list2.removeIf(n ->n%2!=0);
        // list1.addAll(list2);

        // System.out.println(list1);

// --------------------------------------------------------------------------------------------

        // Создать два списка. Первый целочисленный, второй строковый. 
        // Заполнить первый список случайными числами. 
        // Перенести значения во второй список с приведением типа.
        
        // ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();

        // for (int i = 0; i < 10; i++) {
        //     list1.add(new Random().nextInt(100));
        //     // list2.add(String.valueOf(list1.get(i)));
        // }

        // list1.forEach(n -> String.valueOf(list2.add(String.valueOf(list1.get(n)))));

        // System.out.println(list1);
        // System.out.println("-".repeat(10));
        // System.out.println(list2);   

//--------------------------------------------------------------------------
// Создать целочисленный список, заполнить случайными числами. Развернуть список.
        // List<Integer> list1 = new ArrayList<>();
        // List<Integer> list2 = new ArrayList<>();
        // for (int i = 0; i < 10; i++) {
        //     list1.add(new Random().nextInt(100));
        // }
        // list1.forEach(n->list2.add(0,n));
        // list1 = list2;
        // System.out.println(list1);
        // System.out.println(list2);

//--------------------------------------------------------------------------

// Создать целочисленный список, найти средний по значению элемент.

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(100));
        }
        list1.sort(Comparator.naturalOrder());
        
        System.out.println(list1);
        // System.out.println(list1.get(list1.size()/2));
        double avg = list1.stream().mapToInt(n-> n).average().getAsDouble();
        // for (int i: list1) avg += i;
        // avg /= list1.size();
        System.out.println(avg);
        int el1 = list1.get(list1.size()/2);
        int el2 = list1.get(list1.size()/2+1);
        if(Math.abs(avg - el1) < Math.abs(avg - el2)){
            System.out.println(el1);
        }
        else System.out.println(el2);

    }


}

