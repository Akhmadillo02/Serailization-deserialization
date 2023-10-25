package ObjectWrite;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectRead {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String filePath = "exportObject.txt";

        FileInputStream fileInputStream = new FileInputStream(filePath);

        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


        SerializableObject object =  (SerializableObject)  objectInputStream.readObject();
        SerializableObject object1 =  (SerializableObject)  objectInputStream.readObject();

        objectInputStream.close();
        fileInputStream.close();

        System.out.println("Object read from the to file: ");

        System.out.println(object);
        System.out.println(object1);



    }
}
