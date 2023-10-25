package java_Json;

import ObjectWrite.SerializableObject;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;

public class WriteToJson {

    public static void main(String[] args) throws IOException {

        SerializableObject serializableObject = new SerializableObject("Ahmadillo",777);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String result = gson.toJson(serializableObject);
        System.out.println(result);
        writeToFile(result);
        System.out.println("yozildi");
        System.out.println();
        redFromFile();
    }

    private static void writeToFile(String s) throws IOException,FileNotFoundException {

        String filename = "JsonOutput";

        FileOutputStream fileOutputStream = new FileOutputStream(filename);
        fileOutputStream.write(s.getBytes());

        fileOutputStream.close();


    }

    private static void redFromFile() throws IOException {

//        FileInputStream fileInputStream = new FileInputStream("JsonOutput");

        FileReader fileReader = new FileReader("JsonOutput");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String s = "";
        StringBuilder res = new StringBuilder();
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
            res.append(s);
        }
        Gson gson = new Gson();
        SerializableObject serializableObject = gson.fromJson(res.toString(), SerializableObject.class);
        System.out.println("natija :" + serializableObject);

    }
}
