import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        LivroNotas livro = new LivroNotas("POO");  
        
        livro.MostraMensagem();
        livro.CalculaMediaClasse();

        System.out.print("\n\nDigite uma nota para calcular o conceito: ");
        Scanner sc = new Scanner(System.in);
        double nota = sc.nextDouble();

        System.out.println(livro.CalculaConceito(nota));

        sc.close();
    }
}
