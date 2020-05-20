class TestVerificaEquacao {

    void verificaParenteses(String equacao, PilhaDinamica pilha) {
        int parentesesAberto = 0;
        int parentesesFechado = 0;
        for(int i = 0 ; i < equacao.length(); i++) {
            char caracteres = pilha.pop();
            if(caracteres == '(') {
                parentesesAberto++;
            } else if(caracteres == ')') {
                parentesesFechado++;
            }
        }
        if(parentesesAberto == parentesesFechado) {
            System.out.println("Equacao bem formada");
        } else {
            System.out.println("Equacao mal formada");
        }
    }

    void empilhamentoChar(String equacao, PilhaDinamica pilha) {
        for(int i = 0 ; i < equacao.length(); i++) {
            pilha.push(equacao.charAt(i));
        }
    }

    public static void main(String[] args) {

        PilhaDinamica pilhaDinamica = new PilhaDinamica();
        String equacao1 = "2 + 3 * (8 - 7) + 2";
        String equacao2 = "2 * 3 + (2 - 3) * (3 - 9 + 2 - 1";
        String equacao3 = "5 - 2 + ( 9 - (3 - 9) + 2) - 1) + 2";

        new TestVerificaEquacao().empilhamentoChar(equacao1, pilhaDinamica);
        new TestVerificaEquacao().verificaParenteses(equacao1, pilhaDinamica);

        new TestVerificaEquacao().empilhamentoChar(equacao2, pilhaDinamica);
        new TestVerificaEquacao().verificaParenteses(equacao2, pilhaDinamica);

        new TestVerificaEquacao().empilhamentoChar(equacao3, pilhaDinamica);
        new TestVerificaEquacao().verificaParenteses(equacao3, pilhaDinamica);



    }
}