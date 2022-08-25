import java.util.Locale;

public class Enquanto {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        int x = 5;
        int y = 0;

        while (x > 2) {
            System.out.println(x + " " + y);
            y+=x;
            x-=1;
        }
    }
}
