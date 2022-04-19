package Questao4;

public class NodePessoa {
    private NodePessoa ant;
    private Pessoa info;
    private NodePessoa prox;

    public NodePessoa(Pessoa c) {
        this.info = c;
    }

    public void setAnt(NodePessoa novoAnt) {
        this.ant = novoAnt;
    }

    public void setProx(NodePessoa novoProx) {
        this.prox = novoProx;
    }

    public void setInfo(Pessoa valor) {
        this.info = valor;
    }

    public NodePessoa getAnt() {
        return this.ant;
    }

    public NodePessoa getProx() {
        return this.prox;
    }

    public Pessoa getInfo() {
        return this.info;
    }
}