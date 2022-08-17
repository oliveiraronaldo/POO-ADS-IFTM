import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int horas;

        System.out.print("Digite a hora atual: ");
        horas = sc.nextInt();

        if (horas >= 0 && horas < 12) {
            System.out.println("Bom dia!");
            
        } else if(horas >= 12 && horas < 18){
            System.out.println("Boa Tarde!");
            
        }else if(horas < 24){
            System.out.println("Boa noite!");
        }else{
            System.out.println("Valor inválido!");
        }


        sc.close();

    }
}
