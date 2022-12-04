import java.util.Scanner;

public class LivroNotas {
    
    private String nomeCurso;

    public LivroNotas(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    
    public LivroNotas() {
    }


    public void MostraMensagem(){
        System.out.println("\n\nBem vindo ao livro de notas do curso - " + this.nomeCurso);
    }

    public void CalculaMediaClasse(){
       
        Scanner sc = new Scanner(System.in);
        double media = 0;
        System.out.println("\nDigite 10 notas para calcular a média: ");
        for (int i = 0; i < 10; i++) {
            double notas = sc.nextDouble();
            if (notas < 0 || notas > 100) {
                System.out.println("A nota deve estar entre 0 e 100!");
                i = -1;
                media = 0;
                System.out.println("\nDigite 10 notas para calcular a média: ");
            }else{
                media += notas;
            }
        }
        media = media / 10;
        System.out.println("A média entre as notas é: " + media);
    }

    public char CalculaConceito(double nota){
       if (nota <= 19) {
        return 'F';
       } else if(nota <= 39) {
        return 'E';
       } else if(nota <= 59){
        return 'D';
       } else if(nota <= 79){
        return 'C';
       } else if(nota <= 94){
        return 'B';
       }else{
        return 'A';
       }

    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
}
