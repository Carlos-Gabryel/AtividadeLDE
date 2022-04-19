public class RemoverLivro extends LDE {

    public int removerLivroOrdenado(LDE lista, String cod) {
        Item temp = new Item(cod);
        Node ant;
        Node prox;
        int count = 0;

        if (isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            Node aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().compareTo(temp) == 0) {
                    prox = aux.getProx();
                    ant = aux.getAnt();
                    prox.setAnt(ant);
                    ant.setProx(prox);
                    this.qtd--;
                    aux = ant;
                    count++;
                }
                aux = aux.getProx();
            }

        }

        return count;
    }

    public int remover(LDE lista, String cod) {
        Item temp = new Item(cod);
        Node ant;
        Node prox;
        int count = 0;

        if (isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            Node aux = this.primeiro;
            int resultCompareTo = aux.getInfo().compareTo(temp);
            while (aux != null) {

                if (resultCompareTo > 0) {
                    return count;
                } else if (resultCompareTo == 0) {
                    while (resultCompareTo == 0) {
                        prox = aux.getProx();
                        ant = aux.getAnt();
                        prox.setAnt(ant);
                        ant.setProx(prox);
                        this.qtd--;
                        aux = ant;
                        count++;
                        aux = aux.getProx();
                        resultCompareTo = aux.getInfo().compareTo(temp);
                    }
                    return count;
                } else {
                    aux = aux.getProx();
                }
            }

        }

        return count;
    }

}
