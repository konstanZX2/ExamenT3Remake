public class Main {
    public static void main(String[] args) {

        DepositoTemperatura depositoTemperatura = new DepositoTemperatura(10,100,23);
        DepositoPresion depositoPresion = new DepositoPresion(10,100,30);

        depositoTemperatura.añadirCantidad(10);
        depositoTemperatura.mostrarCantidad();
    }
}
