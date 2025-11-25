public class CascosInalambricos{
    
    private String nombreDispositivo;
    private int bateriaActual;
    private boolean enlazadoAOtroDispositivo;
    
    public CascosInalambricos(String nomDispositivo, int bateria){
        nombreDispositivo = nomDispositivo;
        bateriaActual = bateria;
        enlazadoAOtroDispositivo = false;
    }
    
    public String getNombreDispositivo(){
        return nombreDispositivo;    
    }
    
    public int getBateriaActual(){
        return bateriaActual;
    }
    
    public boolean getEnlazado(){
        return enlazadoAOtroDispositivo;
    }
    
    public void nombrarDispositivo(String nombre){
        nombreDispositivo = nombre;
    }
    
    public void descargaDeBateria(int bateriaGastada){
        bateriaActual = bateriaActual - bateriaGastada;
    }
    
    public void cambioDeEstado(){
        enlazadoAOtroDispositivo = !enlazadoAOtroDispositivo;
    }
    
    public void imprimirEstado(){
        String estadoEnlazado = enlazadoAOtroDispositivo ? "Sí" : "No";
        System.out.println("Nombre: " + nombreDispositivo + " | " + "Batería(%): " + bateriaActual + "%" + " | " + "Enlazado: " + estadoEnlazado);
    }
    
    public String mostrarEstado(){
        String estadoEnlazado = enlazadoAOtroDispositivo ? "Sí" : "No";
        return "Nombre: " + nombreDispositivo + " | " + "Batería(%): " + bateriaActual + "%" + " | " + "Enlazado: " + estadoEnlazado;
    }
}