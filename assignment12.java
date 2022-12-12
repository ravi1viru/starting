import static java.lang.System.out;

public class InueronPattern {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i > 0 && j == (n - 1) / 2) || (i == 0 && j <= (n - 1)) || (i == n - 1 && j <= n - 1)) {
                    out.print("*");
                } else {
                    out.print(" ");
                }
            }
            System.out.println();

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i <= (n - 1)) || i == j || (j == (n - 1) && i <= (n - 1))) {
                    out.print("*");
                } else {
                    out.print(" ");
                }
            }
            out.println();

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j <= n - 1) || (j == 0 && (i <= n - 1)) || (i == n - 1 && j <= n - 1) ||
                        (i == (n - 1) / 2 && j <= (n - 1))) {
                    out.print("*");
                } else {
                    out.print(" ");
                }
            }
            out.println();
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i <= n - 1) || (i == n - 1 && j < n - 1) || (j == n - 1 && i <= n - 1)) {
                    out.print("*");
                } else {
                    out.print(" ");
                }
            }
            out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i <= n - 1) || (i == 0 && j < ((3 * n) / 2)) || i - j == (n - 1) / 2 ||
                        (j == n - 1 && i < (n - 1) / 2) || (i == (n - 1) / 2 && j < n - 1)) {
                    out.print("*");
                } else {
                    out.print(" ");
                }
            }
            out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j <= n - 1) || (j == 0 && i <= n - 1) || (i == n - 1 && j <= n - 1) || (j == n - 1 && i <= n - 1)) {
                    out.print("*");
                } else {
                    out.print(" ");
                }
            }
            out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 && i <= (n - 1)) || i == j || (j == (n - 1) && i <= (n - 1))) {
                    out.print("*");
                } else {
                    out.print(" ");
                }
            }
            out.println();

        }
    }
}



