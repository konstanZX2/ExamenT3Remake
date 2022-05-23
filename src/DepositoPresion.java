public class DepositoPresion extends Deposito {



    private int presion;


    public DepositoPresion(int cantidad, int maxCantidad, int presion) {
        super(cantidad, maxCantidad);
        this.presion = presion;
    }
    public int getPresion() {
        return presion;
    }

    public void mostrarPresion(){
        System.out.println(presion);
    }
}
