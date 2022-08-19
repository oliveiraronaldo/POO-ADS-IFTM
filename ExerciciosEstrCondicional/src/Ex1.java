import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos: ");
        double minutos = sc.nextDouble();
        double valor = 50;

        if(minutos < 0){
            System.out.println("Valor inválido para minutos!");
        }else if(minutos > 100){
            valor += (minutos - 100) * 2;
            System.out.printf("Valor da conta = R$%.2f \n", valor);
        }else{
            System.out.printf("Valor da conta = R$%.2f \n", valor);
        }

        
        sc.close();

    }
}