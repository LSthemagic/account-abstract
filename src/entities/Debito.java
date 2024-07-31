package entities;

public class Debito extends Operacao{

    public Debito(double valor) {
        super(valor);
    }

    @Override
    public double operar() {
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
        return -valor;
    }
}
