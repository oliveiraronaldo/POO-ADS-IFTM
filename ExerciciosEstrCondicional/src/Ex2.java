import java.util.Locale;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um dia da semana de 1 a 7(1- Domingo, 2- Segunda, 3- Terça, 4- Quarta, 5- Quinta, 6- Sexta, 7- Sábado");
        int dia = sc.nextInt();
        String msg;

        switch (dia) {
            case 1:
                msg = "Domingo";
                break;
            case 2:
                msg = "Segunda-Feira";
                break;
            case 3:
                msg = "Terça-Feira";
                break;
            case 4:
                msg = "Quarta-Feira";
                break;
            case 5:
                msg = "Quinta-Feira";
                break;
            case 6:
                msg = "Sexta-Feira";
                break;
            case 7:
                msg = "Sábado";
                break;
            
            default:
                msg = "Entrada inválida!";
                break;
        }

        System.out.println("Dia da semana: " + msg);

        
        sc.close();

    }
    
    
}
