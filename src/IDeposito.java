public interface IDeposito {
    public void mostrarCantidad();
    public boolean estaLleno();
    public boolean estaVacio();
    public int retirarCantidad(int cantidadQueQuieresQuitar);
    public int añadirCantidad(int cantidadQueQuieresAñadir);
    public int getMaxCantidad();
    public int getCantidad();
}
