public class PilhaDinamica {
    Node topo;

    public PilhaDinamica() {
        this.topo = null;
    }

    public void push(char dado) {
        Node novoNo = new Node(dado);
        novoNo.setProxNo(this.topo);
        this.topo = novoNo;
    }

    public char pop() {

        if (isEmpty()) {
            System.out.println("Pilha vazia");
        }
        Node auxiliar = this.topo;
        topo = auxiliar.getProxNo();
        return auxiliar.getDado();

    }

    boolean isEmpty() {
        return (this.topo == null);
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        } else {
            Node auxiliar = this.topo;
            while (auxiliar != null) {
                System.out.println(auxiliar.getDado());
                auxiliar = auxiliar.getProxNo();
            }
        }
    }

    void verificaParenteses(String equacao, PilhaDinamica pilhaDinamica) {
        int parentesesAberto = 0;
        int parentesesFechado = 0;
        for(int i = 0 ; i < equacao.length(); i++) {
            char caracteres = pilhaDinamica.pop();
            if(caracteres == '(') {
                parentesesAberto++;
            } else if(caracteres == ')') {
                parentesesFechado++;
            }
        }
        if(parentesesAberto == parentesesFechado) {
            System.out.println("Bem");
        }
    }




}
