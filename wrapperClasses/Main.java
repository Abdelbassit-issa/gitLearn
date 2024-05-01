import g.GuessingGame;
import java.io.File;

public class Main {

    public interface B {
        String run(String r);

    }

    public static void main(String[] args) {
File file = new File("test.csv");

System.out.println(file.exists());
        B b = (s) -> s + "!";
        stingFormat("Hello", b);
        // GuessingGame g = new GuessingGame();
        // g.playGame();
    }

    public static void stingFormat(String val, B b) {
        String result = b.run(val);
        System.out.println(result);
    }
}
