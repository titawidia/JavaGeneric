package bagian6.application;

import bagian6.MyData;

public class WildcardApp {
    public static void main(String[] args) {

        print(new MyData<Integer>(100));
        print(new MyData<String>("Aera"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));

    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
