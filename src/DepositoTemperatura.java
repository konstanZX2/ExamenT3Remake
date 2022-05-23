public class DepositoTemperatura extends Deposito {



    private int temperatura;


    public DepositoTemperatura(int cantidad, int maxCantidad, int temperatura) {
        super(cantidad, maxCantidad);
        this.temperatura = temperatura;
    }
    public int getTemperatura() {
        return temperatura;
    }

    public void mostrarTemperatura(){

        System.out.println(temperatura);

    }
}
