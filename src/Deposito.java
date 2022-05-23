public class Deposito   implements IDeposito{


    private int cantidad;
    private int maxCantidad;

    public Deposito(int cantidad, int maxCantidad) {
        this.cantidad = cantidad;
        this.maxCantidad = maxCantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    private void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMaxCantidad() {
        return maxCantidad;
    }








    public int añadirCantidad(int cantidadQueQuieresAñadir){
        if (getMaxCantidad()>=getCantidad()+cantidadQueQuieresAñadir){
            setCantidad(cantidadQueQuieresAñadir+getCantidad());
            //es mejor hacer cantidad=cantidadQueQuieresAñadir+getCantidad();

        }
        else{
            System.out.println("Lo siento bro tu deposito no puede tener tanto kekw asi, que no he podido añadir mas");
        }
        //
        return getCantidad();
    }

    public int retirarCantidad(int cantidadQueQuieresQuitar){
        if(0<getCantidad() -cantidadQueQuieresQuitar){
           cantidad=getCantidad()-cantidadQueQuieresQuitar;
        }
        else{
            System.out.println("Lo siento bro tu deposito no puede tener tan poco kekw asi, que no he podido quitar nah");
        }
        return cantidad;
    }

    public boolean estaVacio(){
        if(cantidad == 0){
            System.out.println("Esta vacio");
        return true;
    }
        else
            System.out.println("No esta vacio");
            return false;
    }

    public boolean estaLleno(){
        if (cantidad == maxCantidad){
            System.out.println("TA LLENIIIIIIIIIISIMO COLEGA");
            return true;

        }else
            System.out.println("No ta lleno campeon");
            return false;
    }



    public void mostrarCantidad(){
        System.out.println(cantidad);
    }

}