import java.io.FileWriter;
import java.io.IOException;


public class Writer {

    public static void main(String[] args) {
        String fileName = "Sharique.txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hey,how you doing ?");
            writer.flush();
            System.out.println("File written successfully");
        } catch(IOException exception) {
            System.out.printf("Exception Occured,%s",exception.getMessage());


        }
    }
}
