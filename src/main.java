import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        LDE ListaDeItens1 = new LDE();
        LDE ListaDeItens2 = new LDE();
        LDE ListaDeItens3 = new LDE();
        Scanner in = new Scanner(System.in);
        char op;
        do {
            exibirMenu();
            op = in.next().charAt(0);

            switch (op) {
                case '1':
                    System.out.println("===============================================");
                    System.out.println("Lista 1:");
                    ListaDeItens1.exibirLista();
                    System.out.println("===============================================");
                    System.out.println("Lista 2:");
                    ListaDeItens2.exibirLista();
                    System.out.println("===============================================");
                    System.out.println("Lista 3:");
                    ListaDeItens3.exibirLista();
                    System.out.println("===============================================");
                    break;
                case '2':
                    LDE.novoItem(ListaDeItens1);
                    break;
                case '3':
                    LDE.novoItem(ListaDeItens2);
                    break;
                case '4':
                    ListaDeItens3 = ListaDeItens1.intersecao(ListaDeItens2);
                    break;
                case '5':
                    ListaDeItens3 = ListaDeItens1.uniao(ListaDeItens2);
                    break;
                case '6':
                   ListaDeItens3 = ListaDeItens1.diferenca(ListaDeItens2);
                    break;
                case '0':
                    System.out.println("Bye bye!");
                    break;
                default:
                    System.out.println("Opção inválida, informe a opção novamente");
            }

        } while (op != '0');

    }

    public static void exibirMenu() {
        System.out.println("Opções");
        System.out.println("1 - Exibir todos os itens cadastrados");
        System.out.println("2 - Inserir na Primeira lista");
        System.out.println("3 - Inserir na Segunda lista");
        System.out.println("4 - Criar lista de interceções");
        System.out.println("5 - Criar lista de uniao");
        System.out.println("6 - Criar lista de Diferenca");
        System.out.println("0 - Sair do programa");
        System.out.print("Informe a opção desejada: ");
    }


}