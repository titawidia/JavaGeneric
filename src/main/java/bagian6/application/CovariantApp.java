package bagian6.application;

import bagian6.MyData;

public class CovariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Aera");
        process(stringMyData);
    }

    public static void process(MyData<? extends  Object> myData) {
        System.out.println(myData.getData());

        // myData.setData(1); // tidak boleh karena berbahaya
    }
}
