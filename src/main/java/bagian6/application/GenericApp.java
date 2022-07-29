package bagian6.application;

import bagian6.MyData;

public class GenericApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Aera");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);

    }
}
