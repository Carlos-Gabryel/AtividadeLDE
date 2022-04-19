import java.util.Scanner;

public class LDE {
    protected Node primeiro;
    protected Node ultimo;
    protected int qtd;

    public boolean isEmpty() {
        if (this.primeiro == null && qtd == 0 && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }
    public static void novoItem(LDE lista) {
        String codNovo;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o Codigo do novo Item:");
        System.out.println("Código :");
        codNovo = input.nextLine();
        Item novoItem = new Item(codNovo);
        lista.inserirOrdenado(novoItem);

    }
    public Node buscaSimples (Node procurar) {
        Node aux = this.primeiro;
        while (aux != null) {
            if (aux.getInfo().compareTo(procurar.getInfo()) == 0) {
                return aux;
            }

            aux = aux.getProx();
        }
        return null;
    }
    public Node buscaMelhorada(Item c){
        Node aux;
        int retorno;
        if(this.isEmpty() == true){
            return null;
        }
        else{
            aux = this.primeiro;
            while(aux != null){
                retorno = aux.getInfo().compareTo(c);
                if (retorno == 0) {
                    return aux;
                }
                else if (retorno > 0){
                    return null;
                }
                else{
                    aux = aux.getProx();
                }
            }
        }
        return null;
    }
    public void inserirOrdenado(Item c) {
        Node novo = new Node(c);
        if (this.isEmpty() == true) { // inserção na lista vazia
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (c.compareTo(this.primeiro.getInfo()) < 0) { // inserção antes do primeiro
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
        } else if (c.compareTo(this.ultimo.getInfo()) > 0) { // inserção após o último
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        } else { // inserção no meio - depois do primeiro e antes do último
            Node aux = this.primeiro;
            while (aux != null){
                int retorno = aux.getInfo().compareTo(c);
                if (retorno == 0){
                    System.out.println("Valor Repetido!");
                    return;
                }
                else if (retorno > 0){
                    Node anterior = aux.getAnt();
                    novo.setAnt(anterior);
                    novo.setProx(aux);
                    anterior.setProx(novo);
                    aux.setAnt(novo);
                    this.qtd ++;
                    System.out.println("Inserção efetuada com sucesso!");
                    return;
                }
                else {
                    aux = aux.getProx();
                }
            }
        }
    }
    public void inserirOrdenadoDec(Item c) {
        Node novo = new Node(c);
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (c.compareTo(this.primeiro.getInfo()) > 0) {
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
        } else if (c.compareTo(this.ultimo.getInfo()) < 0) {
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        } else {
            Node aux = this.primeiro;
            while (aux != null){
                int retorno = aux.getInfo().compareTo(c);
                if (retorno == 0){
                    System.out.println("Valor Repetido!");
                    return;
                }
                else if (retorno > 0){
                    Node anterior = aux.getAnt();
                    novo.setAnt(anterior);
                    novo.setProx(aux);
                    anterior.setProx(novo);
                    aux.setAnt(novo);
                    this.qtd ++;
                    System.out.println("Inserção efetuada com sucesso!");
                    return;
                }
                else {
                    aux = aux.getProx();
                }
            }
        }
    }
    public LDE intersecao(LDE lista2){
        LDE listaInter = new LDE();
        if (lista2.isEmpty()||isEmpty()){
            System.out.println("Listas vazias!");
                    return null;
        }else{
            Node auxLista1 = this.primeiro;
            Node auxLista2 = lista2.primeiro;
            while (auxLista1 != null){
                while (auxLista2 != null){
                    if (auxLista2.getInfo().compareTo(auxLista1.getInfo()) == 0){
                        listaInter.inserirOrdenado(auxLista1.getInfo());
                    }
                    auxLista2 = auxLista2.getProx();
                }
                auxLista1 = auxLista1.getProx();
                auxLista2 = lista2.primeiro;
            }
            return listaInter;
        }
    }
    public LDE diferenca(LDE lista2) {
        LDE lista = new LDE();
        if (lista2.isEmpty() || isEmpty()) {
            System.out.println("Uma das listas está vazia");
            return null;
        } else {
            Node auxLista1 = this.primeiro;

            while (auxLista1 != null) {
                if (lista2.buscaSimples(auxLista1) == null) {
                    lista.inserirOrdenado(auxLista1.getInfo());
                }

                auxLista1 = auxLista1.getProx();

            }

            return lista;
        }
    }
    public LDE uniao(LDE lista2) {
        LDE lista = new LDE();
        if (lista2.isEmpty() || isEmpty()) {
            System.out.println("Uma das listas está vazia");
            return null;
        } else {
            Node auxLista1 = this.primeiro;
            Node auxLista2 = lista2.primeiro;
            while (auxLista1 != null && auxLista2 != null) {
                lista.inserirOrdenado(auxLista1.getInfo());
                auxLista1 = auxLista1.getProx();
            }

            while (auxLista2 != null) {
                lista.inserirOrdenado(auxLista2.getInfo());
                auxLista2 = auxLista2.getProx();
            }

            return lista;

        }

    }

    public void exibirLista() {

        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem clientes cadastrados!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }

    }
}
