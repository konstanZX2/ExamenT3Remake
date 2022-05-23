public abstract class Deposito   implements IDeposito{


    private int cantidad;
    private int maxCantidad;

    public Deposito(int cantidad, int maxCantidad) {
        this.cantidad = cantidad;
        this.maxCantidad = maxCantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMaxCantidad() {
        return maxCantidad;
    }

    public void setMaxCantidad(int maxCantidad) {
        this.maxCantidad = maxCantidad;


    }



    public int añadirCantidad(int cantidadQueQuieresAñadir){
        if (getMaxCantidad()>=getCantidad()+cantidadQueQuieresAñadir){
            setCantidad(cantidadQueQuieresAñadir+getCantidad());


        }
        else if (getMaxCantidad()<getCantidad()+cantidadQueQuieresAñadir){
            System.out.println("Lo siento bro tu deposito no puede tener tanto kekw asi, que no he podido añadir mas");
        }

        return getCantidad();
    }

    public void mostrarCantidad(){
        System.out.println(getCantidad());
    }

}