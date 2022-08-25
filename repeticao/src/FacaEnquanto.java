import java.util.Scanner;

public class FacaEnquanto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char menu = 's';
        do {
            if (menu == 's' || menu == 'S') {
                System.out.print("Digite a temperatura em Celsius: ");
                double c = sc.nextDouble();
                double f = ((9 * c / 5) + 32);
                System.out.printf("Equivale em Fahrenheit: %.1f\n", f);
                
            } else {
                System.out.println("Digite uma opção válida!");
            }
            
            System.out.println("Deseja repetir (s/n)?");
            menu = sc.next().charAt(0);
            


        } while (menu != 'n' && menu != 'N');
        

        sc.close();
    }
    
}
