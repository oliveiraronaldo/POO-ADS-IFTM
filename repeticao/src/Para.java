public class Para {
    public static void main(String[] args) {
        int x = 4;
        int y = x + 2;
        for (int i = 0; i < x; i++) {
            System.out.println(x + " " + y);
            y += i;
        }


        System.out.println();


        for (int i = 1; i < 5; i++) {
            y = i - 1;
            x = i * 10;
            System.out.println(i);
        }

        System.out.println();

        y = 10;

        for (int i = 0; i < 4; i++) {
            System.out.print(i + " ");
            y += i;
            System.out.println(y);
        }
    }
    
}
