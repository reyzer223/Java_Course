import java.util.ArrayList;
import java.util.List;
public class lesson_3 {
 public static void main(String[] args) {
 List<Integer> list = new ArrayList<Integer>();
 list.add(1);
 list.add(123);
 // list.add("string line");
 for (Object o : list) {
 System.out.println(o);
 // Проблема извлечения данных
 }
 }
}
