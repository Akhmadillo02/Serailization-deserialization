package ObjectWrite;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        SerializableObject object = new SerializableObject("Mansur", 444);
        System.out.println(object);
        String filePath = "exportObject.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(object);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Object has written to the file. ");
        FileReader fileReader = new FileReader(filePath);

    }
}