package day06_08_03_2022;

public class Methods {

    public static void main(String[] args) {
        printWordNTimes("Rabia",5);
    }

    private static void printWordNTimes(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(name);
        }
    }


}
