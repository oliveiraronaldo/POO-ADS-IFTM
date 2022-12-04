import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        List<Contato> agenda = new ArrayList<>();
        int menu = 1;
        do {
            System.out.println("\n----------Menu----------\n(1)- Adicionar Contato \n(2)- Buscar Contato \n(3)- Remover Contato \n(4)- Editar Contato \n(0)- Sair");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("#ID");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Telefone: ");
                    String telefone = sc.nextLine();
                    System.out.println("Email: ");
                    String email = sc.nextLine();
                    Contato c = new Contato(id, nome, telefone, email);
                    agenda.add(c);
                    break;
                case 2:
                    System.out.println("Digite o id do contato: ");
                    int idBusca = sc.nextInt();
                    System.out.println(buscaContato(idBusca, agenda));
                    break;
                case 3: 
                    System.out.println("Digite o id do contato a remover: ");
                    int idRemove = sc.nextInt();
                    removeContato(idRemove, agenda);
                    break;
                case 4:
                    System.out.println("Digite o id do contato a editar: ");
                    int idEditar = sc.nextInt();
                    editarContato(idEditar, agenda);
                    break;
                case 0:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (menu != 0);
        sc.close();
    }

    public static Contato buscaContato(int id, List<Contato> agenda){
        for (Contato cont : agenda ) {
            if (cont.getId() == id) {
                return cont;
            }
        }
        System.out.println("Contato não encontrado!");
        return null;
    }

    public static boolean removeContato(int id, List<Contato> agenda){
        boolean existeContato = false;
        for (Contato cont : agenda ) {
            if (cont.getId() == id) {
                existeContato = true;
                agenda.remove(cont);
                return true;
            }
        }

        if(!existeContato){
            System.out.println("Contato não encontrado!");
            return false;
        }

        return true;
       
    }

    public static void editarContato(int id, List<Contato> agenda) {
        boolean existeContato = false;
        for (Contato cont : agenda) {
            if (cont.getId() == id) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Novo nome: ");
                String novoNome = sc.nextLine();
                System.out.println("Novo Telefone: ");
                String novoTel = sc.nextLine();
                System.out.println("Novo Email: ");
                String novoEmail = sc.nextLine();
                cont.setNome(novoNome);
                cont.setTelefone(novoTel);
                cont.setEmail(novoEmail);
                System.out.println(cont);
                existeContato = true;
            }
        }

        if(!existeContato){
            System.out.println("Contato não encontrado!");
        }
    }

}