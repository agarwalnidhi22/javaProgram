public class PatternStar {
    public static void main(String[] args) {
        int i, j, k;
        k = 0;
        for ( i = 1; i <= 5; i++) {
            if (i <= 3) k++;
            else k--;
            for ( j = 1; j <= 5; j++) {
                if (j <= 4 - k || j >= 2 + k)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}