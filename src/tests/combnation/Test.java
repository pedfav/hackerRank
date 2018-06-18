package tests.combnation;

public class Test {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = i; j <= 3; j++) {
                for (int k = j; k <= 3; k++) {
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
    }
}
