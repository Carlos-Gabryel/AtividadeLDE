package Questao4;

public class MetodosQuestao4 {

    protected NodePessoa ultimo;
    protected NodePessoa primeiro;
    protected int qtd;

    public boolean isEmpty() {

        if (this.primeiro == null && qtd == 0 && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void separarPorGenero(MetodosQuestao4 womanList, MetodosQuestao4 manList){
        Pessoa pessoaInserir;
        String rg, nome;
        int idade;
        char genero;
        double peso, altura;
        NodePessoa aux = this.primeiro;
        while(aux != null){
            pessoaInserir = aux.getInfo();
            rg = pessoaInserir.getRg();
            nome = pessoaInserir.getNome();
            idade = pessoaInserir.getIdade();
            genero = pessoaInserir.getGenero();
            peso = pessoaInserir.getPeso();
            altura = pessoaInserir.getAltura();
            pessoaInserir = new Pessoa(rg, nome, idade, genero, peso, altura);
            if(aux.getInfo().getGenero() == 'F'){
                pessoaInserir = new Pessoa(rg, nome, idade, genero, peso, altura);
                womanList.inserirDesordenado(aux.getInfo());
            }else{
                pessoaInserir = new Pessoa(rg, nome, idade, genero, peso, altura);
                manList.inserirDesordenado(aux.getInfo());
            }
            aux = aux.getProx();
        }

        this.primeiro = null;
        this.ultimo = null;
        this.qtd = 0;
    }
    public void inserirOrdenado(Pessoa c) {
        NodePessoa novo = new NodePessoa(c);
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
        } else {
            NodePessoa aux = this.primeiro;
            int result;
            while (aux != null) {
                result = c.compareTo(aux.getInfo());

                if (result == 0) {
                    return;
                } else if (result < 0) {
                    novo.setAnt(aux.getAnt());
                    novo.setProx(aux);
                    aux.getAnt().setProx(novo);
                    aux.setAnt(novo);
                    this.qtd++;
                    return;
                }
                aux = aux.getProx();
            }
        }
    }
    public void inserirDesordenado(Pessoa c) {
        NodePessoa novo = new NodePessoa(c);
        if (this.isEmpty() == true) { // inserção na lista vazia
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        } else if (c.compareTo(this.primeiro.getInfo()) <= 0) { // inserção antes do primeiro
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
        } else if (c.compareTo(this.ultimo.getInfo()) > 0) { // inserção após o último
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        } else {
            NodePessoa aux = this.primeiro;
            int result;
            while (aux != null) {
                result = c.compareTo(aux.getInfo());

                if (result <= 0) {
                    novo.setAnt(aux.getAnt());
                    novo.setProx(aux);
                    aux.getAnt().setProx(novo);
                    aux.setAnt(novo);
                    this.qtd++;
                    return;
                }
                aux = aux.getProx();
            }
        }
    }
    public void exibirLista() {

        NodePessoa aux;
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