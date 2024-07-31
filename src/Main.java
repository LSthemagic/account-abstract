import entities.Banco;
import entities.ContaCorrente;

public class Main {
    public static void main(String[] args) {
        Banco banco =  new Banco(
                "corredor",
                new ContaCorrente(),
                "devagar",
                new ContaCorrente(),
                "lento",
                new ContaCorrente()
        );


        banco.creditar("corredor", 10000);
        banco.debitar("corredor", 5000);
        System.out.println(banco.getCorrentista("corredor"));
        banco.transferir("corredor","lento",500);
        System.out.println(banco.getCorrentista("corredor"));
        System.out.println(banco.getCorrentista("lento"));
        banco.getSaldo("devagar");

    }
}