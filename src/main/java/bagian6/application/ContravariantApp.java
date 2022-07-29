package bagian6.application;

import bagian6.MyData;

import java.util.Objects;

public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objectMyData = new MyData<>("Aera");
        objectMyData.setData(1000);

        MyData<? super String> myData = objectMyData;

        process(objectMyData);

        System.out.println(objectMyData.getData());
    }

    public static void process(MyData<? super String> myData) {
        Object value = myData.getData();
        System.out.println("Process parameter " + value);

        myData.setData("Aera Hye Ren");
    }
}
