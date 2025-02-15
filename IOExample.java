import java.io.*;

public class IOExample {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/input.txt"));

            BufferedWriter writer = new BufferedWriter(new FileWriter("src/newoutput.txt"));

            String line;
            while ((line = reader.readLine()) != null){
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
