public class Tasks {
    public static void main(String[] args) {

//        создать две строки, если в первой строке содержится вторая
//        строка вывести её индекс, если содержится несколько раз вывести индекс каждой

        // String stringForFind = "qwe";
        // String mainString = "asd qwe asd qwe";

        // String[] stringArray = mainString.split(" ");

        // int temp = 0;

//        do {
//            System.out.println(mainString.indexOf(stringForFind, temp));
//            temp = mainString.indexOf(stringForFind, temp) + 1;
//        } while (temp < mainString.lastIndexOf(stringForFind));


        // while(mainString.indexOf(stringForFind, temp) != -1){
            // System.out.println(mainString.indexOf(stringForFind, temp));
            // temp = mainString.indexOf(stringForFind, temp) + 1;
        // }
    // }
// две строки, если вторая является вращением первой вывести "Ок"
//             String str1 = "qwe";
//             String str2 = "ewq";

//             if (new StringBuilder(str1).reverse().toString().equals(str2)) {
//                 System.out.println("OK");
//             }
//             else {
//             System.out.println("NOT OK");
//             }

// // в строке 3 + 56 = 59 заменить "=" на "равно" средствами String и StringBuilder
//             String equals = "3 + 56 = 59";
//             System.out.println(equals);
//             equals = equals.replace("=", "Равно");
//             System.out.println(equals);


//             System.out.println("-".repeat(16));
            

//             StringBuilder eq = new StringBuilder("3 + 56 = 59");
//             System.out.println(eq);
//             eq.replace(eq.indexOf("="),eq.indexOf("=") + 1 , "Равно");
//             System.out.println(eq); 


//Измерить скорость добавление к строке 1000 элементов в String и StringBuilder

            // long start = System.currentTimeMillis();
            // String s = "";
            // for (int i = 0; i < 10000; i++) {
            //     s += Character.getName(i);
            // }

            // long end = System.currentTimeMillis();
            // System.out.println(end - start);

            // long start = System.currentTimeMillis();
            // StringBuilder string  = new StringBuilder("");
            // for (int i = 0; i < 100000; i++) {
            //     string.append(Character.getName(i));
            // }

            // long end = System.currentTimeMillis();
            // System.out.println(end - start);

// Сравнить время replace String и StringBuilder

        String string = "";
        for (int i = 0; i < 100000; i++) {
            string += "a";
        }
        long start = System.currentTimeMillis();
        string.replace('a', 's');
        long end = System.currentTimeMillis();
        System.out.println(end - start);

        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            str.append("a");
        }

        start = System.currentTimeMillis();
        while (str.toString().contains("a")) {
            str.replace(str.indexOf("a"), str.indexOf("a") + 1, "s");
        }

        end = System.currentTimeMillis();
        System.out.println(end - start);

        // String string = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        // long start = System.currentTimeMillis();
        // string.replace('a', 's');
        // long end = System.currentTimeMillis();
        // System.out.println(end - start);

        // StringBuilder str = new StringBuilder("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

        // start = System.currentTimeMillis();
        // while (str.toString().contains("a")) {
        //     str.replace(str.indexOf("a"), str.indexOf("a") + 1, "s");
        // }

        // end = System.currentTimeMillis();
        // System.out.println(end - start);
        // System.out.println(str);

}
}


