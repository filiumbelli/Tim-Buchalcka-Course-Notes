import Packages.SeriesLibrary;

public class Main {
    public static void main(String[] args) {
        org.w3c.dom.Node node = null;
        System.out.println(SeriesLibrary.nSum(20));
        System.out.println(SeriesLibrary.factorial(5));
        for (int i = 0; i < 10; i++) {
            System.out.println(SeriesLibrary.fibonacci(i));
        }
    }
}
