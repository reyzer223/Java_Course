import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;

/**
 * main
 */
public class main {

    /**
     * @param args
     */
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
            writer.write(s + "\n" + "Вот!");
            writer.close();

            FileReader reader = new FileReader("file.txt");
            int c;
            while ((c = reader.read())!=-1) {
                System.out.print((char)c);
            };
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}