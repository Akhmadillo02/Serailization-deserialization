package ObjectWrite;

import java.io.Serializable;

public class SerializableObject implements Serializable {

    private String name;
    private int value;

    public SerializableObject(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ObjectWrite.SerializableObject{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
