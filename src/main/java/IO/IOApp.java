package IO;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class IOApp {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream defaultOutput = System.out;
        PrintStream fileOutput = new PrintStream("file.txt");

        try {
            int c = 32;
            do {
                if (c!=10){
                    System.setOut(defaultOutput);
                    System.out.println("Introduceti un caracter");
                }
                c = System.in.read();
                if (c!=10){
                    System.setOut(fileOutput);
                    System.out.println("Ati introdus " + (char) c + ". Codul ASCII este: " + c);
                }
            } while (c != 32);
        }
        catch (Exception e){
            System.err.println("Error");
        }

    }

}
