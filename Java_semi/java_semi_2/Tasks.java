public class Tasks {
    public static void main(String[] args) {

//        создать две строки, если в первой строке содержится вторая
//        строка вывести её индекс, если содержится несколько раз вывести индекс каждой

        String stringForFind = "qwe";
        String mainString = "asd qwe asd qwe";

        String[] stringArray = mainString.split(" ");

        int temp = 0;

//        do {
//            System.out.println(mainString.indexOf(stringForFind, temp));
//            temp = mainString.indexOf(stringForFind, temp) + 1;
//        } while (temp < mainString.lastIndexOf(stringForFind));


        while(mainString.indexOf(stringForFind, temp) != -1){
            System.out.println(mainString.indexOf(stringForFind, temp));
            temp = mainString.indexOf(stringForFind, temp) + 1;
        }
    }
}