package IO;

import Shapes.Circle;

import java.io.*;

public class SerializeDeserializeApp {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Circle circle = new Circle(3,4,7);
        serialize(circle,"serialize.txt");
        System.out.println(deserialize("serialize.txt"));
    }

    static Circle deserialize(String sourceFile) throws IOException, ClassNotFoundException {
        try(InputStream fileInputStream = new FileInputStream(sourceFile)){
            ObjectInputStream deserializer = new ObjectInputStream(fileInputStream);
            Circle circle = (Circle) deserializer.readObject();
            return circle;
        }
    }

    static void serialize(Serializable toSerialize, String destFile) throws IOException {
        try(OutputStream fileOutputStream = new FileOutputStream(destFile)){
            ObjectOutputStream serializer = new ObjectOutputStream(fileOutputStream);
            serializer.writeObject(toSerialize);
        }
    }
}
