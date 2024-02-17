package Patterns;

public class Solid_Rhombus {
    public static void main(String[] args) {
        int n = 5; // size of rhombus

        for (int i = 1; i <= n; i++) {

            for (int j = n; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
