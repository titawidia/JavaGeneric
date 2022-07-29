package bagian6.application;

import bagian6.Pair;

public class PairApp {
    public static void main(String[] args) {

        Pair<String, Integer> pair = new Pair<String, Integer>("Aera", 100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
