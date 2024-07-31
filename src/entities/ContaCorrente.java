package entities;

public class ContaCorrente {
    private double valor = 0;

    public void executarOperacao(Operacao opr){
        valor += opr.operar();
    }

    public double getSalarioAtual(){
        return valor;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "valor=" + valor +
                '}';
    }
}
