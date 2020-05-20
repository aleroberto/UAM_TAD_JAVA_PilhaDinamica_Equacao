public class Node {
    private char dado;
    private Node proxNo;

    public Node(char dado) {
        this.dado = dado;
        this.proxNo = null;
    }

    public char getDado() {
        return this.dado;
    }

    public Node getProxNo() {
        return this.proxNo;
    }

    public void setProxNo(Node proxNo) {
        this.proxNo = proxNo;
    }

    public void setDado(char dado) {
        this.dado = dado;
    }
}