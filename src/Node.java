public class Node {
    private Node ant;
    private Item info;
    private Node prox;

    public Node(Item c) {
        this.info = c;
    }

    public void setAnt(Node novoAnt) {
        this.ant = novoAnt;
    }

    public void setProx(Node novoProx) {
        this.prox = novoProx;
    }

    public void setInfo(Item valor) {
        this.info = valor;
    }

    public Node getAnt() {
        return this.ant;
    }

    public Node getProx() {
        return this.prox;
    }

    public Item getInfo() {
        return this.info;
    }
}