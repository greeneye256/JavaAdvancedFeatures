package IO;

import java.io.*;

public class TypeApp {

    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\User\\Documents\\calc.txt";
        typeFile(filename);
    }

    static void typeFile(String fileName) throws IOException {

        try(BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = fileReader.readLine()) != null){
                System.out.println(line);
            }
        }

//        try(Reader fileReader = new FileReader(fileName)){
//            int character = 0;
//            while ((character = fileReader.read()) != -1 ){
//                System.out.print((char) character);
//            }
//        }

    }



}
