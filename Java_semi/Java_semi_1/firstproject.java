// public class firstproject{
// import java.lang.reflect.Array;
// import java.util.Arrays;
// import java.util.Random;

// public class Main {

//     public static void main(String[] args) {

//         Random random = new Random();
//         int randomNumber = random.nextInt(2001);

//         System.out.println(randomNumber);

//         System.out.println(Integer.toBinaryString(randomNumber));
//         System.out.println(Integer.toBinaryString(randomNumber).length());

//         int byteNumber = Integer.toBinaryString(randomNumber).length();

//         // от 0 до max shrot записать все числа кратные byteNumber в массив,
//         // массив не должен превышать кол-во записанных в нём элементов

//         int[] array = new int[1];
//         int arrayCount = 0;

//         for (int i = 0; i < Short.MAX_VALUE; i++) {
//             if (i % byteNumber == 0) {
//                 array[arrayCount++] = i;
//                 int[] tempArray = new int[array.length + 1];
//                 for (int j = 0; j < array.length; j++) {
//                     tempArray[j] = array[j];
//                 }
//                 array = tempArray;
//             }
//         }

// //        System.out.println(Arrays.toString(array));

//         // SHORT min до 0 сохранить все некратные

//         int overlapCounts = 0; // Считаем кол-во совпадений

//         for (int i = Short.MIN_VALUE; i < 0; i++) {
//             if (i % byteNumber != 0) overlapCounts++;
//         }

//         int[] overlapSizeArray = new int[overlapCounts];

//         arrayCount = 0; // Счётчик индексов массива
//         for (int i = Short.MIN_VALUE; i < 0; i++) {
//             if (i % byteNumber != 0) overlapSizeArray[arrayCount++] = i;
//         }

// //        System.out.println(Arrays.toString(overlapSizeArray));

//         int sum = 0;
//         for (int i = 0; i < byteNumber; sum += i++);
// //        System.out.println(sum);

//         int[] ints = {1,2,3,4,5,6,7,8,9};
//         for (int i = 0, counter = ints.length - 1; i <= ints.length / 2; i++, counter--) {
//             System.out.println(ints[i] + " - " + ints[counter]);
//         }
        
//     }
// }