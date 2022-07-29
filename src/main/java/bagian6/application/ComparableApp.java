package bagian6.application;

import java.util.Arrays;

public class ComparableApp {
    public static void main(String[] args) {

        Person[] people = {
                new Person("Aera", "Indonesia"),
                new Person("Jaem", "Indonesia"),
                new Person("Mark", "Indonesia")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people));
    }
}
