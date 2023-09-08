import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

import javax.swing.text.html.HTMLDocument.Iterator;
/**
 * seminar3
 */
public class seminar3 {
    /**
     * 
     */
    public static void main(String[] args) {
        Object o = new Object();
        
        ArrayList<Integer> list = new ArrayList<>();

        // list.add(1);
        // list.add(true);
        // list.add(new String[]{"1","2"});
        // list.add("str");

        // int i = (int)list.get(0);

        // if (list.get(1) instanceof Boolean) {
        //     boolean b = (boolean) list.get(1);
        // }
        
        // int i = list.get(0);
        
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add(new Random().nextInt(100));
            list2.add(new Random().nextInt(100));
        }

        System.out.println(list1);
        System.out.println(list2);
        System.out.println("-".repeat(16));

        // list1.add(2,32);
        // list2.addAll(9,list2)

        // list1.removeIf(n -> n%2!=0);

        // list1.removeAll(list2);
        // list1.retainAll(list2);
        list1.sort(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
            if(o1 % 3 != 0) return 1;
            if(02 % 2 != 0) return -1;
            return o1 - o2;
            }
            
        });

        System.out.println(list1);
        // for (int i = 0; i < list1.size(); i++) {
            // System.out.println(list1.get(i));
            // list1.set(i, 3);
            // list1.remove(i);
            // list1.add(1);
        // }
        // for (int i : list1) {
        //     System.out.println(i);
        // }
        // ListIterator<Integer> iterator = list1.iterator();
        // while (iterator.hasNext()) {
        //     int i = iterator.next();
        //     System.out.println(i);  
        //     iterator.remove();          
        // }



    }
    
}