package bagian6.application;

import bagian6.util.ArrayHelper;

public class ArrayHelperApp { // menggunakan Generic method
    public static void main(String[] args) {

        String[] names = {"Aera", "Hye", "Ren"};
        Integer[] number = {1, 2, 3, 4, 5};

        System.out.println(
                ArrayHelper.<String>count(names)
        );

        System.out.println(
                ArrayHelper.<Integer>count(number)
        );
    }
}
