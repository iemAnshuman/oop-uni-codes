import java.io.*;

public class Exp88 {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader("student.txt");
            br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            // why not working without io exception handling?
            // it worked without exception handling so why specifically io exception handling?
            try {
                br.close();
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
