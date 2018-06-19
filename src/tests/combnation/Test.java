package tests.combnation;

public class Test {
    public static void main(String[] args) {
        int total = 100;
        int count = 1;

        for (int i = 1; i <= total; i++) {
            for (int j = i; j <= total; j++) {
                for (int k = j; k <= total; k++) {
                    for (int l = k; l <= total; l++) {
                        for (int m = l; m <= total; m++) {
                            for (int n = m; n <= total; n++) {
                                System.out.println(count + ": " + i + " " + j + " " + k + " " + l + " " + m + " " + n);
                                count++;
                            }
                        }
                    }
                }
            }
        }
    }
}
