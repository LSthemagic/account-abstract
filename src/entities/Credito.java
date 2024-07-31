package entities;

public class Credito extends Operacao{

    public Credito(double valor) {
        super(valor);
    }

    @Override
    public double operar() {
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero");
        }
        return valor;
    }
}
