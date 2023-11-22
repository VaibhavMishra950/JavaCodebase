import java.io.*;
import java.util.Scanner;

public class CH24_FileHandling {
    public static void main(String[] args) {
        // Creating a File
        File f1 = new File("sample.txt");   // File Object
        try {
            f1.createNewFile();     // Creates new file
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Writing to a file
        try {
            // FileWriter Object. Will create file if not found.
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello Guys.\nThis is s sample file.\nNamed as sample.txt");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Reading a file
        try {
            Scanner fsc = new Scanner(f1);
            System.out.println("Contents of file `" + f1.getName() + "`: ");
            while (fsc.hasNextLine()){
                System.out.println(fsc.nextLine());
            }
            fsc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        // Deleting a file
        Scanner sc = new Scanner(System.in);
        System.out.print("Delete `" + f1.getName() + "` [Y/N]: ");
        switch (sc.next()) {
            case "y", "Y" -> {
                if (f1.delete()){
                    System.out.println("Deleted Successfully!");
                }
            }
        }


    }
}
