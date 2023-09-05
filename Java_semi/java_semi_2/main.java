import java.io.FileWriter;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        String s = "Hello my World!";
        byte[]b = s.getBytes();
        String[] sa = s.split("");
        System.out.println(s.replace("!", "?"));
        s += "!";
        s.lastIndexOf("l");
        System.out.println(s.substring(s.indexOf(" ", s.lastIndexOf(" "))));
        System.out.println(s);
        StringBuilder builder = new StringBuilder(s);
        builder.append("1").append("Hello World!").reverse();
        s = builder.toString();
        System.out.println(s);

        try {
            float i = 12/0f;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            FileWriter writer = new FileWriter("file.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}