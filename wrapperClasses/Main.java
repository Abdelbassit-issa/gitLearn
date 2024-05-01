import g.GuessingGame;
import java.io.File;
import java.io.IOException;

public class Main {

    // public interface B {
    //     String run(String r);

    // }

    public static void main(String[] args) {
 File myObj = new File("../test.csv");
 try {  
     
      if (myObj.createNewFile()) {  
        System.out.println("File created: " + myObj.getName());  
      } else {  
        System.out.println("File already exists.");  
      }  
    } catch (IOException e) {

      e.printStackTrace();  
    }  
System.out.println(myObj.exists());
        // B b = (s) -> s + "!";
        // stingFormat("Hello", b);
        // GuessingGame g = new GuessingGame();
        // g.playGame();
    }

    // public static void stingFormat(String val, B b) {
    //     String result = b.run(val);
    //     System.out.println(result);
    // }
}
